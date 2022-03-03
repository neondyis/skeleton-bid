package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.BagTraceSummaryValue;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class BagTraceSummaryValueRepository implements PanacheRepository<BagTraceSummaryValue> {

}