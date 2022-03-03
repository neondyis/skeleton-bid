package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.StationBidMessage;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StationBidMessageRepository implements PanacheRepository<StationBidMessage>{

}