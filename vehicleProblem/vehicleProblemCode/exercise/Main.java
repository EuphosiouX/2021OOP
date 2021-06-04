package exercise;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Jeep jeep = new Jeep("Wrangler", 6, 230, 4);
        Frigate frigate = new Frigate("USS Enterprise", 60, 100, 4500);
        Hovercraft hovercraft = new Hovercraft("Amphibi3000", 35, 200,8, 3200);
        PoliceCar policeCar = new PoliceCar("NYPD", 5, 245, 4, true);
        PoliceCar policeCar1 = new PoliceCar("CPD", 4, 210, 4, false);
        PoliceCar policeCar2 = new PoliceCar("POLIZIA", 6, 234, 4, true);

        ArrayList<PoliceCar> policeCars = new ArrayList<>();
        policeCars.add(policeCar);
        policeCars.add(policeCar1);
        policeCars.add(policeCar2);

        jeep.drive();
        jeep.soundHorn();
        System.out.println(jeep);
        System.out.println();

        frigate.launch();
        frigate.fireGun();
        System.out.println(frigate);
        System.out.println();

        hovercraft.drive();
        hovercraft.launch();
        hovercraft.enterLand();
        hovercraft.enterSea();
        System.out.println(hovercraft);
        System.out.println();

        for(PoliceCar p:policeCars){
            System.out.println("-----------------------------");
            System.out.println("Police car No." + (policeCars.indexOf(p) + 1));
            System.out.println("-----------------------------");
            p.drive();
            p.soundSiren();
            System.out.println(p.isOnDuty());
            System.out.println(p);
            System.out.println();
        }

    }
}
