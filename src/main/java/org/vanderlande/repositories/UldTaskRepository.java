package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.UldTask;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UldTaskRepository implements PanacheRepository<UldTask>{

}