package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.PhysicalClass;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class PhysicalClassRepository implements PanacheRepository<PhysicalClass> {

}