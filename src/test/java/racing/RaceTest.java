package racing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RaceTest {

    private Race race;

    @BeforeEach
    public void init() {
         race = new Race("pobi,crong,honux");
    }

    @Test
    public void generateCar() {
        assertThat(race.getCars().size()).isEqualTo(3);
    }

    @Test
    public void runGameOneTime() {
        //어떻게 테스트 해야할 지 모르겠다.
        //한 번 실행된 결과가 렌덤수에 의해 정해지기 때문에 한칸 이동한 차도 있고 아닌 차도 있을거라서, 한번 실행에 어떤차가 어떻게 이동했는지를 검증하는 것은 무의미
        //
    }

    @Test
    public void setTryCount() {
        race.setTryCount(5);
        assertThat(race.getTryCount()).isEqualTo(5);
    }

    @Test
    public void judgeWinner() {

    }

}
