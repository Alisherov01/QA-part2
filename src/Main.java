import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] skills = {"qwer"};

        Worker[] worker = {
                new Worker("", skills),
                new QATester("", skills, "java")
        };
        Company[] companies = new Company[2];
        companies[0] = new ITCompany("12",50000,30000,80000,worker);
        companies[1] = new AnimationCompany("1234",50000,30000,80000,worker);
        Holding holding = new Holding(companies);




        while (true){
            System.out.println("Главне меню для работы с холдингом: ");
            System.out.println("1) Вывод списка компаний в холдинге");
            System.out.println("2) Вывод общего бюджета холдинга");
            System.out.println("0) Выход из главного меню");

            int command = in.nextInt();
            if (command == 1) {
                System.out.println("Список компаний: ");
                holding.showCompanies();
                System.out.println();
            } else if (command == 2) {
                System.out.println("Общий бюджет холдинга: ");
                holding.holdingBudget();
                System.out.println();
            } else if (command == 0) {
                break;
            }else {
                System.out.println("Ошибка! Введите пункт из меню");
            }
        }
    }
}
