class Ola{
static String ride(String vehicle){
return vehicle;
}
static int ride (int number){
return number;
}
static void ride (int model, String colour){
System.out.println("The model of the Vehical is "+model +" And the colour of the Vehical is " +colour);
}
static String ride (String colour, int model){
  return "Colour: " + colour + ", Model: " + model;
}
}
class Main2{
public static void main(String[] args){
Ola o1 = new Ola();
String v1=o1.ride("innova");
System.out.println("The Vehicle name is "+ v1);
int n1 = o1.ride(2346);
System.out.println("The vehicle number is "+n1);
o1.ride(2020, "silver");
String m1 = o1.ride ("silver", 2020);
System.out.println(m1);
}
}
