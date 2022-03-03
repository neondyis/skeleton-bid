package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.Package;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class PackageRepository implements PanacheRepository<Package> {

}