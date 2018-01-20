import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("enter the sides of the triangle: ");
        double side1= sc.nextDouble();
        double side2= sc.nextDouble();
        double side3= sc.nextDouble();

        System.out.println("enter color");
        String color= sc.next();

        System.out.print("Is the triangle filled (true / false)? ");
        boolean filled = sc.nextBoolean();


        // Create triangle object with user input
        triangle triangle = new triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);
        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ")
                + "filled");
    }
}
