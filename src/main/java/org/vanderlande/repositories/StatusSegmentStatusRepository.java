package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.StatusSegmentStatus;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StatusSegmentStatusRepository implements PanacheRepository<StatusSegmentStatus>{

}