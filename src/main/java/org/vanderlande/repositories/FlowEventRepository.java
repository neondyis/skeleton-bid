package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.FlowEvent;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class FlowEventRepository implements PanacheRepository<FlowEvent> {

}