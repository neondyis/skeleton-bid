package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.RouteInfluenceUsage;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RouteInfluenceUsageRepository implements PanacheRepository<RouteInfluenceUsage>{

}