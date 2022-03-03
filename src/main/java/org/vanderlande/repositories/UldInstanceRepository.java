package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.UldInstance;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UldInstanceRepository implements PanacheRepository<UldInstance>{

}