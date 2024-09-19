class Sample1{
int a = 5;
int b =5;
int c;
}
class Demo1 extends Sample1{
void add(){
c = a+b;
System.out.println(c);
}
}
class Demo2 extends Demo1{
final double pi = 3.142;
void area(){
add();
double result = pi*c*c;
System.out.println(result);
}
}
class Main1{
public static void main(String[] args){
Demo2 d1 = new Demo2();
d1.area();
}
}