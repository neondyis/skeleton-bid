package org.vanderlande.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.BagDataException;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class BagDataExceptionRepository implements PanacheRepository<BagDataException> {

}