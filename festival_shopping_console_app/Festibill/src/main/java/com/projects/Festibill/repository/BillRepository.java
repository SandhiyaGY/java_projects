package com.projects.Festibill.repository;


import com.projects.Festibill.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository
        extends JpaRepository<Bill,Long> {
}