package Q.Texla;

public class Automobile extends Transport {
    public Automobile() {
        super.wheelsNumber = 4;
    }

    public String direction;

    public void turnTo(String worldSide) {
        direction = worldSide;
    }
}