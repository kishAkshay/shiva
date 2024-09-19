class Demo1{
static void area(){
int b=10;
int h=5;
int result = b*h;
System.out.println(result);
}
}
class Sample1{
public static void main(String[] args){
System.out.println("***main start***");
Demo1.area();
System.out.println("***main end***");
}
}