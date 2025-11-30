package chatbot;

import java.util.Random;

public class RandomQuestionChooser extends QuestionChooser {

    Random random = new Random();
    @Override
    public int getQuestion(int len) {
        int index = random.nextInt(0, len);
        return index;
    }
}
