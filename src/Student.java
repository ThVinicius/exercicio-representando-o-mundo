import java.util.ArrayList;
import java.util.List;

public class Student {

  String name;
  String email;
  List<Question> studentsQuestions;

  public Student(String name, String email) {
    this.name = name;
    this.email = email;
    this.studentsQuestions = new ArrayList<Question>();
  }

  public void getQuestion(Long id, List<Question> questionsRepository) {
    Question findQuestion = null;

    for (int i = 0; i < questionsRepository.size(); i++) {
      if (questionsRepository.get(i).getId() == id) {
        findQuestion = questionsRepository.get(i);

        break;
      }

    }

    if (findQuestion == null) {
      System.out.println("Questão não encontrada!");
    } else {
      this.studentsQuestions.add(findQuestion);
    }

  }

}