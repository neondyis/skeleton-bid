package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.StatusSegmentStatusDom;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StatusSegmentStatusDomRepository implements PanacheRepository<StatusSegmentStatusDom>{

}