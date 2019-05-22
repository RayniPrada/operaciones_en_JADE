package ejemplo;
import jade.core.Agent;
import jade.core.behaviours.*;
import java.util.Scanner;
public class Comportamientos  extends Agent{
	
float suma=0;
float a=0;
float b=0;
float division=0;
		
				
	protected void setup(){
		Scanner leer=new Scanner(System.in);
	System.out.println("INGRESE A");
	 a=leer.nextFloat();
	System.out.println("INGRESE B");
	 b=leer.nextFloat();
	
	addBehaviour(new Micomportamiento());
	}
		private class Micomportamiento extends Behaviour{
	 		
			public void action(){
				suma=a+b;
				addBehaviour(new Micomportamiento2());
				
				System.out.println("SUMA: "+suma);		
			}
			public boolean done(){
			
			return true;
			}
		}
		private class Micomportamiento2 extends Behaviour{
	 	
			public void action(){
				addBehaviour(new Micomportamiento3());
				System.out.println("RESTA : "+(a-b));	
					
			}
			public boolean done(){
			
			return true;
			}
		}
		private class Micomportamiento3 extends Behaviour{
	 	
			public void action(){
				addBehaviour(new Micomportamiento4());
				System.out.println("MULTIPLICACION: "+(a*b));	
				
			}
			public boolean done(){
			
			return true;
			}
		}
			private class Micomportamiento4 extends Behaviour{
	 	
			public void action(){
				division=a/b;
				System.out.println("DIVISION : "+division);	
				
			}
			public boolean done(){
			
			return true;
			}
		}
}
		
	
