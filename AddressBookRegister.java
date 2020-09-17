public class AddressBookRegister implements Comparable<AddressBookRegister>
{
        private String firstName;
        private String address;
        private int phoneNumber;
        private int ZIP;
        public int compareTo(AddressBookRegister adr)
        {
        	return this.ZIP - adr.ZIP;
        }
        public AddressBookRegister(String a, String b, int c, int d)
        {
                this.firstName=a;
                this.address=b;
                this.phoneNumber=c;
                this.ZIP=d;
        }
        public String getName()
        {
        	return firstName;
        }
        public String getAddr()
        {
        	return address;
        }
        public int getPhNo()
        {
        	return phoneNumber;
        }
        public int getZIP()
        {
        	return ZIP;
        }
}
