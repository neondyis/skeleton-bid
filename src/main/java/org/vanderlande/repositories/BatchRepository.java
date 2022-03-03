package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.Batch;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class BatchRepository implements PanacheRepository<Batch> {

}