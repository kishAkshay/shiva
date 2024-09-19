class Demo6{
static void area(){
int b=10;
int h=14;
int result = b*h;
System.out.println(result);
}
}
class Sample6{
public static void main(String[] agrs){
System.out.println("***main start***");
Demo6.area();
System.out.println("***main end***");
}
}