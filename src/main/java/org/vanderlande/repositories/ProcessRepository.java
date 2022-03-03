package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.Process;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class ProcessRepository implements PanacheRepository<Process> {

}