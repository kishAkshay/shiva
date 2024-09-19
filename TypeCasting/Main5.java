class Demo1{
void disp(){
System.out.println("Hi");
}
}
class Sample1 extends Demo1{
void tata(){
System.out.println("Helo");
}
}
class Main5{
public static void main(String[] args){
System.out.println("Up casting");
Demo1 d1 = new Sample1();
d1.disp();
System.out.println("Down casting");
Sample1 s1 = (Sample1)d1;
s1.disp();
s1.tata();
}
}