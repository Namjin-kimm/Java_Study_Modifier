package com.iu.main;

import com.iu.himart.Client;
import com.iu.himart.Computer;
import com.iu.himart.Phone;
import com.iu.himart.Tv;

public class Main {

	public static void main(String[] args) {
		Computer computer =  new Computer();
		Tv tv = new Tv();
		Phone phone = new Phone();
		 computer.info();
		 tv.info();
		 phone.info();
		 
		 Client client = new Client();
		 client.buy(computer);
		 client.buy(tv);
		 client.buy(phone);

	}

}
