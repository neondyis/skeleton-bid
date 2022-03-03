package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.Family;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class FamiliesRepository implements PanacheRepository<Family> {

}