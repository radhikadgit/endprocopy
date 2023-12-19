package javaOopsCode;

public class UsTrafficRules implements CentralTrafficLights, AirLineRules {

	public static void main(String[] args) {
		
		UsTrafficRules usObj = new UsTrafficRules();
		usObj.greenLight();
		usObj.redLight();
		usObj.yellowLight();
		usObj.handSymbolLight();
		usObj.land();
		usObj.sygnal();
		
		System.out.println("-----------");
		
		AirLineRules airObj = new UsTrafficRules();
		airObj.land();
		airObj.sygnal();
		System.out.println("-----------");
		
		CentralTrafficLights cenObj = new UsTrafficRules();
		cenObj.greenLight();
		cenObj.redLight();
		cenObj.yellowLight();
		
		
	}

	public void redLight() {
		// TODO Auto-generated method stub
		System.out.println("STOP");
	}

	public void yellowLight() {
		// TODO Auto-generated method stub
		System.out.println("Flash Yellow light");
	}

	public void greenLight() {
		// TODO Auto-generated method stub
		System.out.println("GO");
	}
	
	public void handSymbolLight() {
		System.out.println("Walk");
	}

	public void sygnal() {
		// TODO Auto-generated method stub
		System.out.println("Sygnals");
	}

	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Landing Rules");
	}

}
