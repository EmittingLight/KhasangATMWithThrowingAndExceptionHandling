/*
В этом классе мы определили конструктор, который принимает сообщение об ошибке и передает его в конструктор базового класса Exception.
 */
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
