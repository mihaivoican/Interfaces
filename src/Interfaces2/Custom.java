package Interfaces2;

import java.util.ArrayList;
import java.util.List;

//ac cls foloseste o parte din cls declarate anterior (Citizen etc)
public class Custom {
    List<Citizen> queue = new ArrayList<>();        //lista e un fel de array cu metode in plus pt adaugare scoatere etc

    public void addToQueue(Citizen c) {
        queue.add(0, c);
    }

    public void processCitizen() {
        System.out.println("Coada  are " +queue.size() + "persoane");
        Citizen citizen = queue.get(queue.size() - 1);
        System.out.println(citizen.getIdentifier());
        System.out.println(citizen.getName());
        queue.remove(citizen);
        System.out.println("Coada mai are " +queue.size() + "persoane");
    }
}
