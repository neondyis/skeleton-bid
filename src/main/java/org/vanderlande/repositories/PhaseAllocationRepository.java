package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.PhaseAllocation;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class PhaseAllocationRepository implements PanacheRepository<PhaseAllocation> {

}