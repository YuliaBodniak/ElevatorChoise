package softserve.elevators;
import java.util.Scanner;

import static softserve.elevators.Elevator.isThereAnyElevatorsInMyDirection;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number of elevators:");
        int numberOfElevator = scanner.nextInt();
        Elevator[] elevators = new Elevator[numberOfElevator];

        System.out.println("Enter for each elevator his number, current floor and destination floor:");
        for (int i = 0; i < numberOfElevator; i++) {
            elevators[i] = new Elevator(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        }

        System.out.println("Enter your current floor and choose up (true) or down (false):");
        Person person = new Person(scanner.nextInt(), scanner.nextBoolean());

        elevatorChoice(elevators, person);
    }

    public static int elevatorChoice(Elevator[] elevators, Person person) {
        int newDistance;
        int elevatorIndex = 0;
        int distance = Integer.MAX_VALUE;
        int count = isThereAnyElevatorsInMyDirection(elevators, person);
    for (int i = 0; i < elevators.length; i++) {
        if (count==0){
            newDistance = Math.abs(elevators[i].getDestinationFloor() - person.getCurrentFloor());
                if (distance > newDistance) {
                    distance = newDistance;
                    elevatorIndex = i;
                }
        }
        else if(person.isMovingUp() && elevators[i].elevatorDirection() && elevators[i].getDestinationFloor() > person.getCurrentFloor()) {
            newDistance = Math.abs(elevators[i].getCurrentFloor() - person.getCurrentFloor());
                if (distance > newDistance) {
                    distance = newDistance;
                    elevatorIndex = i;
                }
        }
    }

        System.out.println("Your elevator's number is " + elevators[elevatorIndex].getId());
        return elevators[elevatorIndex].getId();
    }

}
