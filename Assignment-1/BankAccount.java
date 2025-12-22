import java.util.Scanner;

class BankAccount {

    String name;
    int accNo;
    double balance;

    BankAccount(String name, int accNo) {
        this.name = name;
        this.accNo = accNo;
        balance = 0;
    }

    void deposit(double amt) {
        if (amt <= 0)
            throw new IllegalArgumentException();
        balance += amt;
    }

    void withdraw(double amt) {
        if (amt > balance)
            throw new ArithmeticException();
        balance -= amt;
    }

    void display() {
        System.out.println(name + " " + accNo + " " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount acc = new BankAccount(sc.next(), sc.nextInt());

        int choice = sc.nextInt();

        try {
            switch (choice) {
                case 1:
                    acc.deposit(sc.nextDouble());
                    break;

                case 2:
                    acc.withdraw(sc.nextDouble());
                    break;

                case 3:
                    System.out.println(acc.balance);
                    break;

                case 4:
                    acc.display();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Invalid Operation");
        }
    }
}
