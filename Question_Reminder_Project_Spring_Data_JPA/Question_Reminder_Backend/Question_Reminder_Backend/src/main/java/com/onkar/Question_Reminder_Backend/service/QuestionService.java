package com.onkar.Question_Reminder_Backend.service;

import com.onkar.Question_Reminder_Backend.model.Question;
import com.onkar.Question_Reminder_Backend.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

import java.util.List;
import java.util.Random;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepo repo;

    public List<Question> getAllQuestions() {
           return repo.findAll();
    }

    public void addQuestion(Question question) {
        repo.save(question);
    }

    public void deleteQuestion(int id) {
        repo.deleteById(id);
    }

    public Question getQuestionById(int id) {
        return repo.findById(id).orElse(null);
    }

    public void saveQuestionsFromExcel(MultipartFile file) throws Exception {
        InputStream inputStream = file.getInputStream();
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet

        for (Row row : sheet) {
            if (row.getRowNum() == 0) {
                // Skip header row
                continue;
            }

            Cell questionCell = row.getCell(0); // Assuming Question is in the first column
            Cell answerCell = row.getCell(1); // Assuming Answer is in the second column

            if (questionCell != null && answerCell != null) {
                String question = questionCell.getStringCellValue();
                String answer = answerCell.getStringCellValue();

                Question questionObj = new Question();
                questionObj.setQuestion(question);
                questionObj.setAnswer(answer);

                repo.save(questionObj);
            }
        }

        workbook.close();
    }

    private int currentIndex = 4;

    public synchronized Question getQuestionOfTheDay() { // Synchronized to handle concurrent calls
        List<Question> allQuestions = repo.findAll();
        if (allQuestions.isEmpty()) {
            return null; // No questions available
        }

        // Get the current question
        Question question = allQuestions.get(currentIndex);

        // Update index to the next question (loop back to 0 if at the end)
        currentIndex = (currentIndex + 1) % allQuestions.size();

        return question;
    }
}
