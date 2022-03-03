package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.BagDataXml;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class BagDataXmlRepository implements PanacheRepository<BagDataXml> {

}