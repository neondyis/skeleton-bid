package org.vanderlande.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.ProcessPlanDefinition;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProcessPlanDefinitionRepository implements PanacheRepository<ProcessPlanDefinition> {

}