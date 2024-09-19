class Demo4{
public static void main(String[] args){
String s1 = "Virat is cricket player";
String s2 = "And he is hard work";
boolean start= s1.startsWith("Vi");
boolean ends=s1.endsWith("er");
boolean contain=s1.contains("s cri");
String substring = s1.substring(4,9);
String concating = s1.concat(" "+s2);


System.out.println(start);
System.out.println(ends);
System.out.println(contain);
System.out.println(substring);
System.out.println(concating);
}
}