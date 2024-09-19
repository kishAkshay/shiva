class Mobile{
String info(String name){
return name;
}
void info(int price){
System.out.println("The price of the mobile is "+ price);
}
void info (String colour, double display){
System.out.println("The colour of the mobile is "+ colour +" And display is "+display);
}
String info (double display, String colour){
return "The display of mobile is " + display +" and colour of the mobile is " + colour;
}
}
class Main3{
public static void main(String[] args){
Mobile m1 = new Mobile();
String n1 = m1.info("OnePlus"); 
System.out.println(" The name of the mobile is "+n1);
m1.info(60000);
m1.info("Balck",6.3);
String x = m1.info(6.3, "Black");
System.out.println(x);
}
}




