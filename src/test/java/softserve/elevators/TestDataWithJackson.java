package softserve.elevators;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.Arrays;

public class TestDataWithJackson implements Serializable {
    private Elevator[] elevators;
    private Person person;
    private int expected;

    public TestDataWithJackson() {
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


    public TestDataWithJackson(Elevator[] elevators, Person person, int expected) {
        this.elevators = elevators;
        this.person = person;
        this.expected = expected;
    }


    public static TestDataWithJackson[] parseJson() throws IOException {
        Reader reader = null;
        try {
            reader = new FileReader("D:\\ideaprojects\\ElevatorChoice\\src\\main\\resources\\testdata.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TestDataWithJackson[] testDataWithJackson = objectMapper.readValue(reader, TestDataWithJackson[].class);
        return testDataWithJackson;
    }

    @Override
    public String toString() {
        return "TestDataWithJackson{" +
                "elevators=" + Arrays.toString(elevators) +
                ", person=" + person +
                ", expected=" + expected +
                '}';
    }
}
