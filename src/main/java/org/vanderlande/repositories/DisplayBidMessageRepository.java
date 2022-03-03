package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.DisplayBidMessage;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class DisplayBidMessageRepository implements PanacheRepository<DisplayBidMessage> {

}