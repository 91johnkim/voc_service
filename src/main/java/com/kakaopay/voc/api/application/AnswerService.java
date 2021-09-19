package com.kakaopay.voc.api.application;

import com.kakaopay.voc.api.domain.answer.Answer;
import com.kakaopay.voc.api.domain.answer.AnswerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnswerService {
    private final AnswerRepository answerRepository;

    synchronized public void create(Answer answer){
        answerRepository.save(answer);
    }
}
