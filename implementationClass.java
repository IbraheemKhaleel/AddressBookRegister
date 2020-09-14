import java.util.*;
public class implementationClass  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		AddressBookRegisterInterface address = new AddressBookRegister("Ibraheem Khaleel","4th Avenue","00099991","546 372");
		System.out.println("Enter one choice 1. Add data  2. Edit data 3. Delete ");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:	address.addition();
			break;
			case 2: address.addition();
				address.edit();
			break;
			case 3 : address.deletion();
			break;
			default: System.out.println("Enter a valid choice");
		}
	}

}
