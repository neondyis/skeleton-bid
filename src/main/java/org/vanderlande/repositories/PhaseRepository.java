package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.Phase;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class PhaseRepository implements PanacheRepository<Phase> {

}