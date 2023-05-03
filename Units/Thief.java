package Units;

public class Thief extends Unit {

    public Thief(String name) {
        super(name, 20, 0.8f, 3, 2, 10);
    }

    @Override
    public String toString() {
        return name;
    }

    void dodge() {
    }

    void stealth() {
    }
}