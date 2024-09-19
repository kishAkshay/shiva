class Demo3{
static void area(){
int a=4;
int b=5;
int h=7;
double result = 1/2.0*(a+b)*h;
System.out.println(result);
}
}
class Sample3{
public static void main(String[] args){
System.out.println("***main start***");
Demo3.area();
System.out.println("***main end***");
}
}