import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class MainTest {

    @Test
    void testUnder18_success() {

        Collection<Person> testPersons = new ArrayList<>();

        testPersons.add(new Person("Jack", "Evans", 29, Sex.MAN, Education.HIGHER));
        testPersons.add(new Person("Connor", "Young", 15, Sex.WOMAN, Education.FURTHER));

        long expected = 1;

        long result = Main.under18(testPersons);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void testUnder18_unsuccess() {

        Collection <Person> testPersons = new ArrayList<>();
        testPersons.add(new Person("Jack", "Evans", 29, Sex.MAN, Education.HIGHER));
        testPersons.add(new Person("Connor", "Young", 15, Sex.WOMAN, Education.FURTHER));

        long expected = 2;

        long result = Main.under18(testPersons);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void testRecruits_sucess() {

        Collection<Person> testPersons = new ArrayList<>();
        testPersons.add(new Person("Jack", "Evans", 25, Sex.MAN, Education.HIGHER));
        testPersons.add(new Person("Connor", "Young", 15, Sex.WOMAN, Education.FURTHER));


        Person expectedPerson = new Person("Jack", "Evans", 25, Sex.MAN, Education.HIGHER);

        List<Person> expectedPersons = new ArrayList<>();

        expectedPersons.add(expectedPerson);

        List<String> result = Main.recruits(testPersons);

        Assertions.assertEquals(expectedPersons.toString(), result.toString());


    }

    @Test
    void testRecruits_unsucess() {

        Collection<Person> testPersons = new ArrayList<>();
        testPersons.add(new Person("Jack", "Evans", 28, Sex.MAN, Education.HIGHER));
        testPersons.add(new Person("Connor", "Young", 15, Sex.WOMAN, Education.FURTHER));


        Person expectedPerson = new Person("Jack", "Evans", 25, Sex.MAN, Education.ELEMENTARY);

        List<Person> expectedPersons = new ArrayList<>();

        expectedPersons.add(expectedPerson);

        List<String> result = Main.recruits(testPersons);

        Assertions.assertEquals(expectedPersons.toString(), result.toString());

    }

    @Test
    void testEmployables_success() {

        Collection<Person> testPersons = new ArrayList<>();

        testPersons.add(new Person("Jack", "Evans", 28, Sex.MAN, Education.HIGHER));
        testPersons.add(new Person("Connor", "Young", 15, Sex.WOMAN, Education.FURTHER));

        Person expectedPerson = new Person("Jack", "Evans", 28, Sex.MAN, Education.HIGHER);

        List<Person> expectedPersons = new ArrayList<>();

        expectedPersons.add(expectedPerson);

        List<String> result = Main.employables(testPersons);

        Assertions.assertEquals(expectedPersons.toString(), result.toString());

    }

}