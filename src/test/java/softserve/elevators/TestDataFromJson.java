package softserve.elevators;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;

public class TestDataFromJson {
    private Elevator[] elevators;
    private Person person;
    private int expected;

    public TestDataFromJson(Elevator[] elevators, Person person, int expected) {
        this.elevators = elevators;
        this.person = person;
        this.expected = expected;
    }


    public Elevator[] getElevators() {
        return elevators;
    }

    public void setElevators(Elevator[] elevators) {
        this.elevators = elevators;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getExpected() {
        return expected;
    }

    public void setExpected(int expected) {
        this.expected = expected;
    }

    @Override
    public String toString() {
        return "TestDataFromJson{" +
                "elevators=" + Arrays.toString(elevators) +
                ", person=" + person +
                ", expected=" + expected +
                '}';
    }

    public static TestDataFromJson[] getTestDataFromJson() {
        Reader reader = null;
        try {
            reader = new FileReader("C:\\Data\\ElevatorChoice\\src\\main\\resources\\testdata.json");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();
        TestDataFromJson[] testDataFromJson = gson.fromJson(reader, TestDataFromJson[].class);
        return testDataFromJson;
    }

}
