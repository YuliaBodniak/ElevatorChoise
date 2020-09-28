package softserve.elevators;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MainTest {

    @DataProvider (name = "mainTest")
    public static Object[][] mainTest(){
        Elevator elevator1 = new Elevator(1, 2, 4);
        Elevator elevator2 = new Elevator(2, 1, 6);
        Elevator elevator3 = new Elevator(3, 5, 8);
        Elevator[] elevators = new Elevator[] {elevator1, elevator2, elevator3};
        Person person = new Person(5, true);
        int expected = 3;

        Elevator elevator4 = new Elevator(1, 2, 4);
        Elevator elevator5 = new Elevator(2, 1, 6);
        Elevator[] elevators1 = new Elevator[] {elevator4, elevator5};
        Person person1 = new Person(5, true);
        int expected1 = 2;

        Elevator elevator6 = new Elevator(1, 12, 6);
        Elevator elevator7 = new Elevator(2, 6, 1);
        Elevator elevator8 = new Elevator(3, 12, 7);
        Elevator[] elevators2 = new Elevator[] {elevator6, elevator7, elevator8};
        Person person2 = new Person(7, false);
        int expected2 = 1;

        Elevator elevator9 = new Elevator(1, 4, 1);
        Elevator elevator10 = new Elevator(2, 3, 4);
        Elevator[] elevators3 = new Elevator[] {elevator9, elevator10};
        Person person3 = new Person(2, true);
        int expected3 = 2;

        Elevator elevator11 = new Elevator(1, 12, 6);
        Elevator elevator12 = new Elevator(2, 8, 7);
        Elevator elevator13 = new Elevator(3, 6, 8);
        Elevator[] elevators4 = new Elevator[] {elevator11, elevator12, elevator13};
        Person person4 = new Person(7, false);
        int expected4 = 1;

        Elevator elevator14 = new Elevator(1, 1, 8);
        Elevator elevator15 = new Elevator(2, 2, 7);
        Elevator elevator16 = new Elevator(3, 15, 18);
        Elevator elevator17 = new Elevator(4, 6, 8);
        Elevator[] elevators5 = new Elevator[] {elevator14, elevator15, elevator16, elevator17};
        Person person5 = new Person(7, false);
        int expected5 = 2;

        return new Object[][]{{elevators, person, expected}, {elevators1, person1, expected1},
                {elevators2, person2, expected2}, {elevators3, person3, expected3},
                {elevators4, person4, expected4}, {elevators5, person5, expected5}};
    }

    @Test (dataProvider = "mainTest")
    public void test1(Elevator[] elevators, Person person, int expected){
        assertEquals(Main.elevatorChoice(elevators, person), expected);
    }
}