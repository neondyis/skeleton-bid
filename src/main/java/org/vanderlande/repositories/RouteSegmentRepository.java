package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.RouteSegment;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RouteSegmentRepository implements PanacheRepository<RouteSegment>{

}