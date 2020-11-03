package git;

public class homework4_four {

    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println("The number of Circle objects is "+homework4_three.numberOfObjects);

        homework4_three c1=new homework4_three();

        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius ("+c1.radius+") and number of Circle objects ("+c1.numberOfObjects +")");

        homework4_three c2 =new homework4_three(5);

        c1.radius=9;

        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius ("+ c1.radius+") and number of Circle objects ("+c1.numberOfObjects+")");
        System.out.println("c2: radius ("+ c2.radius+") and number of Circle objects ("+c2.numberOfObjects+")");
    }

}