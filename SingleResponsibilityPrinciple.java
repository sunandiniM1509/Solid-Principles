package solidDemo;
import java.util.*; // LinkedList exists in util package
/*public class Byjus{ 
            private String customerName;
		    private long customerNumber;
		    private double amountPaid;
		    private String optedSubject;
		    public void addToClass()
		    {
		    //create class/
		    //add to class
		    }
		    public void generateReceipt() {
            //accounts
		    }
		    public void checkInClass() {
             //check if he is in the class or not
		    }
		    //getters and setters for all private attributes
		}
*/

class Byjus{
	   
    private String customerName;
    private long customerNumber;
    private double amountPaid;
    private String optedSubject;
    public Byjus(String customerName,long customerNumber,double amountPaid,String optedSubject)
    {
    	this.customerName=customerName;
    	this.customerNumber=customerNumber;
    	this.amountPaid=amountPaid;
    	this.optedSubject=optedSubject;
    }
    public String getName()
    {
    	return customerName;
    }
    public long getNumber()
    {
    	return customerNumber;
    }
    public double getAmount()
    {
    	return amountPaid;
    }
    public String getSubject()
    {
    	return optedSubject;
    }
    public void setName(String customerName)
    {
    	this.customerName=customerName;
    }
    public void setNumber(long customerNumber)
    {
    	this.customerNumber=customerNumber;
    }
    public void setAmount(double amountPaid)
    {
    	this.amountPaid=amountPaid;
    }
    public void setSubject(String optedSubject)
    {
    	this.optedSubject=optedSubject;
    }
    public String toString()
    {
    	return this.getName()+" "+this.getNumber()+" "+
        this.getAmount()+" "+this.getSubject();
    }
}
//creating a data structure to add data of customer(instead of creating a
//database, since it requires jdbc , sql, etc) 
class AddToClass
{
	public void addToCourse(Byjus b)
	{ //Task performed by DBA
		LinkedList<Byjus> blist = new LinkedList<Byjus>();
		//blist.add(new Byjus(cutomerName,customerNumber,amountPaid,optedSubject)
		//creating objects of type byjus class
		blist.add(new Byjus("srinu",7780672932L,1000.00,"Java"));
		blist.add(new Byjus("shiva",9180672442L,5000.00,"Swift"));
		blist.add(new Byjus("sara",9882672932L,1060.00,"Python"));
		System.out.println("Customer Details added:");
		System.out.println();
		for(Byjus by:blist)
		{
			System.out.println(by);
		}
	}
}
class GenerateEReceipt
{    //Task performed by Accounts Department
	public void mailAReceipt(Byjus b) {
		//generating the bills
	System.out.println("_______________________________");
	System.out.println("Generating E-Bill");
	System.out.println(b.getName()+" your Byjus account is activated for the course: "+
	b.getSubject());
	System.out.println("_______________________________");
	}
}
public class SingleResponsibilityPrinciple {
	public static void main(String[] args) {
		AddToClass a =new AddToClass();
		Byjus p=new Byjus("Priya", 2345678L, 7800.50, "Operating systems");
        a.addToCourse(null);
        GenerateEReceipt rec = new GenerateEReceipt();
        rec.mailAReceipt(p);
	}
}
