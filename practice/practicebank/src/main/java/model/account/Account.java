package model.account;

import java.sql.Timestamp;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
@ToString
@Getter
public class Account {
    private int accountNumber;
    private String accountPassword;
    private int accountBalance;
    private Timestamp accountCreatedAt;

    @Builder
    public Account(int accountNumber, String accountPassword, int accountBalance, Timestamp accountCreatedAt) {
        this.accountNumber = accountNumber;
        this.accountPassword = accountPassword;
        this.accountBalance = accountBalance;
        this.accountCreatedAt = accountCreatedAt;
    }
}


