class Demo8{
static void area(){
int r=5;
int t= 7;
double result = 1/2.0*r*r*t;
System.out.println(result);
}
}
class Sample8{
public static void main(String[] args){
System.out.println("***main start***");
Demo8.area();
System.out.println("***main end***");
}
}
