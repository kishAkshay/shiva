class Amezon_1{
void sell(){
System.out.println("Selling books");
}
}
class Amezon_2{
void sell(){
System.out.println("Selling books, electronics,cloths");
}
}
class Main3{
public static void main(String[] args){
Amezon_2 a1 = new Amezon_2();
a1.sell();
}
}