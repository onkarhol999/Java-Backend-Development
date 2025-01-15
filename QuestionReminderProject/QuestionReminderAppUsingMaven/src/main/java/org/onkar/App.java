package org.onkar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        QuestionService service = new QuestionService();
        service.scheduleDailyQuestion();
    }
}
