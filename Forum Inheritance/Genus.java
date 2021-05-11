package forum;

public class Genus {
    private String g;

    Genus(){}

    Genus(String g){
        this.g = g;
    }

    public String getGenusName() {
        return g;
    }

    @Override
    public String toString() {
        return "Genus{" +
                "g='" + g + '\'' +
                '}';
    }
}
