package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.UldCategory;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UldCategoriesRepository implements PanacheRepository<UldCategory>{

}