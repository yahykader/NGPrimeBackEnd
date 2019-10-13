package com.kader.candidate.controller;

import com.kader.candidate.entities.Candidate;
import com.kader.candidate.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping(value="api/candidates/")
public class CandidatesController {


    @Autowired
    private CandidateRepository candidateRepository;
    @GetMapping(value="getAllCandidates")
    public List<Candidate> getAllCandidates(){
       return  candidateRepository.findAll();
    }
}
