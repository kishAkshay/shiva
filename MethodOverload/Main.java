class Whatsapp{
 String send(String text){
return text;
}
 int send(int number){
return number;
}
static void send(String text, int number){
System.out.println("The text message is "+text +" The number is "+number);
}
 static void send(int number, String text){
System.out.println("The number is "+number + " The text message is "+text);
}
}
class Main{
public static void main(String[] args){
Whatsapp w = new Whatsapp();
w.send(900630204, "Hi");
String mesg=w.send("Good");
w.send("Nice", 789123453);
int num=w.send(89898989);
System.out.println("The text message is "+mesg);
System.out.println("The number is "+num);


}
}
