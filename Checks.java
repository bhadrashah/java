
public class Checks {
boolean checkbaggageamt(Travel amit){
	if(amit.getFbaggageamt()>0&&amit.getItravelid()<=40)
	{
		return true;
	}
	else
		return false;
}
boolean checkimmigration (Travel amit){
	if(amit.getIexpiryyear()>=2001&&amit.getIexpiryyear()<=2025)
	{
		return true;
	}
	else 
		return false;
}
boolean checksecurity(Travel amit){
	if(amit.isbNOCstatus()==true)
		return true;
	else
		return false;
}

}
