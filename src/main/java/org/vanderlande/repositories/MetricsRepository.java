package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.Metric;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class MetricsRepository implements PanacheRepository<Metric> {

}