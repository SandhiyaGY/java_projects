package com.projects.Festibill.repository;


import com.projects.Festibill.entity.Festival;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FestivalRepository
        extends JpaRepository<Festival,Long> {
}