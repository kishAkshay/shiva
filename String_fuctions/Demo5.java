class Demo5{
public static void main(String[] args){
String s1 = "java";
String rev = " ";

for(int i=s1.length()-1; i>0; i--)
{
	rev=rev+s1.charAt(i);
}

if (s1.equals(rev))
{
System.out.println("It is equal");
}else{
System.out.println("It is not equal");
}
}
}