package ThreeDimensional;
import java.lang.Math;
import java.util.Scanner;

public class AreaAndVolumeFormulas {

    public static void VolumeCylinder(final double PI) {
        double radius;
        double height;
        double VolumeCylinder;
        Scanner input = new Scanner(System.in);
        System.out.println("What is the Radius:");
        radius = Integer.parseInt(input.nextLine());

        System.out.println("What is the Height:");
        height = Integer.parseInt(input.nextLine());

        VolumeCylinder = PI * Math.pow(radius,2) * height;

        System.out.println(VolumeCylinder + "³");
    }
    public static void SurfaceAreaCylinder(final double PI) {
        double radius;
        double height;
        double SurfaceAreaCylinder;
        Scanner input = new Scanner(System.in);
        System.out.println("What is the Radius:");
        radius = Integer.parseInt(input.nextLine());

        System.out.println("What is the Height:");
        height = Integer.parseInt(input.nextLine());

        SurfaceAreaCylinder = 2 * PI * Math.pow(radius, 2) + 2 * PI * radius * height;

        System.out.println(SurfaceAreaCylinder + "²");
    }
    public static void SurfaceAreaCube() {
        double length;
        double height;
        double width;
        double SurfaceAreaCube;
        Scanner input = new Scanner(System.in);
        System.out.println("What is the Length:");
        length = Integer.parseInt(input.nextLine());

        System.out.println("What is the Height:");
        height = Integer.parseInt(input.nextLine());

        System.out.println("What is the Width:");
        width = Integer.parseInt(input.nextLine());

        SurfaceAreaCube = 2 * (length * width) + (length * height) + (width * height);
        System.out.println(SurfaceAreaCube + "²");
    }
    public static void VolumeCube() {
        Scanner input = new Scanner(System.in);
        double length;
        double height;
        double width;
        double VolumeCube;
        System.out.println("What is the Length:");
        length = Integer.parseInt(input.nextLine());

        System.out.println("What is the Height:");
        height = Integer.parseInt(input.nextLine());

        System.out.println("What is the Width:");
        width = Integer.parseInt(input.nextLine());

        VolumeCube = length * width * height;
        System.out.println(VolumeCube + "³");

    }
    public static void VolumeTrianglePrism() {
        double length;
        double height;
        double base;
        double VolumeTrianglePrism;
        Scanner input = new Scanner(System.in);
        System.out.println("What is the Length:");
        length = Integer.parseInt(input.nextLine());

        System.out.println("What is the Height:");
        height = Integer.parseInt(input.nextLine());

        System.out.println("What is the Base:");
        base = Integer.parseInt(input.nextLine());

        VolumeTrianglePrism = (float) (height * base * length) / 2;
        System.out.println(VolumeTrianglePrism + "³");
    }
    public static void SurfaceAreaTrianglePrism() {
        Scanner input = new Scanner(System.in);
        double length;
        double height;
        double base;
        double Side1;
        double Side2;
        double SurfaceAreaTrianglePrism;
        System.out.println("What is the Length:");
        length = Integer.parseInt(input.nextLine());

        System.out.println("What is the Height:");
        height = Integer.parseInt(input.nextLine());

        System.out.println("What is the Base:");
        base = Integer.parseInt(input.nextLine());

        System.out.println("What is the Side1:");
        Side1 = Integer.parseInt(input.nextLine());

        System.out.println("What is the Side2:");
        Side2 = Integer.parseInt(input.nextLine());

        SurfaceAreaTrianglePrism = (Side1 + Side2 + base) * length + base * height;
        System.out.print(SurfaceAreaTrianglePrism + "²");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int WhichFormula;
        /* If WhichFormula is set to "1", then it finds the surface area of a cylinder, "2" is the area of a cylinder, "3" is SA rectangular prism, "4" is Area rectangular prism, "5" is Volume of Triangular Prism, and "6" is SA of Rectangular Prism */
        final double PI = 3.141592654D;
        System.out.println("Which Formula do you want to use? 1 is SA Cylinder and 2 is Volume Cylinder, 3 is SA Rectangular Prism,");
        System.out.println(" 4 is Volume Rectangular Prism, 5 is Volume of Triangular Prism, 6 is SA Triangular Prism");
        WhichFormula = Integer.parseInt(input.nextLine());
        if (WhichFormula == 1) {
           SurfaceAreaCylinder(PI);
        }

        if (WhichFormula == 2) {
            VolumeCylinder(PI);
        }
        if (WhichFormula == 3) {
            SurfaceAreaCube();
        }
        if (WhichFormula == 4) {
            VolumeCube();
        }
        if (WhichFormula == 5) {
            VolumeTrianglePrism();
        }
        if (WhichFormula == 6) {
            SurfaceAreaTrianglePrism();
        }

    }

}
