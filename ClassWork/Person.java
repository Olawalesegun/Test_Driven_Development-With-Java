import enums.EducationProblem;
import enums.FinancialProblem;
import enums.HealthProblem;

public class Person {

    private FinancialProblem finance;
    private HealthProblem health;
    private EducationProblem edu;
    private boolean isSolved;

    public Person(FinancialProblem finance, HealthProblem health, EducationProblem edu){
        this.finance = finance;
        this.health = health;
        this.edu = edu;
    }

    public String[] addProblem(){
        System.out.println("What kind of Problem is this?: ");
        String[] problemsForPerson = new String[3];
        problemsForPerson.clone();
        return problemsForPerson;
    }
    public Boolean solveProblem(){
        if (isSolved = true) return true;
        else return false;
    }
    public String getUnsolvedProblems(){
        return null;
    }

    private enum Problems{problemName, problemType}

}
