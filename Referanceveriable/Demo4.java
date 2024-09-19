class Demo4{
double area(){
int a=5;
int b=3;
final double pi = 3.142;
double result = pi*a*b;
return result;
}
public static void main (String[] args){
Demo4 ref = new Demo4();

System.out.println(ref);
}
}