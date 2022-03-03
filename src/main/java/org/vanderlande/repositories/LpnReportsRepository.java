package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.LpnReport;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class LpnReportsRepository implements PanacheRepository<LpnReport> {

}