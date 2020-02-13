package solidDemo;

/*interface Uber {
int trackDistance(int x,int y);(let x,y be co-ordinates)
void getOTP();
void CabDetails();
void rating();
}
class Driver implements Uber {

@Override
public int trackDistance(int x,int y) {
  return Math.abs(x-y);
}

@Override
public void getOTP() {
    System.out.println(Math.random());
}

@Override
public void CabDetails() {
  // doesn't require this method
}

@Override
public void rating {
   // doesn't require this method
}
}
class User implements Uber {

@Override
public int trackDistance(int x,int y) {
 return Math.abs(x-y);
}

 @Override
public void getOTP() {
    System.out.println(Math.random());
}

@Override
public void CabDetails() {
  System.out.println("Name of the driver: Md Sameer");
  System.out.println("Name of the car: Audi S9");
  System.out.println("Car Number: AP 29 EX 1920");
}

@Override
public void rating {
    System.out.println(3);
}
}*/
interface DriverHelper
{
int trackDistance(int x,int y);//(let x,y be co-ordinates)
void getOTP();
}

interface UserHelper {
void cabDetails();
void rating();
}
class Driver implements DriverHelper {

@Override
public int trackDistance(int x,int y) {
  return Math.abs(x-y);
}

@Override
public void getOTP() {
     int number = (int)(Math. random() * 10000);
    System.out.println("Driver OTP "+number);
}
}
class User implements DriverHelper,UserHelper {

@Override
public int trackDistance(int x,int y) {
 return Math.abs(x-y);
}

 @Override
public void getOTP() {
     int number = (int)(Math. random() * 10000);
    System.out.println("User OTP "+number);
}

@Override
public void cabDetails() {
  System.out.println("Name of the driver: Md Sameer");
  System.out.println("Name of the car: Audi S9");
  System.out.println("Car Number: AP 29 EX 1920");
}

@Override
public void rating() {
    System.out.println("Rating :"+ 4);
}
}
public class InterfaceSegregationPrinciple {
public static void main(String[] args) {
    Driver d = new Driver();
    System.out.println("In view of the driver");
    User u = new User();
    System.out.println("The distance between user and driver is "+d.trackDistance(20,90)+" meters");
    d.getOTP();
    System.out.println("___________________________");
    System.out.println("In view of the user");
    System.out.println("The distance between user and driver is "+u.trackDistance(20,90)+" meters");
    u.getOTP();
    u.cabDetails();
    u.rating();   
}
}

