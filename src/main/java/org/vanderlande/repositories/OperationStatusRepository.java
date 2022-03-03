package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.OperationStatus;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class OperationStatusRepository implements PanacheRepository<OperationStatus> {

}