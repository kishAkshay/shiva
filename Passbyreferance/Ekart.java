class Amezon{
void product(){
System.out.println("Amezon Products");
}
}
class Ekart{
public static void main(String[] args){
Amezon p1 = new Amezon();
cust1.needprod(p1);
cust2.needprod(p1);

}
}
class cust1{
static void needprod(Amezon p2){
	p2.product();
}
}
class cust2{
static void needprod(Amezon p3){
	p3.product();

}
}