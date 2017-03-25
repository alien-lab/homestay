package com.homestay.repository;

import com.homestay.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 慧慧姐 on 2017/3/24.
 */
public interface OrderRepository extends JpaRepository<Order,Long> {
}
