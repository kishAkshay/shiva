class Demo5{
double area(int a, int b, int c){
final double pi = 3.142;
double result = pi*1/2.0*(a+b)*c;
return result;
}
public static void main(String[] args){
Demo5 ref = new Demo5();
double ans1 = ref.area(1,3,5);
double ans2 = ref.area(4,2,6);
System.out.println(ans1);
System.out.println(ans2);
}
}

