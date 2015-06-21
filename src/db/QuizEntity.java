package db;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

import org.biz.xml.Option;
import org.biz.xml.Question;

import java.util.List;


public class QuizEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   
    @Column(name="QUESTIONS")
    private List<Question>questions; 
    
    
    private List<Option>optionsForQuestion1;
    private List<Option>optionsForQuestion2;
    
}
@Entity
@Table(name="USER")
private class User
{   
    @Column(name="NAME")
    private String name;
    
    @Column(name="EMAIL")
    private String email;
}

@Entity
@Table(name="RESULT")
private class Result
{
    @Column(name="QUESTIONS_RIGHT")
    private boolean isCorrect;
    
    @Column(name="QUESTIONS_WRONG")
    private boolean isWrong;
}
