package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.DisplayRemoteStation;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;


@ApplicationScoped
public class DisplayRemoteStationRepository implements PanacheRepository<DisplayRemoteStation> {
    @Inject
    EntityManager em;


//    public List outputOverviewDetailsTest (){
//        return findAll().project(OdbOutputOverviewDetailsDtoTwo.class).list();
//    }
//
//    public List<OdbOutputOverviewDetailsDtoTwo> outputOverviewDetailsTesty(){
//        // query
//        CriteriaBuilder builder = em.getCriteriaBuilder();
//
//        CriteriaQuery<OdbOutputOverviewDetailsDtoTwo> query = builder.createQuery(OdbOutputOverviewDetailsDtoTwo.class);
//        Root<OdbStationsEntity> STN = query.from(OdbStationsEntity.class);
//
//        // all joins needed for the output stations.
//        Join<OdbStationsEntity,OdbDisplayRemoteStationsEntity> DRS = STN.join(OdbStationsEntity_.odbDisplayRemoteStationsById);
//        Join<OdbDisplayRemoteStationsEntity, OdbDisplayConfigurationsEntity> DCS = DRS.join(OdbDisplayRemoteStationsEntity_.odbDisplayConfigurationsByDcsId);
//        Join<OdbStationsEntity, OdbLogisticStepsEntity> LSP = STN.join(OdbStationsEntity_.odbLogisticStepsByLspId);
//        Join<OdbLogisticStepsEntity, OdbHandlingAreasEntity> HAA = LSP.join(OdbLogisticStepsEntity_.odbHandlingAreasByHaaId);
//        Join<OdbStationsEntity, OdbStationAvailabilitiesEntity> SAY = STN.join(OdbStationsEntity_.odbStationAvailabilitiesById);
//        Join<OdbStationAvailabilitiesEntity, OdbStationAvailabilityDomEntity> SAM = SAY.join(OdbStationAvailabilitiesEntity_.odbStationAvailabilityDomBySamId);
//
//        Join<OdbStationsEntity,OdbNodesEntity> NDE = STN.join(OdbStationsEntity_.odbNodesById);
//        Join<OdbNodesEntity,OdbRouteSegmentsEntity> RST = NDE.join(OdbNodesEntity_.odbRouteSegmentsById);
//        Join<OdbRouteSegmentsEntity,OdbNodesEntity> NDE_ONE_HOP = RST.join(OdbRouteSegmentsEntity_.odbNodesByNdeIdEnd);
//
//        Join<OdbNodesEntity,OdbStationsEntity> STN_ONE_HOP = NDE_ONE_HOP.join(OdbNodesEntity_.odbStationsByStnId, JoinType.LEFT);
//        Join<OdbStationsEntity,OdbStationAvailabilitiesEntity> SAY_ONE_HOP = STN_ONE_HOP.join(OdbStationsEntity_.odbStationAvailabilitiesById,JoinType.LEFT);
//        Join<OdbStationAvailabilitiesEntity,OdbStationAvailabilityDomEntity> SAM_ONE_HOP = SAY_ONE_HOP.join(OdbStationAvailabilitiesEntity_.odbStationAvailabilityDomBySamId,JoinType.LEFT);
//        Join<OdbNodesEntity, OdbRouteSegmentsEntity> RST_ONE_HOP = NDE_ONE_HOP.join(OdbNodesEntity_.odbRouteSegmentsById,JoinType.LEFT);
//
//        Join<OdbRouteSegmentsEntity, OdbNodesEntity> NDE_TWO_HOP = RST_ONE_HOP.join(OdbRouteSegmentsEntity_.odbNodesByNdeIdEnd,JoinType.LEFT);
//        Join<OdbNodesEntity,OdbStationsEntity> STN_TWO_HOP = NDE_TWO_HOP.join(OdbNodesEntity_.odbStationsByStnId,JoinType.LEFT);
//        Join<OdbStationsEntity,OdbStationAvailabilitiesEntity> SAY_TWO_HOP = STN_TWO_HOP.join(OdbStationsEntity_.odbStationAvailabilitiesById,JoinType.LEFT);
//        Join<OdbStationAvailabilitiesEntity,OdbStationAvailabilityDomEntity> SAM_TWO_HOP = SAY_TWO_HOP.join(OdbStationAvailabilitiesEntity_.odbStationAvailabilityDomBySamId,JoinType.LEFT);
//
//        Expression<Long> vehicle_STN_AVAILABLE = builder.selectCase()
//                .when(builder.isNotNull(STN_ONE_HOP.get(OdbStationsEntity_.id)),
//                        SAM_ONE_HOP.get(OdbStationAvailabilityDomEntity_.indConsiderAvailable))
//                .otherwise(SAM_TWO_HOP.get(OdbStationAvailabilityDomEntity_.indConsiderAvailable)).as(Long.class);
//
//        Subquery<Timestamp> elapsed_TIME_MILLISECONDS = query.subquery(Timestamp.class);
//        Root<OdbPackagesEntity> subqueryRoot = elapsed_TIME_MILLISECONDS.from(OdbPackagesEntity.class);
//        Expression<Timestamp> PAE = builder.least(subqueryRoot.get(OdbPackagesEntity_.dateDelivered));
//
//        elapsed_TIME_MILLISECONDS.select(PAE).having(builder.between(subqueryRoot.get(OdbPackagesEntity_.dateDelivered),builder.currentTimestamp(),PAE));
//
//        Join<OdbPackagesEntity,OdbPhysicalBagsEntity> PBG = subqueryRoot.join(OdbPackagesEntity_.odbPhysicalBagsById);
//
//        elapsed_TIME_MILLISECONDS.where(builder.and(
//                builder.equal(subqueryRoot.get(OdbPackagesEntity_.STN_ID_LAST_PROCESSED),STN.get(OdbStationsEntity_.ID)),
//                builder.greaterThan(subqueryRoot.get(OdbPackagesEntity_.DATE_DELIVERED), builder.selectCase()
//                        .when(builder.isNotNull(STN_ONE_HOP.get(OdbStationsEntity_.id)),
//                                SAY_ONE_HOP.get(OdbStationAvailabilitiesEntity_.dateModified))
//                        .otherwise(SAY_TWO_HOP.get(OdbStationAvailabilitiesEntity_.dateModified)).as(Date.class))));
//
//
//        Subquery<Long> bags_DELIVERED = query.subquery(Long.class);
//        Root<OdbPackagesEntity> sqRoot = bags_DELIVERED.from(OdbPackagesEntity.class);
//        Join<OdbPackagesEntity,OdbPhysicalBagsEntity> PBG_sq = subqueryRoot.join(OdbPackagesEntity_.odbPhysicalBagsById);
//
//        bags_DELIVERED.select(builder.count(sqRoot));
//
//        bags_DELIVERED.where(builder.and(
//                builder.equal(sqRoot.get(OdbPackagesEntity_.STN_ID_LAST_PROCESSED),STN.get(OdbStationsEntity_.ID)),
//                builder.greaterThan(sqRoot.get(OdbPackagesEntity_.DATE_DELIVERED), builder.selectCase()
//                        .when(builder.isNotNull(STN_ONE_HOP.get(OdbStationsEntity_.id)),
//                                SAY_ONE_HOP.get(OdbStationAvailabilitiesEntity_.dateModified))
//                        .otherwise(SAY_TWO_HOP.get(OdbStationAvailabilitiesEntity_.dateModified)).as(Date.class))));
//
//        query.multiselect(
//                        HAA.get(OdbLogisticStepsEntity_.ID),
//                        DCS.get(OdbDisplayConfigurationsEntity_.ID_EXT),
//                        STN.get(OdbStationsEntity_.ID),
//                        STN.get(OdbStationsEntity_.DESCRIPTION),
//                        SAM.get(OdbStationAvailabilityDomEntity_.IND_CONSIDER_AVAILABLE),
//                vehicle_STN_AVAILABLE,
//                        bags_DELIVERED,
//                        elapsed_TIME_MILLISECONDS
//                );
//
//        return em.createQuery(query).getResultList();
//    }

}