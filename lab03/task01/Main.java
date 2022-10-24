import java.util.*;

class CandyBox {
    private String flavor;
    private String origin;
    
    public CandyBox() {
        flavor = "sugar-free";
        origin = "Switzerland";
    }

    public CandyBox(String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    public float getVolume() {
        return 0;
    }

    public String toString() {
        return "The " + origin + " " + flavor + " chocolate";
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flavor = scanner.next();
        String origin = scanner.next();

        CandyBox candyBoxDefault = new CandyBox();
        CandyBox candyBox = new CandyBox(flavor, origin);
        
        System.out.println("Constructor with no parameters test:");
        System.out.println(candyBoxDefault + "\n");
        
        System.out.println("Constructor with parameters test:");
        System.out.println(candyBox + "\n");
        
        System.out.println("getVolume() test:");
        System.out.println(candyBox + " has volume " + candyBox.getVolume());

        scanner.close();
        
    }
}