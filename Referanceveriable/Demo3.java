class Demo3{
void area(int a, int b, int c){
double result = 1/2.5*(a+b)*c;
System.out.println(result);
}
public static void main(String[] args){
Demo3 ref = new Demo3();
ref.area(5,6,7);
ref.area(1,9,3);
}
}