package seminars.first.Calculator;

import seminars.first.Calculator.Calculator;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {

        // Проверка дополнительного функционала calculateDiscount
        assertThat(Calculator.calculateDiscount(200, 60)).isEqualTo(80.0);
        assertThat(Calculator.calculateDiscount(20, 20)).isEqualTo(16);
        assertThat(Calculator.calculateDiscount(120, 50)).isEqualTo(60);
        assertThat(Calculator.calculateDiscount(100, 50)).isEqualTo(50);

        // Проверка ожидаемых исключений, с использованием утверждений AssertJ:
        assertThatThrownBy(() ->
                Calculator.calculateDiscount(-200, 40)
        ).isInstanceOf(ArithmeticException.class);

        assertThatThrownBy(() ->
                Calculator.calculateDiscount(220, -40)
        ).isInstanceOf(ArithmeticException.class);

        assertThatThrownBy(() ->
                Calculator.calculateDiscount(-220, -40)
        ).isInstanceOf(ArithmeticException.class);



        // Проверка базового функционала с целыми числами, с использованием утверждений AssertJ:
//        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
//        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
//        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
//        assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);

        // Проверка ожидаемого исключения, с использованием утверждений AssertJ:
//        assertThatThrownBy(() ->
//                Calculator.calculation(8, 4, '_')
//        ).isInstanceOf(IllegalStateException.class);
//
//        System.out.println(Calculator.calculation(2_147_483_647, 1, '+')); // integer overflow
//        System.out.println(Calculator.squareRootExtraction(169));

    }
}