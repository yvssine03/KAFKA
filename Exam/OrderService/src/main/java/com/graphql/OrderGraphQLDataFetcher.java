package com.graphql;

import com.Model.Order;
import com.Repository.OrderRepository;
import graphql.schema.DataFetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderGraphQLDataFetcher {
    @Autowired
    private OrderRepository orderRepository;

    public DataFetcher<List<Order>> getAllOrdersFetcher() {
        return dataFetchingEnvironment -> orderRepository.findAll();
    }
}
