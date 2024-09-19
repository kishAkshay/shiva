class Demo1{
static void area(int r){
final double pi = 3.142;
double result = pi*r*r;
System.out.println(result);
}
}
class Sample1{
public static void main(String[] args){
System.out.println("***main start***");
Demo1.area(5);
System.out.println("***main end***");
}
}