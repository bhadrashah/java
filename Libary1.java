package libary;

public class Libary1 {
	int refrencesectiontime;
	int lendingsectiontime;
	int digitaltime;
	String section;
	public Libary1(int refrencesectiontime, int lendingsectiontime,
			int digitaltime, String section) {
		
		this.refrencesectiontime = refrencesectiontime;
		this.lendingsectiontime = lendingsectiontime;
		this.digitaltime = digitaltime;
		this.section = section;
	}
	public int getRefrencesectiontime() {
		return refrencesectiontime;
	}
	public int getLendingsectiontime() {
		return lendingsectiontime;
	}
	public int getDigitaltime() {
		return digitaltime;
	}
	public String getSection() {
		return section;
	}
	
	void refrence(){
		if (refrencesectiontime<=4)
		System.out.println("allowed");
		else
			System.out.println("not allowed");
		
			}
	void lendingsection(){
		if(lendingsectiontime<15){
			System.out.println("no penalty");
		}
			else
			 {
				 System.out.println("penalty");
				 if(lendingsectiontime>=15&&lendingsectiontime<=22)
					 System.out.println("penaly is 20rs");

				 else
					 System.out.println("penalty is 100 rs");
			 }
		}
	void digitalsection(){
		 if(digitaltime>=4&&digitaltime<=6)
			 System.out.println("allowed");
		 else
			 System.out.println("not allowed in digital section");
		 
	}
	void booksection(){
		if(section=="department")
			System.out.println("set 1");
		else
			System.out.println("set 2");
	}
}

	



