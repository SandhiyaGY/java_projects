package com.projects.Festibill.controller;

import com.projects.Festibill.entity.Festival;
import com.projects.Festibill.repository.FestivalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/festivals")
@RequiredArgsConstructor
public class FestivalController {

    private final FestivalRepository repository;

    @PostMapping
    public Festival save(
            @RequestBody Festival festival){

        return repository.save(festival);
    }

    @GetMapping
    public List<Festival> getAll(){

        return repository.findAll();
    }
}