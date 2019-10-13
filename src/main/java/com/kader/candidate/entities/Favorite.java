package com.kader.candidate.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
@Data
@Entity
@AllArgsConstructor @NoArgsConstructor
public class Favorite implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String favKey;
    private String favValue;
    @JsonIgnore
    @OneToMany(mappedBy="favorite",fetch=FetchType.EAGER)
    private Collection<Candidate> condidates;

}
