class Sample1{
int a =10;
int b = 20;
final double pi = 3.142;
}
class Circle extends Sample1{
void area(){
double result = pi*a*a;
System.out.println("The area of the circle is " +result);
}
}
class Square extends Circle{
void area(){
super.area();
int result = b*b;
System.out.println("The area of square is "+result);
}
}
class Triangle extends Sample1{
void area(){
double result = 1/2.0*a*b;
System.out.println("The area of the triangle is " +result);
}
}
class Main4{
public static void main(String[] args){
Square s1 = new Square();
s1.area();
Triangle t1 = new Triangle();
t1.area();
}
}

