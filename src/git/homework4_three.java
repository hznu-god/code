package git;

public class homework4_three {
    double radius;
    static int numberOfObjects = 0;
    homework4_three(){
        numberOfObjects++;
    }
    homework4_three(double radius){
        this.radius=radius;
        numberOfObjects++;
    }

    static int getNumberOfObjects(){
        return numberOfObjects;
    }

    double getArea(){
        return radius*radius*Math.PI;
    }
}
