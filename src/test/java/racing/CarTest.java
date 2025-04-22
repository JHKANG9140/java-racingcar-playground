package racing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private Car car;
    @BeforeEach
    public void init() {
        car = new Car("pobi");
    }

    @Test
    public void nameCheck() {
        // 이름이 5자를 초과할 수 없다

        assertThat(car.checkName()).isTrue();

        Car car2 = new Car("pobiFalse");
        assertThat(car2.checkName()).isFalse();
    }

    @Test
    public void currentPosition() {
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    public void carMove() {
        car.move(4);
        assertThat(car.getPosition()).isEqualTo(2);
    }

    @Test
    public void carNotMove() {
        car.move(3);
        assertThat(car.getPosition()).isEqualTo(1);
    }
}
