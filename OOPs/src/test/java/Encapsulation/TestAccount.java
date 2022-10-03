package Encapsulation;

public class TestAccount {

	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.setAcc_no(5605605040l);
		acc.setName("Dhanush Ramachandran");
		acc.setEmail("dhanushrama@java.com");
		acc.setAmount(500000f);
		
		System.out.println(acc.grtAcc_no() +""+ acc.getName() +""+ acc.getEmail() +""+ acc.getAmount());
	}

}
