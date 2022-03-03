package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.UldProductAllocation;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UldProductAllocationRepository implements PanacheRepository<UldProductAllocation>{

}