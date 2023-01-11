public class Question {
  final private Long id;
  private String name;
  private String subject;
  private String questionPdf;

  public Question(Long id, String name, String subject, String questionPdf) {
    this.id = id;
    this.name = name;
    this.subject = subject;
    this.questionPdf = questionPdf;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getQuestionPdf() {
    return questionPdf;
  }

  public void setQuestionPdf(String questionPdf) {
    this.questionPdf = questionPdf;
  }

}
