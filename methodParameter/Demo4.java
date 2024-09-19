class Demo4{
static void area (int a, int b){
final double pi = 3.142;
double result = pi*a*b;
System.out.println(result);
}
public static void main (String[] args){
System.out.println("***main start***");
area(4,5);
area(5,8);
area(8,9);
System.out.println("***main end***");
}
}