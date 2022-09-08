package Interfaces2;

//implementeaza interfata Employee
public class RomanianOmvWorker implements Employee{

    //mai e de lucru; nu e finalizata; e doar ce scrie implicit Intellij
    @Override
    public long getIdentifier() {
        return 222333;
    }

    @Override
    public String getHomeCountry() {
        return "Anglia";
    }

    @Override
    public boolean isVaccinated() {
        return false;
    }

    @Override
    public long getSalary() {
        return 10000;
    }

    @Override
    public int getAge() {
        return 25;
    }

    @Override
    public String getName() {
        return "Monica I";
    }
}
