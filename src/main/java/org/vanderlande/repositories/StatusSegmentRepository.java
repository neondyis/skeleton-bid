package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.StatusSegment;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StatusSegmentRepository implements PanacheRepository<StatusSegment>{

}