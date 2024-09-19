class Demo7{
static void area(int r){
final double pi = 3.142;
double result = pi*r*r;
System.out.println(result);
}
public static void main (String[] args){
System.out.println("***main start***");
area(5);
area(7);
area(8);
System.out.println("***main end***");
}
}