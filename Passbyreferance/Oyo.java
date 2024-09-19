class Hotel{
void room(){
System.out.println("Hotel Rooms");
}
}
class Oyo{
public static void main(String[] args){
Hotel h1 = new Hotel();
cust1.needroom(h1);
cust2.needroom(h1);

}
}
class cust1{
static void needroom(Hotel h2){
h2.room();

}
}

class cust2{
static void needroom(Hotel h3){
h3.room();
}
}
