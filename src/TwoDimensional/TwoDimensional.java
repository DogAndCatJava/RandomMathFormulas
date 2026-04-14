package TwoDimensional;
import java.util.Scanner;
import java.lang.Math;

public class TwoDimensional {
    public static void circle(double PI) {
        Scanner input = new Scanner(System.in);
        float radius;
        float circle;
        System.out.println("What is the radius:");
        radius = Integer.parseInt(input.nextLine());

        circle = (float) (PI * Math.pow(radius, 2));
        System.out.println(circle + "²");
    }
    public static void triangle() {
        Scanner input = new Scanner(System.in);
        float height;
        float base;
        float triangle;
        System.out.println("What is the base:");
        base = Integer.parseInt(input.nextLine());

        System.out.println("What is the height:");
        height = Integer.parseInt(input.nextLine());

        triangle = base * height / 2;
        System.out.println(triangle + "²");
    }
    public static void rectangle() {
        Scanner input = new Scanner(System.in);
        float width;
        float length;
        float rectangle;
        System.out.println("What is the length:");
        length = Integer.parseInt(input.nextLine());

        System.out.println("What is the width:");
        width = Integer.parseInt(input.nextLine());

        rectangle = length * width;
        System.out.println(rectangle + "²");

    }
    public static void pythagoreanTheorem() {
        Scanner input = new Scanner(System.in);
        float side1;
        float side2;
        float diagonal;
        float pythag;
        System.out.println("Do you know side A and B (Type 1) or B and C (Type 2)");
        pythag = Integer.parseInt(input.nextLine());
        if (pythag == 1) {
            System.out.println("What is Side A:");
            side1 = Integer.parseInt(input.nextLine());

            System.out.println("What is Side B:");
            side2 = Integer.parseInt(input.nextLine());

            diagonal = (float) (Math.pow(side1, 2) + Math.pow(side2, 2));
            diagonal = (float) (Math.sqrt(diagonal));

            System.out.println(diagonal);
        }
            if (pythag == 2) {
                System.out.println("What is Side B:");
                side1 = Integer.parseInt(input.nextLine());

                System.out.println("What is Side C:");
                side2 = Integer.parseInt(input.nextLine());

                diagonal = (float) (Math.pow(side2,2) - (Math.pow(side1,2)));
                diagonal = (float) Math.sqrt(diagonal);

                System.out.println(diagonal);
            }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int whichFormula;
        final double PI = 3.141592654D;
        System.out.println("Press 1 for area of rectangle, 2 for area of triangle, 3 for area of circle, and 4 is pythag");
        whichFormula = Integer.parseInt(input.nextLine());
        if (whichFormula == 1) {
            rectangle();
        }

        if (whichFormula == 2) {
            triangle();
        }

        if (whichFormula == 3) {
            circle(PI);
        }

        if (whichFormula == 4) {
            pythagoreanTheorem();
        }
    }
}
