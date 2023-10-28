package Management;

import Addresses.Address;
import Addresses.AddressManager;
import Addresses.BusinessAddress;
import Addresses.HomeAddress;
import User.AccountManager;
import User.User;
import User.Account;
import User.Enterprise;
import User.Individual;

import java.util.TreeSet;

public class Management{
    private AccountManager accountManager;

    public Management() {
        accountManager = new AccountManager();
    }

    public void displayMenu() {
        System.out.println("#################################################");
        System.out.println("Politika Yönetim Paneli!");
        System.out.println("1. Kullanıcı ekleyin (Bireysel veya Kurumsal)");
        System.out.println("2. Giriş");
        System.out.println("3. Hesapları göster");
        System.out.println("0. Çıkış");
        System.out.println("#################################################");
        System.out.print("Şeçimini giriniz: ");
    }

    public void addUser(String userType, String name, String surname, String email, String password, String profession,
                        int age, String companyName) {
        User user = new User(name, surname, email, password, profession, age);
        if (userType.equalsIgnoreCase("I")) {
            Account account = new Individual(user);
            accountManager.addAccount(account);
            System.out.println("Kullanıcı başarıyla eklendi");
        } else if (userType.equalsIgnoreCase("E")) {
            Account account = new Enterprise(user, companyName);
            accountManager.addAccount(account);
            System.out.println("Kullanıcı başarıyla eklendi!");
        } else {
            System.out.println("Geçersiz kullanıcı türü, Lütfen tekrar deneyiniz!");
        }
    }

    public Account login(String userEmail, String userPassword) {
        Account account = accountManager.login(userEmail, userPassword);
        if (account != null)
            account.showUserInfo();
        return account;
    }

    public void afterLoginMenu() {
        System.out.println("#################################################");
        System.out.println("1. Adres ekleyiniz");
        System.out.println("2. Sigorta ekleyiniz");
        System.out.println("3. Kullanıcı bilgisini göster");
        System.out.println("0. Çıkış");
        System.out.println("#################################################");
        System.out.print("Seçimini giriniz:");
    }

    public void addHomeAddress(User user, String streetAddress, String city, String state, String zipCode) {
        Address homeAddress = new HomeAddress(streetAddress, city, zipCode, state);
        AddressManager.addAddress(user, homeAddress);
        System.out.println("İşletme adresi başarıyla eklendi!");

    }

    public void addBusinessAddress(User user, String companyName, String streetAddress, String city, String state,
                                   String zipCode) {
        Address businessAddress = new BusinessAddress(streetAddress, city, zipCode, state, companyName);
        AddressManager.addAddress(user, businessAddress);
        System.out.println("İşletme adresi başarıyla eklendi!");
    }

    public void showUserInfo(Account account) {
        account.showUserInfo();
    }

    public void listAccounts() {
        TreeSet<Account> accountList = accountManager.getAccountList();
        if (accountList.isEmpty()) {
            System.out.println("No accounts found in the system");
            return;
        }
        String format = "| %-15s | %-15s | %-25s |%-15s | %-20s | %-8s | %-25s | %-15s |\n";
        System.out.format(format, "İsim", "Soy isim", "E-mail", "Password", "Meslek", "Yaş", "Son giriş tarihi",
                "Tipi");
        for (Account a : accountList) {
            System.out.format(format, a.getUser().getName(), a.getUser().getSurname(), a.getUser().getEmail(),
                    a.getUser().getPassword(), a.getUser().getProfession(), a.getUser().getAge(),
                    a.getUser().getLastLogin(), a.getClass().getSimpleName());
        }
    }

    public boolean isHaveAccount() {
        return accountManager.getAccountList().isEmpty();
    }
}