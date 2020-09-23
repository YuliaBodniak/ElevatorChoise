package softserve.elevators;


public class Elevator {
    private int currentFloor;
    private int destinationFloor;

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }

    public void setDestinationFloor(int destinationFloor) {
        this.destinationFloor = destinationFloor;

    }
    public Elevator(int currentFloor, int destinationFloor) {
        this.currentFloor = currentFloor;
        this.destinationFloor = destinationFloor;
    }

    public boolean elevatorDirection() {
        boolean elevatorDirection;
        if (currentFloor < destinationFloor) {
            elevatorDirection = true;
        } else {
            elevatorDirection = false;
        }
        return elevatorDirection;
    }


    @Override
    public String toString() {
        return "Elevator{" +
                "currentFloor=" + currentFloor +
                ", destinationFloor=" + destinationFloor +
                '}';
    }
}
