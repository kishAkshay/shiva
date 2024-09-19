class Demo1{
static double area(){
int b =5;
int h=4;
double result = 1/2.0*b*h;
return result;
}
}
class Sample1{
public static void main(String[] args){
System.out.println("***main start***");
double x=Demo1.area();
System.out.println(x);
System.out.println("****main end***");
}
}
