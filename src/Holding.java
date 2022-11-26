import java.util.Arrays;
import java.util.Scanner;

public class Holding {
    Scanner sc = new Scanner(System.in);
    private Company[] companies;

    private int companyBudget;

    public Holding(int companyBudget, String managersName) {
        this.companyBudget = companyBudget;
    }

    public int getCompanyBudget() {
        return companyBudget;
    }

    public void setCompanyBudget(int companyBudget) {
        this.companyBudget = companyBudget;
    }

    public Holding(Company[] companies) {
        this.companies = companies;
    }

    public Company[] getCompanies() {
        return companies;
    }

    public void setCompanies(Company[] companies) {
        this.companies = companies;
    }


    public void showCompanies() {
        for (Company company : companies) {
            if (company != null) {
                System.out.println(company.getName() + " | " + company.getBudget());
            }
        }
        System.out.println();
    }

    public void holdingBudget() {
        Company[] companies = this.companies;
        double count = 0;
        for (int i = 0; i < companies.length; i++) {
            if (companies[i] != null) {
                count = count + companies[i].getBudget();
            }
        }
        System.out.println(count);
    }
}