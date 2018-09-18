public class Pelikysymys {
    private String question;
    private String answer;

    public Pelikysymys(String question, String answer) {
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
