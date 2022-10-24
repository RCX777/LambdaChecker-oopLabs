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
        String  flavor  = scanner.next();
        String  origin  = scanner.next();
        float   length  = scanner.nextFloat();
        float   width   = scanner.nextFloat();
        float   height  = scanner.nextFloat();
        float   radius  = scanner.nextFloat();
        
        Lindt     lindtBoxDefault   = new Lindt();
        Lindt     lindtCandyBox     = new Lindt(flavor, origin, length, width, height);
        Baravelli baravelliCandyBox = new Baravelli(flavor, origin, radius, height);
        ChocAmor  chocAmorCandyBox  = new ChocAmor(flavor, origin, length);
        
        System.out.println(lindtBoxDefault);
        System.out.println(lindtCandyBox);
        System.out.println(baravelliCandyBox);
        System.out.println(chocAmorCandyBox);

        scanner.close();
    }
}