import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\91915\\Desktop\\last time\\Java-Backend-Development\\Lecture152 Java Based Configuration\\QuestionReminder\\src\\questions.txt";
        List<String> questionsAndAnswers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            StringBuilder currentQA = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    if (currentQA.length() > 0) {
                        questionsAndAnswers.add(currentQA.toString().trim());
                        currentQA.setLength(0);
                    }
                } else {
                    currentQA.append(line).append("\n");
                }
            }
            if (currentQA.length() > 0) {
                questionsAndAnswers.add(currentQA.toString().trim());
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        if (questionsAndAnswers.isEmpty()) {
            System.out.println("No questions found in the file.");
        } else {
            Random random = new Random();
            String randomQA = questionsAndAnswers.get(random.nextInt(questionsAndAnswers.size()));
            System.out.println("Here is a random question and its answer:");
            System.out.println(randomQA);
        }
    }
}
