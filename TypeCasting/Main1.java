class Demo1{
int x =10;
int y =20;
void fo(){
System.out.println("hello java");
}
}
class Sample1 extends Demo1{
void add(){
int z = x+y;
System.out.println(z);
}
}
class Main1{
public static void main(String[] args){
Demo1 d1 = new Sample1();
d1.fo();
Sample1 s1= (Sample1)d1;
s1.add();

}
}
