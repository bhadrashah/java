package university;

public class University {
	final static String cetcode ="E30 & E241";
	school[] s=new school[8];
	static
	{
	
		System.out.println("KLE technolgical university");
}
	class school
	{
		private int programcode;
		private String schoolCoordinator;
		private int noofstud;
		private int noofstaff;
		public int  getProgramcode() {
			return programcode;
		}
		public String getSchoolCoordinator() {
			return this.schoolCoordinator;
		}
		public int getNoofstud() {
			return this.noofstud;
		}
		public int getNoofstaff() {
			return this.noofstaff;
		}
		public school(int programcode, String schoolCoordinator,
				int noofstud, int noofstaff)
		{
			
			this.programcode = programcode;
			this.schoolCoordinator = schoolCoordinator;
			this.noofstud = noofstud;
			this.noofstaff = noofstaff;
			
			
			
		}
	
	}
	void calculatestrength()
	{
		int i=0;
		for(int j=0;j<8;j++)
		{
			
		if(s[j].getNoofstud()>120)
			System.out.println("strength exceeds in"+s[j].getProgramcode());
		
		else{
			
			i=s[j].getNoofstud();
			System.out.println("total no student are "+i+" in "+s[j].programcode);
		}
		}

	}
		
	
	
	void creationofSchool(){
			s[0]=new school(1, "bhadra", 200, 5);
			s[1]=new school(2, "appu", 120,18);
			s[2]=new school(3,"abhi",12,10);
			s[3]=new school(4,"peri",164,52);
			s[4]=new school(5, "renu", 120,26);
			s[5]=new school(6,"shrini",174,15);
			s[6]=new school(7,"sherya",110,18);
			s[7]=new school(8,"anu",124,18);
			
		}
	
		
	}


