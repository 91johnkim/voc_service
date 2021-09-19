package com.kakaopay.voc.api.domain.counselor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kakaopay.voc.api.domain.BaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Getter
@NoArgsConstructor
@Entity
public class Counselor extends BaseEntity {

    @Id
    private String id;

    @JsonIgnore
    @Column(nullable = false)
    private String password;

    @Column(length = 50, nullable = false)
    private String name;


    @Builder
    public Counselor(String id, String password , String name){
        this.id = id;
        this.password = password;
        this.name = name;
    }

}
