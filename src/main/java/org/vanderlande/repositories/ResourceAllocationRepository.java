package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.ResourceAllocation;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ResourceAllocationRepository implements PanacheRepository<ResourceAllocation>{

}