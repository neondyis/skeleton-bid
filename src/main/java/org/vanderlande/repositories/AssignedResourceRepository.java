package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.AssignedResource;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class AssignedResourceRepository implements PanacheRepository<AssignedResource> {

}