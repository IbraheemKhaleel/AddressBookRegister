import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookRegister implements AddressBookRegisterInterface {
	String firstName="";
	String address= "";
	String phoneNumber = "";
	String ZIP= "";
	Scanner sc = new Scanner(System.in);
	
	ArrayList<String> array = new ArrayList<>();
	public AddressBookRegister(String a, String b, String c, String d)
	{
		this.firstName=a;
		this.address=b;
		this.phoneNumber=c;
		this.ZIP=d;
	}
	public void  addition()
	{
		array.add(firstName);
		array.add(address);
		array.add(phoneNumber);
		array.add(ZIP);
		System.out.println("The added entries are " + array);
	}
	public void deletion()
	{
		System.out.println("Enter the position to be deleted");
		int position = sc.nextInt();
		array.remove(position-1);
		System.out.println("Updated array is " + array);
	}
	public void edit()
	{
		System.out.println("Enter the position to be edited");
		int pos= sc.nextInt();
		switch(pos)
		{
		case 1:	System.out.println("Enter first name ");
				firstName = sc.next();
				array.remove(0);
				array.add(firstName);
		break;
		case 2: System.out.println("Enter address ");
				address = sc.next();
				array.remove(1);
				array.add(address);
		break;
		case 3: System.out.println("Enter phone number ");
				phoneNumber = sc.next();
				array.remove(2);
				array.add(phoneNumber);
		break;
		case 4: System.out.println("Enter ZIP code ");
				ZIP =sc.next();
				array.remove(3);
				array.add(ZIP);
		break;

		default:System.out.println("Enter a valid position");
		}
		
		System.out.println("The edited entries are " + array);
	}
}
