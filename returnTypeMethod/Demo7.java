class Demo7{
static double area(){
int r=10;
final double pi = 3.142;
double result = pi*r*r;
return result;
}
public static void main(String[] args){
double x = area();
System.out.println(x);
}
}