package Game;

public class Coordinate {
    public int x, y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public float distance(Coordinate coordinate) {
        float dx = coordinate.x - this.x;
        float dy = coordinate.y - this.y;
        return (float) Math.sqrt(dx * dx + dy * dy);
    }

    public int[] distanceXY(Coordinate coordinate) {
        int[] result = new int[2];
        result[0] = coordinate.x - this.x;
        result[1] = coordinate.y - this.y;
        return result;
    }
}