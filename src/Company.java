public abstract class Company {
    private String name;
  private int revenue;
  private int expense;
  private int budget;
  private Worker[] workers;

    public Company(String name, int revenue, int expense, int budget, Worker[] workers) {
        this.name = name;
        this.revenue = revenue;
        this.expense = expense;
        this.budget = budget;
        this.workers = workers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public int getExpense() {
        return expense;
    }

    public void setExpense(int expense) {
        this.expense = expense;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void setWorkers(Worker[] workers) {
        this.workers = workers;
    }
}
