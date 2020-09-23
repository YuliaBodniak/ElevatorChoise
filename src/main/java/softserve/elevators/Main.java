package softserve.elevators;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number of elevators:");
        int numberOfElevator = scanner.nextInt();
        Elevator[] elevators = new Elevator[numberOfElevator];

        System.out.println("Enter for each elevator current floor and destination floor:");
        for (int i = 0; i < numberOfElevator; i++) {
            elevators[i] = new Elevator(scanner.nextInt(), scanner.nextInt());
        }

        System.out.println("Enter your current floor and choose up (true) or down (false):");
        Person person = new Person(scanner.nextInt(), scanner.nextBoolean());

        int distance;
        int elevatorIndex = 0;
        int newDistance = Integer.MAX_VALUE;

        for (int i = 0; i < numberOfElevator; i++) {
            if (elevators[i].getDestinationFloor() != elevators[i].getCurrentFloor()
                    && elevators[i].elevatorDirection() == person.isMovingUp()
                    && elevators[i].getDestinationFloor() >= person.getCurrentFloor()) {
                distance = Math.abs(elevators[i].getCurrentFloor() - person.getCurrentFloor());
                if(newDistance>distance){
                    newDistance=distance;
                    elevatorIndex = i;
                }
            }
        }

        System.out.println("Your elevator is " + elevators[elevatorIndex].toString());
    }}


