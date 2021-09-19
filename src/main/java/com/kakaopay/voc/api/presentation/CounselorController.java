package com.kakaopay.voc.api.presentation;

import com.kakaopay.voc.api.application.AnswerService;
import com.kakaopay.voc.api.application.AssignmentService;
import com.kakaopay.voc.api.presentation.request.answer.AnswerRequestDto;
import com.kakaopay.voc.api.presentation.request.assignment.AssignmentRequestDto;
import com.kakaopay.voc.api.presentation.response.assignment.AssignmentResponseDto;
import com.kakaopay.voc.api.presentation.response.assignment.NonAssignmentResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/voc/counselors")
public class CounselorController {

    private final AssignmentService assignmentService;
    private final AnswerService answerService;


    @GetMapping("/non-assignment")
    public List<NonAssignmentResponseDto> getNonAssignment(){
        return assignmentService.getNonAssignment().stream().map(it -> NonAssignmentResponseDto.create(it)).toList();
    }

    @GetMapping("/assignment")
    public List<AssignmentResponseDto> getAssignment(){
        String counselorId= "id";
        return assignmentService.getAssignment(counselorId).stream().map(it ->AssignmentResponseDto.create(it)).toList();
    }

    @PostMapping("/assignment")
    public void createAssignment(@RequestBody AssignmentRequestDto requestDto){
        assignmentService.create(requestDto.toEntity());
    }

    @PostMapping("/answer")
    public void createAnswer(@RequestBody AnswerRequestDto requestDto){
        answerService.create(requestDto.toEntity());
    }


}

