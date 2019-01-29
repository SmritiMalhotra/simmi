class Driver {
		String name;
		 String gender;
		String email;
		String number;
		Cab cref;
		
		void setDataForDriver(String nm,String gd,String em,String no) {
			name=nm;
			gender=gd;
			email=em;
			number=no;
			
		}
		
		void showDataForDriver() {
			System.out.println("driver data");
			System.out.println("name is"+name);
			System.out.println("gender  is"+gender);
			System.out.println("email is"+email);
			System.out.println("number is"+number);
			System.out.println("drivercabdetails");
			cref.showDataForCab();
			
	}
	
}


