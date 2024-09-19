class Sample1{
int a = 10;
int b = 20;
int c;
int d;
}
class Demo1 extends Sample1{
void add(){
 c = a+b;
System.out.println("The sum of a and b is " +c);
}
}
class Demo2 extends Sample1{
void mult(){
 d = a*b;
System.out.println("The product of a and b is "+d);
}
}
class Main3{
public static void main(String[] args){
Demo1 d1 = new Demo1();
d1.add();
Demo2 d2 = new Demo2();
d2.mult();
}
} 
