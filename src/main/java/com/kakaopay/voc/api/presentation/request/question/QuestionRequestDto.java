package com.kakaopay.voc.api.presentation.request.question;

import com.kakaopay.voc.api.domain.question.Question;
import lombok.Getter;

@Getter
public class QuestionRequestDto {

    private String customerId;
    private String title;
    private String content;

    public Question toEntity(){
        return Question.builder()
                .customerId(customerId)
                .title(title)
                .content(content)
                .build();
    }

}
