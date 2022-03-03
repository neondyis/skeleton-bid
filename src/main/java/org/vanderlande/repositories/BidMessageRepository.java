package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.BidMessage;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class BidMessageRepository implements PanacheRepository<BidMessage> {

}