package Interfaces2;
//interfata de mai jos EXTINDE cu metode noi interfata Person
public interface Citizen extends Person{
    long getIdentifier();

    String getHomeCountry();

    boolean isVaccinated();
}
