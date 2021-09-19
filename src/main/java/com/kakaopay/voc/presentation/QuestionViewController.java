package com.kakaopay.voc.presentation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/questions")
public class QuestionViewController {

    @GetMapping
    public String list(){
        return "questions/list";
    }

    @GetMapping("/add")
    public String add(){
        return "questions/add";
    }

}
