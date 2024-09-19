class Demo8{
static void area(int r, int t){
double result = 1/2.0*r*r*t;
System.out.println(result);
}
public static void main (String[] args){
System.out.println("***main start***");
area(3,4);
area(4,5);
area(5,7);
System.out.println("***main end***");
}
}