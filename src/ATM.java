/*
два метода: deposit (внесение денег) и withdraw (снятие денег). Оба метода могут выбрасывать исключения:
IllegalArgumentException (если сумма меньше или равна нулю) и InsufficientFundsException (если на счету недостаточно денег).
 */

public class ATM {
    private double balance;

    public ATM(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма должна быть больше нуля");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException, IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма должна быть больше нуля");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Недостаточно средств на счете");
        }
        balance -= amount;
    }
}
