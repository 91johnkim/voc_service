package com.kakaopay.voc.api.presentation;

import com.kakaopay.voc.api.application.QuestionService;
import com.kakaopay.voc.api.presentation.request.question.QuestionRequestDto;
import com.kakaopay.voc.api.presentation.response.question.QuestionResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/voc/questions")
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping("/list")
    public List<QuestionResponseDto> list(){
        List<QuestionResponseDto> list =  questionService.findAll().stream().map(it ->QuestionResponseDto.create(it)).toList();
        System.out.println(list.size());
        return list;
    }

    @PostMapping
    public void register(@RequestBody QuestionRequestDto requestDto){
        questionService.create(requestDto.toEntity());
    }




    // list get questionResponse ( questionId , title, cusomterId , 답변확인 )

    // question (질문등록) post  questionRequest

    // 답변 조회 (question id , customer id) answerResponse

}
