package org.vanderlande.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.AlertConfiguration;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class AlertConfigurationRepository implements PanacheRepository<AlertConfiguration> {

}