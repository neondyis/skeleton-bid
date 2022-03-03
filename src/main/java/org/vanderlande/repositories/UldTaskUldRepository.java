package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.UldTaskUld;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UldTaskUldRepository implements PanacheRepository<UldTaskUld>{

}