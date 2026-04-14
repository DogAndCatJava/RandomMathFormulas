import java.util.Scanner;
import static ThreeDimensional.AreaAndVolumeFormulas.*;
import static TwoDimensional.TwoDimensional.*;

public class Full {
    public static void main(String[]args){
        final double PI = 3.141592654D;
        int whichFormula;
        String exit;
        Scanner input = new Scanner(System.in);
        String choose;
        for(exit = "N"; exit.equals("N") || exit.equals("n"); System.out.println("Ok")){
            System.out.println("3d formulas or 2d formulas:");
            choose = input.nextLine();
            if (choose.equals("2d")) {
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
            if (choose.equals("3d")) {
                System.out.println("Which Formula do you want to use? 1 is SA Cylinder and 2 is Volume Cylinder, 3 is SA Rectangular Prism,");
                System.out.println(" 4 is Volume Rectangular Prism, 5 is Volume of Triangular Prism, 6 is SA Triangular Prism");
                whichFormula = Integer.parseInt(input.nextLine());
                if (whichFormula == 1) {
                    SurfaceAreaCylinder(PI);
                }
                if (whichFormula == 2) {
                    VolumeCylinder(PI);
                }
                if (whichFormula == 3) {
                    SurfaceAreaCube();
                }
                if (whichFormula == 4) {
                    VolumeCube();
                }
                if (whichFormula == 5) {
                    VolumeTrianglePrism();
                }
                if (whichFormula == 6) {
                    SurfaceAreaTrianglePrism();
                }
            }
            System.out.println("Would you like to exit? Y or N");
            exit = input.nextLine();
        }
    }
}
