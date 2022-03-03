package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.StationAvailability;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StationAvailabilitiesRepository implements PanacheRepository<StationAvailability>{

}