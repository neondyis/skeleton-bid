package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.BatchTask;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class BatchTaskRepository implements PanacheRepository<BatchTask> {

}