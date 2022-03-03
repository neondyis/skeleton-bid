package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.StationType;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StationTypeRepository implements PanacheRepository<StationType>{

}