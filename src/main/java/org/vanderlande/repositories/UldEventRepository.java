package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.UldEvent;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UldEventRepository implements PanacheRepository<UldEvent>{

}