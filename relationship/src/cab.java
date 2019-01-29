
class Cab{
		int regnum;
		String color;
		String name;
		int type;
		
		void setDataForCab(int no,String clr,String nm,int tp) {
			regnum=no;
			color=clr;
			name=nm;
			type=tp;
		}
		
		void showDataForCab() {
			System.out.println("cab data");
			System.out.println("regnum is"+regnum);
			System.out.println("color is"+color);
			System.out.println("name is"+name);
			System.out.println("type is"+type);
		}
}

