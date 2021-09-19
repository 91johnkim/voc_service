package com.kakaopay.voc.api.presentation.request.assignment;

import com.kakaopay.voc.api.domain.assignment.Assignment;
import com.kakaopay.voc.api.domain.counselor.Counselor;
import com.kakaopay.voc.api.domain.question.Question;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AssignmentRequestDto {

    private Long questionId;
    private String counselorId;

    public Assignment toEntity(){
        return Assignment.builder()
                .question(Question.builder().id(questionId).build())
                .counselor(Counselor.builder().id(counselorId).build())
                .build();
    }
}
