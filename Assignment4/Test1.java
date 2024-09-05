// Create a base class TwoD that contains two instance variable length and breadth 
// and a method area(). Three subclasses triangle, square and rectangle inherits the 
// base class TwoD and override the method area() according to their shape


class TwoD{
    int length;
    int breadth;
    TwoD(int length, int b){
        this.length=length;
        breadth=b;
    }
    int Area(){
        return length*breadth;
    }
    void display(){
        System.out.println("This a abstract shape.");
    }
}

class Triangle extends TwoD{
    Triangle(int l, int b){
        super(l,b);
    }
    int Area(){
        return length*breadth/2;
    }
    void display(){
        System.out.println("Shape 1 is Triangle with area "+Area());
    }
}

class Square extends TwoD{
    Square(int l) {
        super(l,l);
    }
    void display(){
        System.out.println("Shape 1 is Square with area "+Area());
    }
}

class Rectangle extends TwoD{
    Rectangle(int l, int b) {
        super(l,b);
    }
    void display(){
        System.out.println("Shape 1 is Rectangle with area "+Area());
    }
}

class Test1 {
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
