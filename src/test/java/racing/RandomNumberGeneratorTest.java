package racing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomNumberGeneratorTest {

    @Test
    public void generateRandomNumber() {
        int randNum = RandomNumberGenerator.getRandomNumber();
        assertThat(randNum).isBetween(0, 9);
    }
}
