package com.kader.candidate;

import com.kader.candidate.entities.Candidate;
import com.kader.candidate.entities.Favorite;
import com.kader.candidate.repository.CandidateRepository;
import com.kader.candidate.repository.FavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Stream;

@SpringBootApplication
public class CandidateApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CandidateApplication.class, args);
    }

    @Autowired
    private FavoriteRepository favoriteRepository;
    @Autowired
    private CandidateRepository  candidateRepository;


    @Override
    public void run(String... args) throws Exception {
        Favorite f1=favoriteRepository.save(new Favorite(null,"Sport","Rugby",null));
        Favorite f2=favoriteRepository.save(new Favorite(null,"Voyage","Avion",null));
        Favorite f3=favoriteRepository.save(new Favorite(null,"Cinéma","Flim...",null));
        Favorite f4=favoriteRepository.save(new Favorite(null,"Lecture","Thratre",null));

        candidateRepository.save(new Candidate(null,"Abdelkader",new Date(), "H",f1));
        candidateRepository.save(new Candidate(null,"Nesrine",new Date(), "H",f2));
        candidateRepository.save(new Candidate(null,"Yacine",new Date(), "H",f3));
        candidateRepository.save(new Candidate(null,"Mounir",new Date(), "H",f4));

        favoriteRepository.findAll().forEach(f->{
            System.out.println(f.toString());
        });

    }
}
