package sub5;

public class Account {
	
	// 속성
		protected String bank;
		protected String id;
		protected String name;
		protected int balance;
		
		// 생성자 생성
		public Account (String bank,String id, String name, int balance) {
			this.bank = bank;
			this.id = id;
			this.name = name;
			this.balance = balance;
		}
		
	// 기능
	public void depsoit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	public void show() {
		System.out.println("----------------");
		System.out.println("은행명: "+bank);
		System.out.println("계좌번호: "+ id);
		System.out.println("입금주: "+ name);
		System.out.println("현재잔액: "+ balance);
		System.out.println("----------------");
		
		// Account 상속 객체
		StockAccount kb = new StockAccount("KB증권","101-12-1010", "홍길동",0, "삼성전자", 10, 50000);
		kb.deposit(1000000);
		kb.buy(10, 55000);
		kb.sell(15, 56000);
		kb.withdraw(200000);
		kb.show();
	}
}
