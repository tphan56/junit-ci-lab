import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void calculatesHypotenuse() {
        Assertions.assertEquals(22.360679774997898, Main.hypothenuse(10, 20), 1e-12);
    }

    @Test
    void calculatesThreeFourFiveTriangle() {
        Assertions.assertEquals(5.0, Main.hypothenuse(3, 4), 1e-12);
    }
}

