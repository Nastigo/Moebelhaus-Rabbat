
import Prog1Tools.IOTools;
public class rabatt {

	public static void main(String[] args) {
    double rb, umsatz, rabatt;
		
		rb=IOTools.readDouble("Rechnungsbetrag:");
		umsatz=IOTools.readDouble("Umsatz:");
		
		if(rb<=100 && umsatz <=500) {
			System.out.println("kein Rabatt");
		}
		
		else if(rb<=100 && umsatz>500){
			rabatt=rb*2/100;
			System.out.println("Rabatt:"+rabatt);

		}
		
		else if(rb<=1000 && umsatz<=1000){
			rabatt=rb*3/100;
			
			System.out.println("Rabatt:"+rabatt);

		}
		
		else if(rb<=1000 && umsatz>1000){
			rabatt=rb*4/100;
			
			System.out.println("Rabatt:"+rabatt);

		}

		else if(rb<=5000 && umsatz<=2500){
			rabatt=rb*5/100;
			
			System.out.println("Rabatt:"+rabatt);

		}

		else if(rb<=5000 && umsatz>2500){
			rabatt=rb*6/100;
			
			System.out.println("Rabbat:"+rabatt);

		}
		
		else {
			rabatt=rb*7/100;
			
			System.out.println("Rabbat:"+rabatt);

		}
	}

}
