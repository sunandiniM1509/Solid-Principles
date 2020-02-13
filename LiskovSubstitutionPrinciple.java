package solidDemo;

/*class Payment {
void upiPIN() {
 
}
void amount() {

}
}
class GooglePay extends Payment {
public void upiPIN() {
    //type the UPI PIN
}
public void amount() {
    //pay the amount
}
}
class CashOnDelivery extends Payment {
public void upiPIN() {
    //we can't type the UPI PIN as CashOnDelivery doesn't require/has UPI PIN
}
public void amount() {
    //pay the amount
}
}
public class LiskovSubstitutionPrinciple {
public static void main(String[] args) {

}
}*/
abstract class Payment {
void amount() {

}
}
class OnlinePayment extends Payment {
void upiPIN() {}
void amount() {

}
}
class GooglePay extends OnlinePayment {
public void upiPIN() {
    //type the UPI PIN
}
public void amount() {
    //pay the amount
}
}
class CashOnDelivery extends Payment {
/*public void upiPIN() {
    //we can't type the UPI PIN as CashOnDelivery doesn't require/has UPI PIN
}*/
public void amount() {
    //pay the amount
}
}
public class LiskovSubstitutionPrinciple{
public static void main(String[] args) {
//
	System.out.println();
	System.out.println("Both subclasses can substitute respective superclasses");
}
}
//Helps in re use, clear structure since just an instance of class is enough at both  places

