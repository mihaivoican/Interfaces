package Interfaces2;

public class Main {
    public static void main(String[] args) {

        Rebel rebel = new Rebel(18, "Mike");
        System.out.println(String.format("Rebelul e %s are %d ani",rebel.getName(),rebel.getAge()));
        Romanian romanian = new Romanian(18, "Joe", 1234145, "Romania");
        System.out.println(String.format("Romanul e %s are CNP %s si traieste in %s",romanian.getName(),romanian.getIdentifier(),romanian.getHomeCountry()));
        //urmatorul nu e complet lucrat
        RomanianOmvWorker monica = new RomanianOmvWorker();
        System.out.println(String.format("%s are %d ani si are un salariu de %d ",monica.getName(),monica.getAge(), monica.getSalary()));
        //clasa vama prelucreaza o coada la iesire tin tara
        Custom custom = new Custom();
        custom.addToQueue(romanian);
        custom.addToQueue(monica);

        custom.processCitizen();
    }
}
