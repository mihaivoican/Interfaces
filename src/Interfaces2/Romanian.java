package Interfaces2;

//cls ce implementeaza interfata Citizen (deci si Person implicit)
public class Romanian implements Citizen{
    private int age;
    private String name;
    private long id;
    private String homeCountry;

    //constructor
    public Romanian(int age, String name, long id, String homeCountry) {
        this.age = age;
        this.name = name;
        this.id = id;
        this.homeCountry = homeCountry;
    }

    //implementare metode din interfata
    @Override
    public long getIdentifier() {
        return id;
    }

    @Override
    public String getHomeCountry() {
        return homeCountry;
    }

    @Override
    public boolean isVaccinated() {
        return false;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }
}
