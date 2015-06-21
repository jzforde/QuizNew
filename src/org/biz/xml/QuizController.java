package org.biz.xml;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class QuizController
{
    private  Map<String, Object> map = new HashMap<>();
    @RequestMapping("/start.do")
    public ModelAndView start()
    {
        Quiz q = new QuizEngine();
        map.put("thisQuiz", q);
        map.put ("index", 0);
        return new ModelAndView("startQuiz", "thisMap", map);
    }
    
    @RequestMapping("/next.do")
    public ModelAndView next(@RequestParam String option)
    {
        int i =(int)map.get ("index");
        Quiz q = ((Quiz)map.get("thisQuiz"));
        q.getQuestions().get(i).setGivenAnswer(option);
        i++;
        if (i >= q.getQuestions().size ()) {
            return new ModelAndView("results", "theResults", q.getResults());
        }
        map.put ("index", i);
        return new ModelAndView("startQuiz", "thisMap", map);
    }
}
 