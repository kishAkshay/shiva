class Demo7{
static void area(){
int r=6;
final double pi = 3.142;
double result = pi*r*r;
System.out.println(result);
}
}
class Sample7{
public static void main(String[] args){
System.out.println("***main start***");
Demo7.area();
System.out.println("***main end***");
}
}
