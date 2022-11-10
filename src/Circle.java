public class Circle {
    static float PI = (float) Math.PI;

    static int radius;

    static float area(){
        return PI*(radius*radius);

    }
    static float circumference(){
        return 2*PI*radius;
    }
}
