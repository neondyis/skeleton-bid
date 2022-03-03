package org.vanderlande.services.graphqi.Fetchers;

import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.vanderlande.models.BidConfig;
import org.vanderlande.repositories.BidConfigRepository;

import javax.inject.Inject;
import javax.transaction.Transactional;

@GraphQLApi
public class BidConfigFetcher {
    @Inject
    BidConfigRepository bidConfigRepository;

    @Mutation("newConfig")
    @Transactional
    public BidConfig newConfig(BidConfig config){
//        config.id = bidConfigRepository.count()+1;
        bidConfigRepository.persist(config);
        return config;
    }
}
