package chatbot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Chatbot {
    private List<String> questions = new ArrayList<>() {
        {
            add("What is 2 + 2?");
            add("What is 3 * 3?");
            add("What is 9 / 3?");
            add("What time is it?");
        }
    };

    private QuestionChooser questionChooser;

    public Chatbot(QuestionChooser questionChooser) {
        this.questionChooser = questionChooser;
    }

    public void setQuestionChooser(QuestionChooser questionChooser) {
        this.questionChooser = questionChooser;
    }

    public void displayQuestions() {
       while (!questions.isEmpty()) {
           int index = questionChooser.getQuestion(questions.size());
           String question = questions.get(index);
           questions.remove(index);
           System.out.println(question);
       }
    }
}
