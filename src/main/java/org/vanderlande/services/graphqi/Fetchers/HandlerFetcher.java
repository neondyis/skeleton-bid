package org.vanderlande.services.graphqi.Fetchers;

import io.smallrye.graphql.api.Context;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;
import org.eclipse.microprofile.graphql.Source;
import org.vanderlande.models.Handler;
import org.vanderlande.repositories.HandlerRepository;
import org.vanderlande.services.graphqi.Filters.HandlerFilter;

import javax.inject.Inject;
import java.util.List;


@GraphQLApi
public class HandlerFetcher {
    @Inject
    HandlerRepository repository;

    @Inject
    Context context;

    @Query("allHandlers")
    public List<Handler> getAllHandlers(@Source Handler handler){
        return repository.listAll();
    }

    @Query("allHandlersFilter")
    public List<Handler> findWithFilter(@Name("filter") HandlerFilter filter) {
        return repository.findByCriteria(filter);
    }
}
