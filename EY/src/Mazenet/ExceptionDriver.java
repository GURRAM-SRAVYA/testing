package Mazenet;

public class ExceptionDriver extends Exception{
public static void main(String[] args) {
int[] arr = {1,2,3};
try{
check(arr);
}
catch(ExceptionA e) {
System.out.println(e.getMessage());
}finally {
System.out.println("Done");
}
}
public static void check(int[] arr) throws ExceptionA{
for(int i:arr) {
if(i==1) {
throw new ExceptionA("ExceptionA is thrown");
}
else if(i==2) {
throw new ExceptionB("ExceptionB is thrown");
}
else if(i==3) {
throw new ExceptionC("ExceptionC is thrown");
}
}
}
}