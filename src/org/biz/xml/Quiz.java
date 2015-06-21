package org.biz.xml;
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


@Entity
@Table(name="QUIZ")
public interface Quiz
{
    public String getQuizName();
    public int getNumberOfQuestions();
    public List<Question> getQuestions();
    public String getResults();
}
