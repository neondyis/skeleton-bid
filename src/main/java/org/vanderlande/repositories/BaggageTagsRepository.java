package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.BaggageTag;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class BaggageTagsRepository implements PanacheRepository<BaggageTag> {

}