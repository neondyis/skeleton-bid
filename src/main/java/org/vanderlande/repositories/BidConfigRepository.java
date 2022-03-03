package org.vanderlande.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.BidConfig;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BidConfigRepository implements PanacheRepository<BidConfig> {

}
