package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.HandlingAreaStatus;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class HandlingAreaStatusesRepository implements PanacheRepository<HandlingAreaStatus> {

}