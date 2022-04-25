package src;

import java.util.Scanner;

class Account {
	int amount; // so tien chuyen
	int balance; // so du trong tai khoan 
	boolean valueset = false;
	
	public Account(int value) {
		this.balance = value;
	}
	
	public synchronized int get() {
		while (!valueset) {
			try {
				wait();
			} catch (Exception e) {
				System.out.println("Error!");
			}
		}
		
		this.balance += this.amount;
		System.out.println("Got : " + amount);
		System.out.println("So du : " + this.balance);
		valueset = true;
		notify();
		return amount;
	}
	
	public synchronized void put(int n) {
		while (valueset) {
			try {
				wait();
			} catch(InterruptedException e) {
				System.out.println("Error!");
			}
			
			this.balance = this.balance - this.amount;
			this.valueset = true;
			System.out.println("Da chuyen : " + this.amount);
			System.out.println("So du : " + this.balance);
			notify();
		}
	}
}

class Sender implements Runnable{
	Account account;
	Thread t;
	Scanner sc = new Scanner(System.in);
	
	Sender(Account acc) {
		this.account = acc;
		t = new Thread(this, "Sender");
	}
	
	public void run() {
		while(true) {
			System.out.println("Nhap so tien can chuyen: ");
			int temp = sc.nextInt();
			account.put(temp);
		}
	}
	
}

class Receiver implements Runnable{
	Account account;
	Thread t;
	Scanner sc = new Scanner(System.in);
	
	Receiver(Account acc) {
		this.account = acc;
		t = new Thread(this, "Receiver");
	}
	
	public void run() {
		while(true) {
			System.out.println(account.get());
			
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Account account1 = new Account(10000);
		Sender send = new Sender(account1);
		Receiver receiver = new Receiver(account1);
		send.t.start();
		receiver.t.start();
	}
}
