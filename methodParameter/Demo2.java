class Demo2{
static void area(int w, int h){
int result = w*h;
System.out.println(result);
}
public static void main(String[] args){
System.out.println("***main start***");
area(3,4);
area(5,6);
area(7,9);
System.out.println("***main end***");
}
}