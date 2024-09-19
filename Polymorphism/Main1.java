class Animal{
void voice(){
System.out.println("All animal same voice");
}
}
class Cat extends Animal{
void voice(){
System.out.println("meow meow");
}
}
class Dog extends Animal{
void voice(){
System.out.println("bow bow");
}
}
class Snake extends Animal{
void voice(){
System.out.println("hiss hiss");
}
}
class Simulator{
static void sound(Animal a1){
a1.voice();
}
}
class Main1 {
public static void main(String[] args){
Cat c1 = new Cat();
Dog d1 = new Dog();
Snake s1 = new Snake();
Simulator.sound(c1);
Simulator.sound(d1);
Simulator.sound(s1);
}
}

