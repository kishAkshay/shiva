class Demo6{
Double area(int a){
final double pi = 3.142;
double result = pi*a*a;
return result;
}
}
class Sample6{
public static void main(String[] args){
Demo6 ref = new Demo6();
double x =ref.area(5);
System.out.println(x);

}
}