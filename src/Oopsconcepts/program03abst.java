package Oopsconcepts;
abstract class BankAccount
{
	abstract int deposit();
	abstract int withdraw();
}
class SavingAccount extends BankAccount
{
	int deposit()
	{
		return 10000000;
	}
	int withdraw()
	{
		return 5000;
	}
}
class CurrentAccount extends BankAccount
{
	int deposit()
	{
		return 2000000;
	}
	int withdraw()
	{
		return 20000;
	}
}

public class program03abst {
	public static void main(String[] args) {
		SavingAccount s=new SavingAccount();
		System.out.println("deposit from savingaccount:"+s.deposit());
		System.out.println("withdrawing money from savingaccount:"+s.withdraw());
		CurrentAccount c=new CurrentAccount();
		System.out.println("deposit money from currentaccount:"+c.deposit());
		System.out.println("withdrwaing money from currentaccount:"+c.withdraw());
	}

}
