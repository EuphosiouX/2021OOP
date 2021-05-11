package forum;

import java.util.LinkedList;

public class Species extends Genus{
    private String speciesName;

    Species(){}

    Species(String s, String g){
        super(g);
        setSpeciesName(s);
    }

    public void setSpeciesName(String s) {
        this.speciesName = s;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    @Override
    public String toString() {
        return "Species: " + getGenusName() + " " + speciesName;
    }

    public boolean equals(Species s){
        return speciesName.equals(s.getSpeciesName());
    }

    // 4C
    public LinkedList<Species> makeSpeciesList(LinkedList<Specimen> animals) {
        LinkedList<Species> speciesList = new LinkedList<Species>();
        for (Specimen a: animals) {
            speciesList.add(a.getTOA());
        }
        return speciesList;
    }

    // 4D
    public LinkedList<Species> makeSpeciesListUnique(LinkedList<Species> allSpecies) {
        LinkedList<Species> speciesListUnique = new LinkedList<Species>();
        for (Species s: allSpecies) {
            if (!speciesListUnique.contains(s)) {
                speciesListUnique.add(s);
            }
        }
        return speciesListUnique;
    }
}
