package softserve.elevators;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class MainTestFromJson {

    @DataProvider(name = "mainTest")
    public static Object[][] mainTestFromJson() {
        TestDataFromJson[] testDataFromJson = TestDataFromJson.getTestDataFromJson();
        Object[][] objects = new Object[testDataFromJson.length][];
        for (int i = 0; i < testDataFromJson.length; i++) {
            objects[i] = new Object[]{testDataFromJson[i].getElevators(), testDataFromJson[i].getPerson(),
                    testDataFromJson[i].getExpected()};
        }
        return objects;
    }



    @Test(dataProvider = "mainTest")
    public void test1(Elevator[] elevators, Person person, int expected){
        assertEquals(Main.elevatorChoice(elevators, person), expected);
    }
}
