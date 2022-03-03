package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.ProductAllocation;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProductAllocationRepository implements PanacheRepository<ProductAllocation>{

}