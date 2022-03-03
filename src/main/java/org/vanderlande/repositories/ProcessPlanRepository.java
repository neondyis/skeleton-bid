package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.ProcessPlan;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProcessPlanRepository implements PanacheRepository<ProcessPlan>{

}