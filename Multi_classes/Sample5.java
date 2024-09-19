class Demo5{
static void area(){
int a=10;
int result = a*a;
System.out.println(result);
}
}
class Sample5{
public static void main(String[] args){
System.out.println("***main start***");
Demo5.area();
System.out.println("***main end***");
}
}