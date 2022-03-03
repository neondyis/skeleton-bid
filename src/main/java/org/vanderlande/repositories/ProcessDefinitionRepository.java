package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.ProcessDefinition;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class ProcessDefinitionRepository implements PanacheRepository<ProcessDefinition> {

}