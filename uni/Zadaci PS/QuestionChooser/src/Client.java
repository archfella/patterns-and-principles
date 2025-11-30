import chatbot.Chatbot;
import chatbot.FirstQuestionChooser;
import chatbot.RandomQuestionChooser;

public class Client {
    public static void main(String[] args) {
        Chatbot chatbot = new Chatbot(new RandomQuestionChooser());
        chatbot.displayQuestions();
    }
}