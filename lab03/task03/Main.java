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
    
    // Getters and Setters

    public void setLength(float length) {
        this.length = length;
    }

    public float getLength() {
        return length;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flavor   = scanner.next();
        String origin   = scanner.next();
        
        CandyBox candyBox     = new CandyBox(flavor, origin);
        CandyBox candyBoxCopy = new CandyBox(flavor, origin);
        CandyBox candyBox2    = new CandyBox("vanilla", "Belgium");
        
        Lindt lindtBox        = new Lindt();
        Lindt lindtBoxCopy    = new Lindt();
        Lindt lindtBox2       = new Lindt("vanilla", "Belgium", 2.0f, 2.0f, 4.0f);
        
        System.out.println(candyBox.equals(candyBoxCopy));
        System.out.println(candyBox.equals(candyBox2));
        
        System.out.println(lindtBox.equals(lindtBoxCopy));
        System.out.println(lindtBox.equals(lindtBox2));

        scanner.close();
    }
}