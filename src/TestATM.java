/*
В вашу программу ATM добавьте выбрасывание и обработку исключений,
чтобы потренироваться выстраивать архитектуру программы и работать с исключениями только там,
где это действительно необходимо.
 */
public class TestATM {
    public static void main(String[] args) {
        ATM atm = new ATM(1000);

        try {
            System.out.println("Баланс на счете: " + atm.getBalance());
            atm.withdraw(500);
            System.out.println("Снято 500 рублей");
            System.out.println("Баланс на счете: " + atm.getBalance());
            atm.deposit(100);
            System.out.println("Внесено 100 рублей");
            System.out.println("Баланс на счете: " + atm.getBalance());
            atm.withdraw(1500);
            System.out.println("Снято 1500 рублей");
            System.out.println("Баланс на счете: " + atm.getBalance());
        } catch (InsufficientFundsException | IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Работа с банкоматом завершена");
        }
    }
}
