package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.BagTraceEvent;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class BagTraceEventsRepository implements PanacheRepository<BagTraceEvent> {

}