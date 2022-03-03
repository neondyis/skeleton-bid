package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.Uld;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UldRepository implements PanacheRepository<Uld>{

}