class Mobile{
static void info(int price){
System.out.println("The price of mobile is "+ price);
}
String info(String name){
return name;
}
static void info(int price, String name){
System.out.println("The price of the mobile is "+price +" The name of the mobile is "+ name);
}
String info(String name, int price){
return "The name of the mobile is " + name + "The price of the mobile is "+price;
}
}
class M3ain4{
public static void main(String[] args){
Mobile m1 = new Mobile();
m1.info(50000);
String mobile_name = m1.info("iPhone");
System.out.println("The name of the mobile is "+mobile_name);
m1.info(50000,"iphone");
String mobile_price_name = m1.info("iPhone", 50000);
System.out.println(mobile_price_name);
}
}

