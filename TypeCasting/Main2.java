class Demo2{
int a = 10;
int b =5;
void add(){
int c = a+b;
System.out.println(c);
}
}
class Sample2 extends Demo2{
int x=10;
int y=3;
void mult(){
int z = x*y;
System.out.println(z);
}
}
class Main2{
public static void main(String[] args){
Demo2 s1 = new Sample2();
s1.add();

Sample2 s2 = (Sample2)s1;
s2.mult();

 
 }
}

