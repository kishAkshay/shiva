class Sample1{
int a = 10;
int b = 10;
}
class Demo1 extends Sample1{
void add(){
int c = a+b;
System.out.println(c);
}
}
class Main2{
public static void main (String[] args){
Demo1 d1 = new Demo1();
d1.add();
}
}
