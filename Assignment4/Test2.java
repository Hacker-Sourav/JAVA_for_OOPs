// Do the problem 2 using abstract class

class Triangle extends TwoD{
    Triangle(int l, int b){
        super(l,b);
    }
    int area(){
        return length*breadth/2;
    }
    void display(){
        System.out.println("Shape 1 is Triangle with area "+area());
    }
}

class Square extends TwoD{
    Square(int l) {
        super(l,l);
    }
    int area(){
        return length*length;
    }
    void display(){
        System.out.println("Shape 1 is Square with area "+area());
    }
}

class Test2 {
    public static void main(String[] args) {
        System.out.println("Hello, Let me introduce myself, I'm Sourav...");

        TwoD s1 = new Triangle(10, 8);
        TwoD s2 = new Square(6);
        TwoD s3 = new Rectangle(5, 9);
        
        s1.display();
        s2.display();
        s3.display();       
    }
}

class Rectangle extends TwoD{
    Rectangle(int l, int b) {
        super(l,b);
    }
    void display(){
        System.out.println("Shape 1 is Rectangle with area "+area());
    }
    int area(){
        return length*breadth;
    }

}

abstract class TwoD {
    int length;
    int breadth;
    TwoD(int length, int b){
        this.length=length;
        breadth=b;
    }
    abstract int area();
    abstract void display();
}