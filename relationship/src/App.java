

public class App {

	public static void main(String[] args) {
		
		Cab c1=new Cab();
		Driver d1 = new Driver();
		System.out.println("c1 is"+c1);
		System.out.println("d1 is"+d1);
		
		c1.setDataForCab (7457,"blue","activa",1);
		d1.setDataForDriver ("smriti","F1","malhotrasmriti89@gmail.com","y677hdg");
		
		d1.cref=c1;
		d1.showDataForDriver();

	}

}
