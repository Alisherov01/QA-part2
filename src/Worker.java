public class Worker {
    private String positionAtWork;
    private String[] skills;

    public Worker(String positionAtWork, String[] skills) {
        this.positionAtWork = positionAtWork;
        this.skills = skills;
    }

    public String getPositionAtWork() {
        return positionAtWork;
    }

    public void setPositionAtWork(String positionAtWork) {
        this.positionAtWork = positionAtWork;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }
}
