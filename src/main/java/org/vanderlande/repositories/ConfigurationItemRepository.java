package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.ConfigurationItem;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class ConfigurationItemRepository implements PanacheRepository<ConfigurationItem> {

}