package forum;

import java.util.Arrays;
import java.util.LinkedList;

public class Specimen{
    private String name;
    private int cageNumber;
    private Species toa;
    private String marking;

    Specimen(){}

    Specimen(String a, int c, Species s, String m){
        setName(a);
        setCage(c);
        setTOA(s);
        setMarking(m);
    }

    public void setName(String a) {
        this.name = a;
    }

    public void setCage(int c) {
        this.cageNumber = c;
    }

    public void setTOA(Species s) {
        this.toa = s;
    }

    public void setMarking(String marking) {
        this.marking = marking;
    }

    public String getName() {
        return name;
    }

    public int getCage() {
        return cageNumber;
    }

    public Species getTOA() {
        return toa;
    }

    public String getMarking() {
        return marking;
    }

    @Override
    public String toString() {
        return name + " is a " + toa + " in cage " + cageNumber;
    }

    // 3b
    public int countSpecimens(Specimen[] animals, Species s) {
        int count = 0;
        for (Specimen x: animals) {
            if (x.getTOA().getSpeciesName().equals(s.getSpeciesName())) {
                count++;
            }
        }
        return count;
    }

    //3c
    /*
    listSpecies (Specimen[] animals) {
        LinkedList<String> speciesList = new LinkedList <String>
        for (each animal in animals) {
            if (animal's species has not existed in speciesList) {
                insert animal's species into speciesList
            }
        }
        return allSpecies
        }
    */

     // 4b
     public LinkedList<Specimen> makeList( Specimen[] animals ) {
         return new LinkedList<Specimen>(Arrays.asList(animals));
     }
}
