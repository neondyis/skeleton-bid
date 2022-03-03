package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.BagData;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class BagDataRepository implements PanacheRepository<BagData> {

}