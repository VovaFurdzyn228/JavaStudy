package Car;

public class Body {
    private int numberOfDoors;
    private String color;

    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors = numberOfDoors;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public Body (int numberOfDoors, String color){
        this.numberOfDoors = numberOfDoors;
        this.color = color;
    }

    public Body(){
        this.numberOfDoors = 0;
        this.color = "NONE";
    }

    @Override
    public String toString() {
        return "body{" +
                "numberOfDoors=" + numberOfDoors +
                ", color='" + color + '\'' +
                '}';
    }

    public void addColor(String color) {
        this.color += " and " + color;
    }

}

