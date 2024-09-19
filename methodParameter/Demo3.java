class Demo3{
static void area(int a, int b, int c){
double result = 1/2.0*(a*b)*c;
System.out.println(result);
}
public static void main(String[] args){
System.out.println("****main start***");
area(3,4,5);
area(5,2,7);
area(5,1,9);
System.out.println("***main end***");
}
}