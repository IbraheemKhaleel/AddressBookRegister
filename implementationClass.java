import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class implementationClass  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<AddressBookRegister> array = new ArrayList<AddressBookRegister>();
		array.add(new AddressBookRegister("Ibraheem Khaleel", "Sulaiman Manzil " , 97652132, 672327));
		array.add(new AddressBookRegister("Muhammed Muzammil", "saif Manzil " , 97652132, 671317));
		array.add(new AddressBookRegister("Jeffy joseph", "4th Avenue " , 9856235, 670327));
		array.add(new AddressBookRegister("Advaith Bhaskaran", "8th Avenue " , 72568921, 669327));
		System.out.println("Enter one choice 1. Add data  2. Edit data 3. Delete 4. Sort ");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:	for(AddressBookRegister address:array)
			 		{
				 		System.out.println(address.getName()+ "  " + address.getAddr()+ "  "+ address.getPhNo()+ "  " + address.getZIP());
			 		}
			break;
			case 2 :	for(AddressBookRegister address:array)
					{
					System.out.println(address.getName()+ "  " + address.getAddr()+ "  "+ address.getPhNo()+ "  " + address.getZIP());
					}
					System.out.println("Enter the position to be edited ");
					int select=sc.nextInt();
					array.remove(select-1);
					array.add(new AddressBookRegister("Muhammed Jabir", "Khalid Manzil " , 98761323, 676871));
					for(AddressBookRegister address:array)
					{
					System.out.println(address.getName()+ "  " + address.getAddr()+ "  "+ address.getPhNo()+ "  " + address.getZIP());
					} 
			break;
			case 3 :for(AddressBookRegister address:array)
	 				{
		 			System.out.println(address.getName()+ "  " + address.getAddr()+ "  "+ address.getPhNo()+ "  " + address.getZIP());
	 				}
					System.out.println("Enter the position to be deleted");
            		int position = sc.nextInt();
            		array.remove(position-1);
            		System.out.println("Updated array is\n" );
            		for(AddressBookRegister address:array)
					{
				 	System.out.println(address.getName()+ "  " + address.getAddr()+ "  "+ address.getPhNo()+ "  " + address.getZIP());
					}	
			break;
			case 4 : Collections.sort(array);
					 System.out.println("Informations after sorting \n");
					 for(AddressBookRegister address:array)
					 {
						 System.out.println(address.getName()+ "  " + address.getAddr()+ "  "+ address.getPhNo()+ "  " + address.getZIP());
					 }
			break;
			default: System.out.println("Enter a valid choice");
		}
	}

}

