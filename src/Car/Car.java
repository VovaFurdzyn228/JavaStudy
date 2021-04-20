package Car;

public class Car {
    private String name;
    private int yearOfCreation;
    private Body body;
    private Helm helm;
    private Wheel wheel;

    public Car(String name, int yearOfCreation, int numberOfDoors, String color, int helmSize,
               String helmposition, int sizeWheel, String sezon){
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.body = new Body(numberOfDoors, color);
        this.helm = new Helm(helmSize, helmposition);
        this.wheel = new Wheel(sizeWheel, sezon);
    }

    public String getName() {
        return name;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public Body getBody() {
        return body;
    }

    public Helm getHelm() {
        return helm;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearOfCreation=" + yearOfCreation +
                ", body=" + body +
                ", helm=" + helm +
                ", wheel=" + wheel +
                '}';
    }

    public void multiColorCar(String additionalColor) {
        this.body.addColor(additionalColor);
    }
}
