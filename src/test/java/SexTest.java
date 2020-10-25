import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

class SexTest {


    @ParameterizedTest
    @EnumSource(Sex.class)
    void testEnumSex(Sex sex) {
        System.out.println(sex);
    }
}