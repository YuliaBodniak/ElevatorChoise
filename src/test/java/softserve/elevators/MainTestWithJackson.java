package softserve.elevators;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class MainTestWithJackson {
    @DataProvider(name = "mainTest")
    public static Object[][] mainTestWithJackson() throws IOException {
        TestDataWithJackson[] testDataWithJackson = TestDataWithJackson.parseJson();
        Object[][] objects = new Object[testDataWithJackson.length][];
        for (int i = 0; i < testDataWithJackson.length; i++) {
            objects[i] = new Object[]{testDataWithJackson[i].getElevators(), testDataWithJackson[i].getPerson(),
                    testDataWithJackson[i].getExpected()};
        }
        return objects;
    }

    @Test(dataProvider = "mainTest")
    public void test1(Elevator[] elevators, Person person, int expected){
        assertEquals(Main.elevatorChoice(elevators, person), expected);
    }
}
