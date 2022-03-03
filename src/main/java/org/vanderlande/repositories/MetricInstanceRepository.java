package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.MetricInstance;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class MetricInstanceRepository implements PanacheRepository<MetricInstance> {

}