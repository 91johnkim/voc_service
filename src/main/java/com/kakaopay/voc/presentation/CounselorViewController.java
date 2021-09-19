package com.kakaopay.voc.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/counselors")
public class CounselorViewController {

    @GetMapping("/non-assignment")
    public String nonAssignment(){
        return "counselors/non-assignment";
    }

    @GetMapping("/assignment")
    public String assignment(){
        return "counselors/assignment";
    }


}
