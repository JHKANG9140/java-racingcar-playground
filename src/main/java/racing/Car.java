package racing;

public class Car {

    private final String name;
    private int position = 1;

    public Car(String name) {
        this.name = name;
    }

    public boolean checkName() {
        return this.name.length() <= 5;
    }

    public int getPosition() {
        return this.position;
    }

    public void move(int i) {
        if (i >= 4) {
            position++;
        }
    }
}
