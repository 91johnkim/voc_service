package com.kakaopay.voc.api.domain.answer;

import com.kakaopay.voc.api.domain.BaseEntity;
import com.kakaopay.voc.api.domain.counselor.Counselor;
import com.kakaopay.voc.api.domain.question.Question;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Answer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name="counselor_id", referencedColumnName = "id", nullable = false)
    private Counselor counselor;

    @OneToOne
    @JoinColumn(name="question_id", referencedColumnName = "id", nullable = false)
    private Question question;

    @Column
    private String content;

    @Builder
    public Answer(Question question , Counselor counselor, String content){
        this.question = question;
        this.counselor = counselor;
        this.content = content;
    }

}
