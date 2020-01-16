package io.github.madushanka.pos.dao.custom;


import io.github.madushanka.pos.dao.CrudDAO;
import io.github.madushanka.pos.entity.Order;

public interface OrderDAO extends CrudDAO<Order, Integer> {

    int getLastOrderId() ;

    boolean existsByCustomerId(String customerId) ;

}
