public class Kysymys {
    private String question;
    private String answer;

    public Kysymys(String question, String answer) {
        this.question = question;
        this.answer = answer;

    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return "Kysymys " +
                "" + question + '\'' +
                " " + '\'' +
                '}';
    }
}
