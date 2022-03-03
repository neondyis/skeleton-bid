package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.UldPhaseAllocation;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UldPhaseAllocationRepository implements PanacheRepository<UldPhaseAllocation>{

}