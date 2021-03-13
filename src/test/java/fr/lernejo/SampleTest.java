package fr.lernejo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {
    @Test
    void addition() {
        int number1 = 8;
        int number2 = 2;
        Sample s = new Sample();

        int sum = s.op(Sample.Operation.ADD, number1, number2);
        Assertions.assertThat(sum).as("Addition de 2 nombres").isEqualTo(10);
    }
    @Test
    void multiplication() {
        int number1 = 4;
        int number2 = 3;
        Sample s = new Sample();

        int product = s.op(Sample.Operation.MULT, number1, number2);
        Assertions.assertThat(product).as("Multiplication de 2 nombres").isEqualTo(12);
    }
}
