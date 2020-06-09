package FOD;

public class Machine extends HeatManager {
    public Machine() {

    }

    String Machines[] = {"Machine 1", "Machine 2", "Machine 3"};

      //  Machines
    public String power; //kolichestvo edinici koito moje da proizvede mashinata//
    public String height;
    public String color;


    public Machine(String power, String height, String color) {

        this.power = power;
        this.height = height;
        this.color = color;
    }



    public String getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }


}
