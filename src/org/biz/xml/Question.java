package org.biz.xml;
import java.util.ArrayList;
import java.util.List;

public class Question
{
  
    private int questionId;
    private String question;
    private List<Option> options;
    private String givenAnswer;
    
    public String getGivenAnswer ()
    {
        return givenAnswer;
    }

    public void setGivenAnswer (String givenAnswer)
    {
        this.givenAnswer = givenAnswer;
    }

    public Question(int questionId, String question, List<Option> options)
    {
        this.questionId = questionId;
        this.question = question; 
        this.options = options; 
    }

    public int getQuestionId ()
    {
        return questionId;
    }

    public void setQuestionId (int questionId)
    {
        this.questionId = questionId;
    }

    public String getQuestion ()
    {
        return question;
    }

    public void setQuestion (String question)
    {
        this.question = question;
    }

    public List<Option> getOptions ()
    {
        return options;
    }

    public void setOptions (List<Option> options)
    {
        this.options = options;
    }
    
    
}
