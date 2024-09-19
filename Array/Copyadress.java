class Copyadress{
int a =10;
public static void main(String[] args){
Copyadress ref1 = new Copyadress();
Copyadress ref2 = ref1;
System.out.println(ref1.a);
System.out.println(ref2.a);
}
}
