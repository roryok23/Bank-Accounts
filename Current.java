
public class Current extends Account{
	
	private int numberOfCards;
	private double overdraft;
	
	//private boolean visor;
	
	public Current(){
		
		super();
	}
	
public Current(int an, String aname, double b, int nc, double od){
		
		super(an, aname, b);
		numberOfCards = nc;
		overdraft = od;
		

}

public int getNumberOfCards() {
	return numberOfCards;
}

public void setNumberOfCards(int numberOfCards) {
	this.numberOfCards = numberOfCards;
}

public double getOverdraft() {
	return overdraft;
}

public void setOverdraft(double overdraft) {
	this.overdraft = overdraft;
}

@Override
public String toString(){
	
	//String s = String.format("%s %-10s %-10s\n", super.toString(), numberOfCards, overdraft );
	//return s;
	String s = super.toString();
		s += "overdraft" + overdraft + "\n";
		s += "number of cards" + numberOfCards + "\n";
		return s;		

}

}

