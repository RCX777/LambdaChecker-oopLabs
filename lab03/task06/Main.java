import java.util.*;
import java.lang.Math;

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

    @Override
    public boolean equals(Object object) {
        if (this.getClass() != object.getClass())
            return false;
        
        if (this.flavor != ((CandyBox)object).flavor &&
            this.origin != ((CandyBox)object).origin)
            return false;
        
        return true;
    }

    // Overridden child methods

    public void printLindtDim()     {}
    public void printBaravelliDim() {}
    public void printChocAmorDim()  {}

    public void printCandyBox() {}

    // Getters and Setters

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

class Lindt extends CandyBox {
    private float length;
    private float width;
    private float height;
    
    public Lindt() {
        super();
    }

    public Lindt(String flavor, String origin,
                 float  length, float width, float height) {
        super(flavor, origin);
        this.length = length;
        this.width  = width;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return "Lindt: " + super.toString() + " has volume " + this.getVolume();
    }

    @Override
    public void printLindtDim() {
        System.out.println("Lindt: " + Float.valueOf(length).toString() + " "
                                     + Float.valueOf(width).toString()  + " "
                                     + Float.valueOf(height).toString());
    }

    @Override
    public void printCandyBox() {
        this.printLindtDim();
    }

    // Getters and Setters

    public void setLength(float length) {
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getWidth() {
        return width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }
}

class Baravelli extends CandyBox {
    private float radius;
    private float height;

    public Baravelli() {
        super();
    }

    public Baravelli(String flavor, String origin,
                     float  radius, float height) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }
    
    @Override
    public float getVolume() {
        return ((float)Math.PI) * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Baravelli: " + super.toString() + " has volume " + this.getVolume();
    }

    @Override
    public void printBaravelliDim() {
        System.out.println("Baravelli: " + Float.valueOf(radius).toString() + " "
                                         + Float.valueOf(height).toString());
    }

    @Override
    public void printCandyBox() {
        this.printBaravelliDim();
    }
    
    // Getters and Setters

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }
}

class ChocAmor extends CandyBox{
    private float length;
    
    public ChocAmor() {
        super();
    }
    
    public ChocAmor(String flavor, String origin,
                    float  length) {
        super(flavor, origin);
        this.length = length;
    }
    
    @Override
    public float getVolume() {
        return length * length * length;
    } 

    @Override
    public String toString() {
        return "ChocAmor: " + super.toString() + " has volume " + this.getVolume();
    }

    @Override
    public void printChocAmorDim() {
        System.out.println("ChocAmor: " + Float.valueOf(length).toString());
    }

    @Override
    public void printCandyBox() {
        this.printChocAmorDim();
    }
    
    // Getters and Setters

    public void setLength(float length) {
        this.length = length;
    }

    public float getLength() {
        return length;
    }
}

class CandyBag {
    // Add ArrayList as field "candies"
    private ArrayList<CandyBox> candies;

    // Constructor which populates the array list (the default gift)
    public CandyBag() {
        candies  =  new ArrayList<CandyBox>();
        candies.add(new Lindt("cherry", "Austria", 20.0f, 5.4f, 19.2f));
        candies.add(new Lindt("apricot", "Austria", 20.0f, 5.4f, 19.2f));
        candies.add(new Lindt("strawberry", "Austria", 20.0f, 5.4f, 19.2f));
        candies.add(new Baravelli("grape", "Italy", 6.7f, 8.7f));
        candies.add(new ChocAmor("coffee", "France", 5.5f));
        candies.add(new ChocAmor("vanilla", "France", 5.5f));
    }

    // Add getter and setter

    /**
     * @param candies the candies to set
     */
    public void setCandies(ArrayList<CandyBox> candies) {
        this.candies = candies;
    }

    /**
     * @return the candies
     */
    public ArrayList<CandyBox> getCandies() {
        return candies;
    }
}

class Area {
    CandyBag candyBag;
    int      number;
    String   street;
    String   message;
    
    public Area() {
        candyBag = null;
        number   = 0;
        message  = "";
        street   = "nowhere";
    }

    public Area(int number, String street, String message, CandyBag candyBag) {
        this.candyBag = candyBag;
        this.number   = number;
        this.message  = message;
        this.street   = street;
    }
    
    public void getBirthdayCard() {
        System.out.println("Street " + street + ", number " + Integer.valueOf(number).toString()
                                  + "\n\n" + message + "\n");
        
        for (int i = 0; i < candyBag.getCandies().size(); i++) {
			if (candyBag.getCandies().get(i) instanceof Lindt) {
                candyBag.getCandies().get(i).printLindtDim();
            } else if (candyBag.getCandies().get(i) instanceof Baravelli) {
                candyBag.getCandies().get(i).printBaravelliDim();
            } else if (candyBag.getCandies().get(i) instanceof ChocAmor) {
                candyBag.getCandies().get(i).printChocAmorDim();
            }
		}
    }
    
    public void getBirthdayCardv2() {
        System.out.println("Street " + street + ", number " + Integer.valueOf(number).toString()
                                  + "\n\n" + message + "\n");
        
        for (int i = 0; i < candyBag.getCandies().size(); i++) {
            candyBag.getCandies().get(i).printCandyBox();
		}
    }
    
    // Getters and setters

    /**
     * @return the candyBag
     */
    public CandyBag getCandyBag() {
        return candyBag;
    }

    /**
     * @param candyBag the candyBag to set
     */
    public void setCandyBag(CandyBag candyBag) {
        this.candyBag = candyBag;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String street = scanner.next();
        String message = scanner.next();
                
        Area area = new Area(number, street, message, new CandyBag());
        
        System.out.println("With instanceof:");
        area.getBirthdayCard();
        System.out.println();
        System.out.println("Without instanceof:");
        area.getBirthdayCardv2();
    }
}