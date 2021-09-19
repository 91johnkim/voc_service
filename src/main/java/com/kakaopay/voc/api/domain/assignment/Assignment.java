package com.kakaopay.voc.api.domain.assignment;


import com.kakaopay.voc.api.domain.BaseEntity;
import com.kakaopay.voc.api.domain.counselor.Counselor;
import com.kakaopay.voc.api.domain.question.Question;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Getter
@NoArgsConstructor
@Entity
public class Assignment extends BaseEntity {

    @Id
    private Long id;

    @OneToOne
    @JoinColumn(name="question_id", referencedColumnName = "id", nullable = false)
    private Question question;

    @OneToOne
    @JoinColumn(name="counselor_id", referencedColumnName = "id", nullable = false)
    private Counselor counselor;

    @Builder
    public Assignment(Long id ,Question question, Counselor counselor){
        this.id = id;
        this.question = question;
        this.counselor = counselor;
    }

}

