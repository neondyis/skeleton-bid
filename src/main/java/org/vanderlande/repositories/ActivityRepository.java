package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.Activity;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class ActivityRepository implements PanacheRepository<Activity> {

}