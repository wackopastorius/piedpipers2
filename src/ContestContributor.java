import java.util.Arrays;
import java.util.Scanner;

public class ContestContributor {
    //properties
    private Employee contributor;
    private double contributorScore;

    private ContestContributor[] employees = new ContestContributor[10];

    //constructors
    public ContestContributor(Employee contributor, double contributorScore) {
        this.contributor = contributor;
        this.contributorScore = contributorScore;
    }

    //methods
    public Employee createContributor() {
        System.out.println("Insert an employee's name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Employee employee = new Employee(name);
        return employee;
    }

    public ContestContributor addContributorAndScore() {
        System.out.println("Insert an employee's score: ");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        ContestContributor personWithScore = new ContestContributor(createContributor(), score);
        return personWithScore;
    }

    public void displayArray() {
        for (int i = 0; i < employees.length; i++) {
            employees[i] = addContributorAndScore();
        }
        System.out.println(Arrays.toString(employees));
    }

    //setters & getters
    public Employee getContributor() {
        return contributor;
    }

    public void setContributor(Employee contributor) {
        this.contributor = contributor;
    }

    public double getContributorScore() {
        return contributorScore;
    }

    public void setContributorScore(double contributorScore) {
        this.contributorScore = contributorScore;
    }
}
