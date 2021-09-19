package com.kakaopay.voc.api.application;

import com.kakaopay.voc.api.domain.assignment.Assignment;
import com.kakaopay.voc.api.domain.assignment.AssignmentRepository;
import com.kakaopay.voc.api.domain.question.Question;
import com.kakaopay.voc.exception.AlreadyAssignmentExcepion;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AssignmentService {

    private final AssignmentRepository assignmentRepository;

    public List<Question> getNonAssignment(){
        return assignmentRepository.findAllByNonAssignment();
    }

    public List<Assignment> getAssignment(String counselorId){
        return assignmentRepository.findAllByCounselorIdOrderByCreatedAtDesc(counselorId);
    }

    synchronized public void create(Assignment assignment){
        assignmentRepository.findByQuestionId(assignment.getQuestion().getId()).orElse(
           assignmentRepository.save(assignment)
        );
        throw new AlreadyAssignmentExcepion("이미 담당자가 지정된 문건입니다");
    }

}
