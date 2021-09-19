package com.kakaopay.voc.api.presentation.response.question;

import com.kakaopay.voc.api.domain.question.Question;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class QuestionResponseDto {

    private Long questionId;
    private String customerId;
    private String title;
    private String content;


    public QuestionResponseDto(Question question){
        this.questionId = question.getId();
        this.customerId = question.getCustomerId();
        this.title = question.getTitle();
        this.content = question.getContent();
    }

    public static QuestionResponseDto create(Question question){
        return new QuestionResponseDto(question);
    }
}
