import java.util.*;

class Complex {
    private int real      = 0;
    private int imaginary = 0;

    public Complex(int real, int imaginary) {
        this.real      = real;
        this.imaginary = imaginary;
    }

    public Complex() {}

    public Complex(Complex number) {
        this.real      = number.real;
        this.imaginary = number.imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void addWithComplex(Complex numberToAdd) {
        real      += numberToAdd.real;
        imaginary += numberToAdd.imaginary;
    }

    public void showNumber() {
        Integer real      = this.real;
        Integer imaginary = this.imaginary;
        Integer imaginaryModulus = -imaginary;

        if (imaginary < 0) {
            System.out.println(real.toString() + " - i * " + imaginaryModulus.toString());
        } else if (imaginary > 0) {
            System.out.println(real.toString() + " + i * " + imaginary.toString());
        } else {
            System.out.println(real);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int real      = scanner.nextInt();
        int imaginary = scanner.nextInt();

        System.out.println("Constructors test:\n");

        Complex c1 = new Complex(real, imaginary);
        c1.showNumber();

        Complex c2 = new Complex(c1);
        c2.showNumber();

        Complex c3 = new Complex();
        c3.showNumber();

        System.out.println("\nAddWithComplex test:\n");

        c1.addWithComplex(c2);
        c1.showNumber();

        c2.addWithComplex(c3);
        c2.showNumber();

        System.out.println("\nGetters and setters test:\n");

        System.out.println(c3.getReal() + " " + c3.getImaginary());
        c3.setReal(6);
        c3.setImaginary(-4);
        System.out.println(c3.getReal() + " " + c3.getImaginary());

        scanner.close();
    }
}