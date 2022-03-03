package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.PhysicalBag;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class PhysicalBagRepository implements PanacheRepository<PhysicalBag> {

}