package org.vanderlande.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.Alert;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class AlertRepository implements PanacheRepository<Alert> {

}