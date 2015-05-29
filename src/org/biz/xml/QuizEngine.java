package org.biz.xml;

import java.util.ArrayList;
import java.util.List;

public class QuizEngine
    implements Quiz
{
    private List<Question> questions;

    public QuizEngine ()
    {
        loadQuestions ();
    }

    private void loadQuestions ()
    {
        questions = new ArrayList<> ();
        List<Option> optionsForQuestion1 = new ArrayList<> ();
        optionsForQuestion1.add (new Option (true, "Paramaribo"));
        optionsForQuestion1.add (new Option (false, "Moengo"));
        optionsForQuestion1.add (new Option (false, "Albina"));
        optionsForQuestion1.add (new Option (false, "Kourou"));
        Question question1 = new Question (1,
            "What is the capital of Suriname?", optionsForQuestion1);
        questions.add (question1);

        List<Option> optionsForQuestion2 = new ArrayList<> ();
        optionsForQuestion2.add (new Option (false, "England"));
        optionsForQuestion2.add (new Option (true, "Spain"));
        optionsForQuestion2.add (new Option (false, "Australia"));
        optionsForQuestion2.add (new Option (false, "Germany"));
        Question question2 = new Question (2,
            "Which country has the highest number of bars per person?",
            optionsForQuestion2);
        questions.add (question2);
    }

    @Override
    public String getQuizName ()
    {
        // TODO Auto-generated method stub
        return "Hi Quiz!";
    }

    @Override
    public int getNumberOfQuestions ()
    {
        // TODO Auto-generated method stub
        return questions.size ();
    }

    @Override
    public List<Question> getQuestions ()
    {
        // TODO Auto-generated method stub
        return questions;
    }

    void setQuestions (List<Question> questions)
    {
        this.questions = questions;
    }

    private boolean isCorrect (Question q)
    {
        for (Option opt : q.getOptions ())
        {
            if (q.getGivenAnswer ().equals (opt.getOption ()))
            {
                return opt.isCorrectAnswer ();
            }
        }
        return false;
    }

    public String getResults ()
    {
        StringBuilder builder = new StringBuilder (1024);
        for (Question question : questions)
        {
            if (isCorrect (question))
            {
                builder.append ("   ");
            }

            else
            {
                builder.append (" x ");
            }

            builder.append (question.getQuestionId ());
            builder.append(" ");
            builder.append (question.getQuestion ());
            builder.append(" ");
            builder.append (question.getGivenAnswer ());
            builder.append(" ");
            for (Option o : question.getOptions ())
            {
                if (o.isCorrectAnswer ())
                {
                    builder.append (o.getOption ());
                }
            }

            builder.append ("\n");

        }
        return builder.toString ();
    }

}
