class CustomerDetails   {
	
  static String personName            = "Baba Das";
  static int     personAge            = 120;
  static String  personEmail          = "Baba@gamil.com";
  static String  personPannumber      = "OEUPS5775E";
  static long    personAadharnumber   = 669770322817l;
  static long    personPhonenumber    = 7204830958l;
  static char	 gender               =  'm' ;
  static String  personCurrentAddress = "Bengaluru";
  static String  personPermanentAddress  ="Bengaluru";	
  
   public static void main(String details[]){
	   System.out.println("main started");
	   //Full name, first name,middle name,last name
	   //The person name is : Baba
	     
		   //panNO,
		   //aadharNo, phonenumber(contactnNo),
		   // gender, currentAddress, permanentAddress
		   			 
	   System.out.println("The person name is "+ personName);
	   System.out.println("The Person pannumber is "+ personPannumber);
	   System.out.println("The Person aadharnumber is "+ personAadharnumber);
	   System.out.println("The Person phonenumber is "+ personPhonenumber);
	   System.out.println("The  gender is "+ gender);
	   System.out.println("The Person currentAddress is "+ personCurrentAddress);	   
	   System.out.println("The Person permanentAddress is "+ personPermanentAddress);
	  
	   System.out.println("main ended");
	  
      }
 }