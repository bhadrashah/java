package employee;

public class Employe {
	private int iempid;
	private String sempname;
	private double fbasicsalary;
	private double fallowance;
	
public int getIempid() {
		return iempid;
	}
	public String getSempname() {
		return sempname;
	}
	public double getFbasicsalary() {
		return fbasicsalary;
	}
	public double getFallowance() {
		return fallowance;
	}
Employe(int iempid,String sempname,float fbasicsalary){
	this.iempid=iempid;
	this.sempname=sempname;
	this.fbasicsalary=fbasicsalary;
}
void calnetsalary(){
	double fallowance;
	double incometax = 0;
	double netsalary;
	double grosspay;
	fallowance=0.46*getFbasicsalary();
    grosspay=getFbasicsalary()+fallowance;
    System.out.println("allowance is"+fallowance);
    System.out.println("gross salary"+grosspay);
    if(grosspay<=5000)
    	System.out.println("no tax");
    else {
    	incometax=grosspay*0.10;
    	System.out.println("incometax is"+incometax);
    }
    netsalary=grosspay-incometax;
    System.out.println("net salary is"+netsalary);
    
    
    
    
    
	
}
	

}
