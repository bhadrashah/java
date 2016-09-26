
public class Traveldemo {

	public static void main(String[] args) {
		Travel amit=new Travel (19,20,2023,true);
		Checks checkpoint=new Checks();
		if(checkpoint.checkbaggageamt(amit)&&checkpoint.checksecurity(amit)&&checkpoint.checkimmigration(amit))
		{
			System.out.println("fly");
		
	}
		else
			System.out.println("stay back");

	}
}
