class Sample{
int a=10;
static void girl(Sample s2){
System.out.println(s2.a);
}
public static void main(String[] args){
Sample s1= new Sample();
System.out.println(s1.a);
girl(s1);
}
}

