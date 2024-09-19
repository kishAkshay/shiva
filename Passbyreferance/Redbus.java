class VRL{
void bus(){
System.out.println("seat booking");
}
}
class Redbus{
public static void main(String[] args){
VRL b1 = new VRL();
Passanger1.needbus(b1);
Passanger2.needbus(b1);
}
}
class Passanger1{
static void needbus(VRL b2){
	b2.bus();
}
}
class Passanger2{
static void needbus(VRL b3){
	b3.bus();
}
}