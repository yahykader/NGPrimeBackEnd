package com.kader.candidate.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Proxy(lazy = true)
public class Candidate implements Serializable {
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date naissance;
    private String gender;
    @ManyToOne
    private Favorite favorite;


    public String toString() {
        return "Candidate :" + this.id +
                " : name :" + this.name +
                ", naissance :" + this.naissance+
                ", gender :" + this.gender;
    }

}
