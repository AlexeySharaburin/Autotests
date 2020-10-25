import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

class EducationTest {

    @ParameterizedTest
    @EnumSource(Education.class)
    void testEducationEnam(Education level) {
        System.out.println(level);
    }
}