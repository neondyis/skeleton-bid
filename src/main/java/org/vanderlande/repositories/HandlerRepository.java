package org.vanderlande.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.Handler;
import org.vanderlande.services.graphqi.Filters.HandlerFilter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@ApplicationScoped
public class HandlerRepository implements PanacheRepository<Handler> {
    @Inject
    EntityManager em;

    public List<Handler> findByCriteria(HandlerFilter filter) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Handler> criteriaQuery = builder.createQuery(Handler.class);
        Root<Handler> root = criteriaQuery.from(Handler.class);
        Predicate predicate = null;
        if (filter.getId() != null)
            predicate = filter.getId().generateCriteria(builder, root.get("id"));

        if (predicate != null)
            criteriaQuery.where(predicate);

        return em.createQuery(criteriaQuery).getResultList();
    }
}
