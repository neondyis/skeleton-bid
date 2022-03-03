package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.MetricSubject;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class MetricSubjectRepository implements PanacheRepository<MetricSubject> {

}