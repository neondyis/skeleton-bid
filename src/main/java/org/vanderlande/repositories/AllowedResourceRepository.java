package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.AllowedResource;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class AllowedResourceRepository implements PanacheRepository<AllowedResource> {

}