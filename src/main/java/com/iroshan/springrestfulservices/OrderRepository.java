package com.iroshan.springrestfulservices;

import org.springframework.data.jpa.repository.JpaRepository;
interface OrderRepository extends JpaRepository<Order, Long> {
}