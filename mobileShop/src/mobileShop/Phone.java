package mobileShop;

public class Phone implements Replacable,Repairable,Sellable{
	private String name;
	private String model;
	private double price;
	private PhoneType phoneType;

	Phone(String name,String model,double price,PhoneType phoneType){
		this.name=name;
		this.model=model;
		this.price=price;
		this.phoneType=phoneType;
	}
	public String toString() {
		return "Purchased mobile is "+name+" of type "+model+" with amount "+price +" of phonetype"+phoneType;
	}
	@Override
	public 	void replace() {
		System.out.println("All used phones can be replaced here");
	}
	@Override
	public void repair() {
		System.out.println("Only Android phone are repair here");
	}
	@Override
	public void sell() {
		System.out.println("Only warrenty phones are sellable here");
	}
}

