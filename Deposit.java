
//package iact.day7.example3;

public class Deposit extends Account{
	
	private double intrate;
	//private boolean visor;
	
	public Deposit(){
		
		super();
	}
	
public Deposit(int an, String aname, double b, double ir){
		
		super(an, aname, b);
		intrate = ir;
	}

public double getIntrate() {
	return intrate;
}

public void setIntrate(double intrate) {
	this.intrate = intrate;
}



@Override
public String toString(){

String s = super.toString();
s += "interest rate" + intrate + "%" +"\n";
return s;
		
}
}
