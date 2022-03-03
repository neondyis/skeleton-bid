package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.UldCategoryActivity;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UldCategoryActivitiesRepository implements PanacheRepository<UldCategoryActivity>{

}