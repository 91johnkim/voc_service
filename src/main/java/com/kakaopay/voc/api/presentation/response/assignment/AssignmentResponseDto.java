package com.kakaopay.voc.api.presentation.response.assignment;

import com.kakaopay.voc.api.domain.assignment.Assignment;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class AssignmentResponseDto {

    private Long questionId;
    private String title;
    private String content;
    private LocalDateTime assignmentedAt;

    public AssignmentResponseDto(Assignment assignment){
        this.questionId = assignment.getQuestion().getId();
        this.title = assignment.getQuestion().getTitle();
        this.content = assignment.getQuestion().getContent();
        this.assignmentedAt = assignment.getCreatedAt();
    }

    public static AssignmentResponseDto create(Assignment assignment){
        return new AssignmentResponseDto(assignment);
    }

}
