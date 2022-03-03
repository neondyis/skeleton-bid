package org.vanderlande.repositories;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.vanderlande.models.DisplayConfiguration;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class DisplayConfigurationRepository implements PanacheRepository<DisplayConfiguration> {
//    public List<OdbOutputOverviewDetailsDto> outputOverviewDetailsTest() {
//        return findAll()
////                .filter("")
////                .filter()
////                .filter()
////                .filter()
//                .project(OdbOutputOverviewDetailsDto.class).stream().collect(Collectors.toList());
//    }
}