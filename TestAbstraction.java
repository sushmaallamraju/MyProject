public class TestAbstraction{

public static void main(String args[]){
 Shape s = new Circle();
 //Circle c =new Circle();
// s.draw();
s.draw();
}

}

abstract class Shape{
 abstract void draw();


}
class Rectangle extends Shape{
void draw(){
System.out.println("drawing Rectangle");


}
}
class Circle extends Shape{

void draw(){

System.out.println("drawing circle");

}
}







