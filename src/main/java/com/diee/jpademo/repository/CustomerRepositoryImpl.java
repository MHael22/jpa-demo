package com.diee.jpademo.repository;

import com.diee.jpademo.model.Customer;
import com.diee.jpademo.model.OrderDetail;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CustomerRepositoryImpl implements BaseRepository<Customer, Integer> {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Customer findWithGraph(Integer id, String graphName) {

        EntityGraph entityGraph = entityManager.getEntityGraph(graphName);
        Map<String, Object> properties = new HashMap<>();
        properties.put("javax.persistence.fetchgraph", entityGraph);
        Customer customer = entityManager.find(Customer.class, id, properties);

        return customer;
    }
}
