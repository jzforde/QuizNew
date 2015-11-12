/*
This is the core of my quiz. It contains a list of 5 questions with the question, possible answers and the right and wrong answers
I used a boolean to represent if the answer is correct or incorrect. 
*/

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
        optionsForQuestion1.add (new Option (true, "cavort"));
        optionsForQuestion1.add (new Option (false, "obsolesence"));
        optionsForQuestion1.add (new Option (false, "definiens"));
        optionsForQuestion1.add (new Option (false, "shivaree"));
        Question question1 = new Question (1,
            "To prance or jump around excitedly", optionsForQuestion1);
        questions.add (question1);

        List<Option> optionsForQuestion2 = new ArrayList<> ();
        optionsForQuestion2.add (new Option (false, "telesthesia"));
        optionsForQuestion2.add (new Option (true, "aggrandize"));
        optionsForQuestion2.add (new Option (false, "oxter"));
        optionsForQuestion2.add (new Option (false, "agog"));
        Question question2 = new Question (2,
            "To increase in size or intensity",
            optionsForQuestion2);
        questions.add (question2);
        
        List<Option> optionsForQuestion3 = new ArrayList<> ();
        optionsForQuestion3.add (new Option (false, "gainsay"));
        optionsForQuestion3.add (new Option (true, "middling"));
        optionsForQuestion3.add (new Option (false, "moonbow"));
        optionsForQuestion3.add (new Option (false, "quidnunc"));
        Question question3 = new Question (3,
            "Mediocre or ordinary",
            optionsForQuestion3);
        questions.add (question3);
        
        List<Option> optionsForQuestion4 = new ArrayList<> ();
        optionsForQuestion4.add (new Option (false, "blithe"));
        optionsForQuestion4.add (new Option (false, "cynosure"));
        optionsForQuestion4.add (new Option (false, "syzygy"));
        optionsForQuestion4.add (new Option (true, "hidebound"));
        Question question4 = new Question (4,
            "Narrow and rigid in opinion",
            optionsForQuestion4);
        questions.add (question4);
        
        List<Option> optionsForQuestion5 = new ArrayList<> ();
        optionsForQuestion5.add (new Option (true, "scroop"));
        optionsForQuestion5.add (new Option (false, "bucolic"));
        optionsForQuestion5.add (new Option (false, "pifle"));
        optionsForQuestion5.add (new Option (false, "aver"));
        Question question5 = new Question (5,
            "To emit a harsh, grating sound",
            optionsForQuestion5);
        questions.add (question5);
    }

    @Override
    public String getQuizName ()
    {
        // TODO Auto-generated method stub
        return "Words";
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
                //builder.append ("   ");
               
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

            builder.append ("<br/>");

        }
        return builder.toString ();
    }
}
