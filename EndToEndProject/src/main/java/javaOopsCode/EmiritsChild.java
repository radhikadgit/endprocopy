package javaOopsCode;

public class EmiritsChild extends ParentAirCraft {
    
	int a = 65;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmiritsChild em = new EmiritsChild();
		em.bodyOfAirLine();
		em.crewsDressCode();
		em.colorOfAirBus();
		em.seatingSystem();
		
		ParentAirCraft p = new EmiritsChild();
		p.bodyOfAirLine();
		p.colorOfAirBus();
		p.seatingSystem();
	

	}

	@Override
	public void colorOfAirBus() {
		// TODO Auto-generated method stub
		System.out.println("red and white");
		System.out.println(a);
		System.out.println(super.a);
		
	}
	
	public void crewsDressCode() {
		
		super.bodyOfAirLine();
		System.out.println("White Dress");
	}

}
