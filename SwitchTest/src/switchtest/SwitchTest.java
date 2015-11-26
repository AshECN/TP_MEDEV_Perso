package switchtest;


public class SwitchTest {

    public static void main(String[] args) {
        String color = "red";
        String colorRGB;
        switch (color) {
            case "black":
                colorRGB = "000000";
                break;
            case "red":
                colorRGB = "ff0000";
                break;
            case "green":
                colorRGB = "008000";
                break;
            case "blue":
                colorRGB = "0000ff";
                break;
            default:
                colorRGB = "Invalid  color";
                break;
        }
        System.out.println(colorRGB);
    }
}
