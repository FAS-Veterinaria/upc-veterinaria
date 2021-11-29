package com.example.veterinaria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface DateRepository extends JpaRepository<Date, Long> {
}
