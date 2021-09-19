package com.kakaopay.voc.api.presentation.response.assignment;

import com.kakaopay.voc.api.domain.assignment.Assignment;
import com.kakaopay.voc.api.domain.question.Question;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class NonAssignmentResponseDto {

    private Long questionId;
    private String title;
    private String content;
    private LocalDateTime createdAt;

    public NonAssignmentResponseDto(Question question){
        this.questionId = question.getId();
        this.title = question.getTitle();
        this.content = question.getContent();
        this.createdAt = question.getCreatedAt();
    }

    public static NonAssignmentResponseDto create(Question question){
        return new NonAssignmentResponseDto(question);
    }

}
