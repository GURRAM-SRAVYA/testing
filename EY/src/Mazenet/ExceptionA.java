package Mazenet;
public class ExceptionA extends Exception{
ExceptionA(){
super();
}
ExceptionA(String str){
super(str);
}
@Override
public String getMessage() {

return super.getMessage();
}
@Override
public String toString() {

return super.toString();
}
}
class ExceptionB extends ExceptionA {
ExceptionB(){
super();
}
ExceptionB(String str){
super(str);
}
@Override
public String getMessage() {
return super.getMessage();
}
@Override
public String toString() {

return super.toString();
}
}
class ExceptionC extends ExceptionB{
ExceptionC(){
super();
}
ExceptionC(String str){
super(str);
}
@Override
public String getMessage() {

return super.getMessage();
}
@Override
public String toString() {

return super.toString();
}
}
