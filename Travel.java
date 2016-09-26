
public class Travel {
private int itravelid;
private float fbaggageamt;
private int iexpiryyear;
private boolean bNOCstatus;
Travel(int itravelid,float fbaggageamt,int iexpiryyear,boolean bNOCstatus){
this.itravelid=itravelid;
this.fbaggageamt=fbaggageamt;
this.iexpiryyear=iexpiryyear;
this.bNOCstatus=bNOCstatus;
}
public int getItravelid() {
	return itravelid;
}
public float getFbaggageamt() {
	return fbaggageamt;
}
public int getIexpiryyear() {
	return iexpiryyear;
}
public boolean isbNOCstatus() {
	return bNOCstatus;
}



}

