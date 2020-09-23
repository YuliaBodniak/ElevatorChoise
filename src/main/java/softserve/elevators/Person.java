package softserve.elevators;

public class Person {
    private int currentFloor;
    private boolean movingUp = true;

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public boolean isMovingUp() {
        return movingUp;
    }

    public void setMovingUp(boolean movingUp) {
        this.movingUp = movingUp;
    }

    public Person(int currentFloor, boolean movingUp) {
        this.currentFloor = currentFloor;
        this.movingUp = movingUp;
    }

    @Override
    public String toString() {
        return "Elevators.Person{" +
                "currentFloor=" + currentFloor +
                ", movingUp=" + movingUp +
                '}';
    }
}