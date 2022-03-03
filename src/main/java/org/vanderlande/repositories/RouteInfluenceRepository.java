package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.RouteInfluence;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RouteInfluenceRepository implements PanacheRepository<RouteInfluence>{

}