package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.BatchTaskStation;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class BatchTaskStationRepository implements PanacheRepository<BatchTaskStation> {

}