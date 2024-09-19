class Demo4{
static void area(){
int a=5;
int b=6;
final double pi=3.142;
double result = pi*a*b;
System.out.println(result);
}
}
class Sample4{
public static void main (String[] args){
System.out.println("***main start***");
Demo4.area();
System.out.println("***main end***");
}
}