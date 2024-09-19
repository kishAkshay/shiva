class Circle{
int r = 5;
final double pi = 3.142;
void area(){
System.out.println("The area of the circle");
}
}
class Circle_cal extends Circle{
void area(){
super.area();
double result = pi*r*r;
System.out.println(result);
}
}
class Main1{
public static void main(String[] args){
Circle_cal c1 = new Circle_cal();
c1.area();
}
}

