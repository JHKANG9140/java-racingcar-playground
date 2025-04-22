package racing;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<Car> cars = new ArrayList<>();
    private int tryCount;

    public Race(String carsName) {
        String[] car = carsName.split(",");
        for (String name : car) {
            cars.add(new Car(name));
        }
    }

    public void raceOneTime() {
        for (Car car : cars) {
            car.move(RandomNumberGenerator.getRandomNumber());
        }
    }

    public void racing() {
        for (int i = 0; i < tryCount; i++) {
            raceOneTime();
            //TODO ui 로직 추가
        }

        List<Car> winners = getWinner();
    }

    private List<Car> getWinner() {
        List<Car> winner = new ArrayList<>();
        int winnerMove = getMaxValue();
        for (Car car : cars) {
            if (car.getPosition() == winnerMove) {
                winner.add(car);
            }
        }

        return winner;
    }

    private int getMaxValue() {
        int maxValue = 0;
        for (Car car : cars) {
            maxValue = Math.max(maxValue, car.getPosition());
        }
        return maxValue;
    }


    public List<Car> getCars() {
        return cars;
    }

    public void setTryCount(int i) {
        tryCount = i;
    }

    public int getTryCount() {
        return tryCount;
    }
}
