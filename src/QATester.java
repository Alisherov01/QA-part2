public class QATester extends Worker {
    private String programmingLanguage;

    public QATester(String positionAtWork, String[] skills, String programmingLanguage) {
        super(positionAtWork, skills);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
