package siemens.plm.bankaccountkata;

import static org.junit.Assert.*;

import org.junit.Test;

public class WithdrawTransactionTests {

	@Test
	public void givenAnAccountWith$10AndNoRules_WhenIWithdraw$6_ThenBalanceShouldBe$4() {
		
    // Given
	BankAccount account = new BankAccount(AccountType.SavingsAccount);
	account.setBalance(1000);

	// When
	WithdrawTransaction withdrawFromAccount = new WithdrawTransaction(account);
	withdrawFromAccount.Execute(600);

	// Then
	assertEquals(400, account.getBalance());
	}

}
