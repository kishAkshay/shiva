class Demo2{
double area(int b, int h){
double result = 1/2.0*b*h;
return result;
}
public static void main (String[] args){
double x =new Demo2().area(5,10);
System.out.println(x);
}
}