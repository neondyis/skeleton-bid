package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.RouteInfluenceTrigger;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RouteInfluenceTriggerRepository implements PanacheRepository<RouteInfluenceTrigger>{

}