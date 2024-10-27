import java.util.Scanner;

// Kelas untuk menyimpan data dan operasi akun
class Account {
    private String accountNumber;
    private String pin;
    private double balance;

    public Account(String accountNumber, String pin, double initialBalance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public boolean validatePin(String inputPin) {
        return pin.equals(inputPin);
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Setoran berhasil. Saldo saat ini: " + balance);
        } else {
            System.out.println("Jumlah setoran tidak valid.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Penarikan berhasil. Saldo saat ini: " + balance);
        } else {
            System.out.println("Penarikan gagal. Saldo tidak mencukupi.");
        }
    }
}

// Kelas ATM untuk mengelola operasi
class ATM {
    private Account currentAccount;

    public boolean login(Account account, String inputPin) {
        if (account.validatePin(inputPin)) {
            currentAccount = account;
            System.out.println("Login berhasil.");
            return true;
        } else {
            System.out.println("PIN salah.");
            return false;
        }
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Setoran");
            System.out.println("3. Penarikan");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Saldo saat ini: " + currentAccount.getBalance());
                    break;
                case 2:
                    System.out.print("Masukkan jumlah setoran: ");
                    double depositAmount = scanner.nextDouble();
                    currentAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Masukkan jumlah penarikan: ");
                    double withdrawalAmount = scanner.nextDouble();
                    currentAccount.withdraw(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan ATM kami.");
                    break;
                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (choice != 4);
    }
}

// Kelas utama untuk menjalankan program
public class SimpleATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat akun contoh
        Account account1 = new Account("12345", "6789", 1000.0);

        ATM atm = new ATM();

        // Simulasi login
        System.out.print("Masukkan nomor akun: ");
        String accountNumber = scanner.nextLine();

        if (accountNumber.equals(account1.getAccountNumber())) {
            System.out.print("Masukkan PIN: ");
            String pin = scanner.nextLine();

            if (atm.login(account1, pin)) {
                atm.showMenu();
            }
        } else {
            System.out.println("Nomor akun tidak ditemukan.");
        }
    }
}
