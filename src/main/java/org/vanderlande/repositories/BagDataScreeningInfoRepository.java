package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.BagDataScreeningInfo;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class BagDataScreeningInfoRepository implements PanacheRepository<BagDataScreeningInfo> {

}