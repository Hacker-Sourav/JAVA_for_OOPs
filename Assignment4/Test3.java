// Check without having any abstract method/s whether a class can be abstract; if 
// so, then use that concrete method/s from another class having main method.

class Rectangle extends TwoD{
    Rectangle(int l, int b) {
        super(l,b);
    }
}

abstract class TwoD {
    int length;
    int breadth;
    TwoD(int length, int b){
        this.length=length;
        breadth=b;
    }
    int area(){
        return length*breadth;
    }
}

public class Test3 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 6);
        System.out.println("Area of the ractangle is "+ r.area());
    }
}
