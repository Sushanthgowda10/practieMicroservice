package com.sk.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sk.entity.Shopping;

public interface ShoppingRepo extends JpaRepository<Shopping, String> {

}
