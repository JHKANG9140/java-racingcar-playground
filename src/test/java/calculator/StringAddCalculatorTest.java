package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringAddCalculatorTest {

    @Test
    public void split_null_empty() {
        // 1. 빈 문자열 또는 null 값을 입력할 경우 0을 반환해야 한다.(예 : “” => 0, null => 0)
        int nullResult = StringAddCalculator.splitAndAdd(null);
        assertThat(nullResult).isEqualTo(0);

        int emptyResult = StringAddCalculator.splitAndAdd("");
        assertThat(emptyResult).isEqualTo(0);
    }

    @Test
    public void stringToNum() {
        // 2. 숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다.(예 : “1”)
        int result = StringAddCalculator.splitAndAdd("1");
        assertThat(result).isEqualTo(1);
        // 앞 단계의 구분자가 없는 경우도 split()을 활용해 구현할 수 있는지 검토해 본다.
        // null  및 빈 문자열은 split 에 실패한다.
    }

    @Test
    public void splitComma() {
        // 3. 숫자 두개를 컴마(,) 구분자로 입력할 경우 두 숫자의 합을 반환한"다.(예 : “1,2”)
        int result = StringAddCalculator.splitAndAdd("1,2");
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void splitCommaAndColon() {
        // 4. 구분자를 컴마(,) 이외에 콜론(:)을 사용할 수 있다. (예 : “1,2:3” => 6)
        int result = StringAddCalculator.splitAndAdd("1,2:3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void customSplitter() {
        // 5. “//”와 “\n” 문자 사이에 커스텀 구분자를 지정할 수 있다. (예 : “//;\n1;2;3” => 6)
        int result = StringAddCalculator.splitAndAdd("//;\n1;2;3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void minusException() {
        // 6. 음수를 전달할 경우 RuntimeException 예외가 발생해야 한다. (예 : “-1,2,3”)
        assertThatThrownBy(() -> StringAddCalculator.splitAndAdd("-1,2,3")).isInstanceOf(RuntimeException.class);
    }
}
