package com.kakaopay.voc.api.presentation.request.answer;

import com.kakaopay.voc.api.domain.answer.Answer;
import com.kakaopay.voc.api.domain.counselor.Counselor;
import com.kakaopay.voc.api.domain.question.Question;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AnswerRequestDto {

    private Long questionId;
    private String counselorId;
    private String content;

    public Answer toEntity(){
        return Answer.builder()
                .question(Question.builder().id(questionId).build())
                .counselor(Counselor.builder().id(counselorId).build())
                .content(content)
                .build();
    }
    
}
