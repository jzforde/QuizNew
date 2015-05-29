package org.biz.xml;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class QuizController
{
    @RequestMapping("/start.do")
    public ModelAndView start()
    {
        Quiz q = new QuizEngine();
        return new ModelAndView("startQuiz.jsp", "thisQuiz", q);
    }
    
    @RequestMapping("/start2.do")
    public String start2()
    {
        return "Question2.html";
    }
}
