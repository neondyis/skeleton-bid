package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.BagSource;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class BagSourcesRepository implements PanacheRepository<BagSource> {

}