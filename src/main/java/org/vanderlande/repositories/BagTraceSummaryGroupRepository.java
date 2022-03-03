package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.BagTraceSummaryGroup;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class BagTraceSummaryGroupRepository implements PanacheRepository<BagTraceSummaryGroup> {

}