package mobileShop;

import java.util.ArrayList;

public class Shop {
	public static void main(String[] args) {
		Phone p1=new Phone("IQOO","Z3",21000.00,PhoneType._5G);
		Phone p2=new Phone("MI","Note5Pro",12000.00,PhoneType._4G);

		ArrayList<Phone> A = new ArrayList<>();
		A.add(p1);
		A.add(p2);

		for(Phone p:A) {
			System.out.println(p);
		}
		p1.replace();
		p2.repair();
	}
}