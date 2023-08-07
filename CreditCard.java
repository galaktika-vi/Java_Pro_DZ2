import java.util.Scanner;

public class CreditCard {
    private String cardNumber;
    private int pinCode;
    private double balance;
    private double creditLimit;
    private double debt;

    public CreditCard(String cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.balance = 0;
        this.creditLimit = 0;
        this.debt = 0;
    }

    public void transaction(int pinCode, double amount, boolean isDeposit) {
        if (this.pinCode == pinCode) {
            if (amount > 0) {
                if (isDeposit) {
                    this.debt = Math.max(0, this.debt - amount);
                    this.balance += Math.max(0, amount - this.debt);
                } else {
                    double availableAmount = this.balance + this.creditLimit - this.debt;
                    if (amount <= availableAmount) {
                        this.balance -= amount;
                    } else {
                        System.out.println("Превышен кредитный лимит. Вам доступна сумма: " + availableAmount);
                    }
                }
            } else {
                System.out.println("Ошибка: сумма транзакции должна быть положительной.");
            }
        } else {
            System.out.println("Неверный пин-код. Операция отклонена.");
        }
    }

    public void setCreditLimit(double creditLimit) {
        if (creditLimit >= 0) {
            this.creditLimit = creditLimit;
        } else {
            System.out.println("Ошибка: кредитный лимит не может быть отрицательным.");
        }
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getDebt() {
        return debt;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создание карты
        System.out.print("Введите номер карты: ");
        String cardNumber = scanner.next();

        System.out.print("Введите пин-код: ");
        int pinCode = scanner.nextInt();

        CreditCard card = new CreditCard(cardNumber, pinCode);

        // Установка кредитного лимита
        System.out.print("Введите кредитный лимит: ");
        double creditLimit = scanner.nextDouble();
        card.setCreditLimit(creditLimit);

        // Зачисление средств на карту
        System.out.print("Введите пин-код для зачисления средств: ");
        int depositPin = scanner.nextInt();

        if (depositPin == pinCode) {
            System.out.print("Введите сумму для зачисления: ");
            double depositAmount = scanner.nextDouble();
            card.transaction(pinCode, depositAmount, true);
        } else {
            System.out.println("Неверный пин-код. Операция зачисления средств отклонена.");
        }

        // Снятие средств с карты
        System.out.print("Введите пин-код для снятия средств: ");
        int withdrawPin = scanner.nextInt();

        while (withdrawPin == pinCode) {
            System.out.print("Введите сумму для снятия: ");
            double withdrawAmount = scanner.nextDouble();

            card.transaction(pinCode, withdrawAmount, false);

            System.out.print("Желаете продолжить снятие средств? (да/нет): ");
            String continueWithdraw = scanner.next();
            if (!continueWithdraw.equalsIgnoreCase("да")) {
                break;
            }
        }

        // Вывод информации о карте
        System.out.println("Номер карты: " + card.getCardNumber());
        System.out.println("Текущий баланс: " + card.getBalance());
        System.out.println("Кредитный лимит: " + card.getCreditLimit());

        scanner.close();
    }
}
