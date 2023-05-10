package Units;

import java.util.ArrayList;

public class Sniper extends Shooter {
    public Sniper(String name, ArrayList<Unit> team) {
        super(name, 20, 0.6f, 4, 4,
                5, 10, 0.5f, 5, team);
    }

    @Override
    public String toString() {
        return "Снайпер";
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}