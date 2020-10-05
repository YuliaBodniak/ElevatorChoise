package softserve.elevators;


public class Elevator {
    private int id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Elevator(int id, int currentFloor, int destinationFloor) {
        this.id = id;
        this.currentFloor = currentFloor;
        this.destinationFloor = destinationFloor;
    }

    public boolean elevatorDirection() {
        return (currentFloor < destinationFloor);
    }

    public static int isThereAnyElevatorsInMyDirection(Elevator[] elevators, Person person){
        int count = 0;
        for (int i = 0; i < elevators.length; i++) {
            if (elevators[i].elevatorDirection() == person.isMovingUp()){
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "Elevator{" +
                "id=" + id +
                ", currentFloor=" + currentFloor +
                ", destinationFloor=" + destinationFloor +
                '}';
    }


}
