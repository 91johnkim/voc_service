package com.kakaopay.voc.api.application;

import com.kakaopay.voc.api.domain.question.Question;
import com.kakaopay.voc.api.domain.question.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<Question> findAll(){
       return questionRepository.findAll();
    }

    public void create(Question question){
        questionRepository.save(question);
    }

}
