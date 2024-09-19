class Tajhotel{
void food(){
System.out.println("Food Available");
}
}
class Zomato{
public static void main(String[] args){
Tajhotel f1 = new Tajhotel();
cust1.needfood(f1);
cust2.needfood(f1);
}
}
class cust1{
static void needfood(Tajhotel f2){
f2.food();
}
}class cust2{
static void needfood(Tajhotel f3){
f3.food();
}
}