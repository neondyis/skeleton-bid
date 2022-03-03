package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.MetricSubjectInstance;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class MetricSubjectInstanceRepository implements PanacheRepository<MetricSubjectInstance> {

}