class Demo2{
int x; 
int y;
Demo2(int a, int b){
x=a;
y=b;
}
public static void main(String[] args){
Demo2 ref = new Demo2(5,10);

System.out.println(ref.x);
System.out.println(ref.y);
}
}