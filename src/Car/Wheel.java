package Car;

public class Wheel {
    private int sizeWheel;
    private String sezon;

    public int getSizeWheel() {
        return sizeWheel;
    }

    public void setSizeWheel(int sizeWheel) {
        this.sizeWheel = sizeWheel;
    }

    public String getSezon() {
        return sezon;
    }

    public void setSezon(String sezon) {
        this.sezon = sezon;
    }

    public Wheel( int sizeWheel, String sezon){
        this.sizeWheel = sizeWheel;
        this.sezon = sezon;
    }

    public Wheel(){
        this.sizeWheel = 0;
        this.sezon = "NONE";
    }

    @Override
    public String toString() {
        return "wheel{" +
                "sizeWheel=" + sizeWheel +
                ", sezon='" + sezon + '\'' +
                '}';
    }

    public String changeWheel() {
        if (this.sezon.equalsIgnoreCase("Літо")) {
            System.out.println("Будь ласка замініть колеса на зимові");
            this.sezon = "Зима";
        } else if (this.sezon.equalsIgnoreCase("Зима")) {
            System.out.println("Будь ласка замініть колеса на літні");
            this.sezon = "Літо";
        }

        return this.sezon;
    }

}

