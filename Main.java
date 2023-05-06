import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Geometry geometry = new Geometry();
        geometry.accessingPi();

        Scanner input = new Scanner(System.in);
        try{
            float length = input.nextFloat();
            float breadth = input.nextFloat();

            System.out.println(geometry.areaOfTriangle(breadth, length));
        }catch (InputMismatchException ime){
            System.out.println("Enter a valid number");
        }catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}
