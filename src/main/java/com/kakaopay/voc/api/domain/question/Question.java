package com.kakaopay.voc.api.domain.question;


import com.kakaopay.voc.api.domain.BaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Question extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String customerId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Builder
    public Question(Long id , String customerId , String title, String content){
        this.id = id;
        this.customerId = customerId;
        this.title = title;
        this.content = content;
    }

}
