class Demo2{
static void area(){
int w=10;
int h=20;
int result = w*h;
System.out.println(result);
}
}
class Sample2{
public static void main(String[] args){
System.out.println("***main start***");
Demo2.area();
System.out.println("***main end***");
}
}

