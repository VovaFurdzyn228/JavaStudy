package Car;

public class Helm {
    private int helmSize;
    private String helmPosition;

    public int getHelmSize() {
        return helmSize;
    }

    public void setHelmSize(int helmSize) {
        this.helmSize = helmSize;
    }

    public String getHelmPosition() {
        return helmPosition;
    }

    public void setHelmPosition(String helmPosition) {
        this.helmPosition = helmPosition;
    }

    public Helm(int helmSize, String helmPosition){
        this.helmSize = helmSize;
        this.helmPosition = helmPosition;
    }

    public Helm(){
        this.helmSize = 0;
        this.helmPosition = "None";
    }

    @Override
    public String toString() {
        return "helm{" +
                "helmSize=" + helmSize +
                ", helmPosition='" + helmPosition + '\'' +
                '}';
    }


}

