class Demo{
int x=10;
}
class Sample extends Demo{
void vo(){
System.out.println("Hi");
}
}
class Main4{
public static void main(String[] args){
System.out.println("Up casting");
Demo d1 = new Sample();
System.out.println(d1.x);
System.out.println("Down casting");
Sample s1 = (Sample)d1;
System.out.println(s1.x);
s1.vo();
}
}