class Demo1{
void disp(){
System.out.println("Hello Java");
}
}
class Sample1 extends Demo1{
void fo(){
System.out.println("Hello Selenium");
}
}
class Main3{
public static void main(String[] args){
Demo1 s1 = new Sample1();
s1.disp();
Sample1 s2 = (Sample1)s1;
s2.fo();
}
}