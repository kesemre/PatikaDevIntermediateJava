import Insurance.CarInsurance;
import Insurance.HealthInsurance;
import Insurance.ResidenceInsurance;
import Insurance.TravelInsurance;
import Management.Management;
import User.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Management management = new Management();
        Scanner sc = new Scanner(System.in);

        int choice = -1;
        while (choice != 0) {
            management.displayMenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Kullanıcı türünü girin (Bireysel veya Kurumsal) (I/E):1 ");
                    sc.nextLine(); // Clear the buffer
                    String userType = sc.nextLine();
                    System.out.print("İsminizi giriniz: ");
                    String name = sc.nextLine();
                    System.out.print("Soyisminizi giriniz: ");
                    String surname = sc.nextLine();
                    System.out.print("E-mailiniz giriniz ");
                    String email = sc.nextLine();
                    System.out.print("Sifrenizi giriniz ");
                    String password = sc.nextLine();
                    System.out.print("Mesleğinizi giriniz ");
                    String profession = sc.nextLine();
                    System.out.print("Yaşınız giriniz: ");
                    int age = sc.nextInt();
                    String companyName = null;
                    if (userType.equalsIgnoreCase("E")) {
                        System.out.print("Şirket ismini giriniz: ");
                        sc.nextLine(); // Clear the buffer
                        companyName = sc.nextLine();
                    }
                    management.addUser(userType, name, surname, email, password, profession, age,
                            companyName);
                    break;
                case 2:
                    if (management.isHaveAccount()) {
                        System.out.println("Sistemimizde bu hesap bulunamadı");
                        System.out.println("Lütfen bir kullanıcı ekleyiniz");
                        break;
                    }
                    System.out.print("E-mail Giriniz ");
                    sc.nextLine(); // Clear the buffer
                    String userEmail = sc.nextLine();
                    System.out.print("Şifre Giriniz ");
                    String userPassword = sc.nextLine();
                    Account account = management.login(userEmail, userPassword);
                    if (account == null) {
                        System.out.println();
                    } else {
                        System.out.println("Giriş Başarılı");
                        int option = -1;
                        while (option != 0) {
                            management.afterLoginMenu();
                            option = sc.nextInt();
                            switch (option) {
                                case 1:
                                    System.out.println("1. Ev adresi");
                                    System.out.println("2. İş adresi");
                                    System.out.print("Şeçimi giriniz: ");
                                    int addressChoice = sc.nextInt();
                                    sc.nextLine(); // Clear the buffer
                                    System.out.print("Sokak adresiniz giriniz ");
                                    String streetAddress = sc.nextLine();
                                    System.out.print("Oturduğunuz Şehri giriniz ");
                                    String city = sc.nextLine();
                                    System.out.print("Oturduğunuz İlçe Bölgeye giriniz ");
                                    String state = sc.nextLine();
                                    System.out.print("Zip kodunu giriniz: ");
                                    String zipCode = sc.nextLine();
                                    if (addressChoice == 1) {
                                        management.addHomeAddress(
                                                account.getUser(),
                                                streetAddress, city,
                                                state,
                                                zipCode);
                                    } else if (addressChoice == 2) {
                                        System.out.print(
                                                "Şirket ismini giriniz ");
                                        sc.nextLine(); // Clear the buffer
                                        companyName = sc.nextLine();
                                        management.addBusinessAddress(
                                                account.getUser(),
                                                companyName,
                                                streetAddress,
                                                city, state, zipCode);
                                    } else {
                                        System.out.println(
                                                "Geçersiz seçim. Lütfen tekrar deneyiniz.");
                                    }
                                    break;
                                case 2:
                                    System.out.println("1. Araç Sigortası");
                                    System.out.println("2. Sağlık Sigortası");
                                    System.out.println("3. Konut Sigortası");
                                    System.out.println("4. Seyahat Sigortası");
                                    System.out.print("Enter your choice: ");
                                    int insuranceChoice = sc.nextInt();
                                    sc.nextLine();
                                    if (insuranceChoice == 1) {

                                        System.out.print("Arbanın markasını yazınız ");
                                        String carMake = sc.nextLine();
                                        System.out.print("Arbanın modelini giriniz ");
                                        String carModel = sc.nextLine();
                                        System.out.print("Arbanın yaşını giriniz ");
                                        int carAge = sc.nextInt();
                                        System.out.print(
                                                "Enter true or false that if coverage for drivers (T/F): ");
                                        sc.nextLine();
                                        String answer = sc.nextLine();
                                        boolean coverageForDrivers;
                                        if (answer.equalsIgnoreCase("t")) {
                                            coverageForDrivers = true;
                                        } else if (answer.equalsIgnoreCase(
                                                "f")) {
                                            coverageForDrivers = false;
                                        } else {
                                            System.out.println(
                                                    "Geçersiz seçim. Lütfen tekrar deneyin.");
                                            break;
                                        }
                                        System.out.print(
                                                "Enter true or false that if coverage for passengers (T/F): ");
                                        sc.nextLine(); // Clear the buffer
                                        answer = sc.nextLine();
                                        boolean coverageForPassengers;
                                        if (answer.equalsIgnoreCase("t")) {
                                            coverageForPassengers = true;
                                        } else if (answer.equalsIgnoreCase(
                                                "f")) {
                                            coverageForPassengers = false;
                                        } else {
                                            System.out.println(
                                                    "Geçersiz seçim. Lütfen tekrar deneyiniz.");
                                            break;
                                        }

                                        account.addInsurance(
                                                new CarInsurance(
                                                        carMake,
                                                        carModel,
                                                        carAge,
                                                        coverageForDrivers,
                                                        coverageForPassengers));
                                    } else if (insuranceChoice == 2) {

                                        System.out.print(
                                                "Sağlık durumunu girin: ");
                                        String healthCondition = sc.nextLine();
                                        System.out.print(
                                                "Kapsam Sınırını giriniz ");
                                        double coverageLimit = sc.nextDouble();
                                        System.out.print(
                                                "Enter true or false that if coverage for pre existing condition (T/F): ");
                                        sc.nextLine(); // Clear the buffer
                                        String answer = sc.nextLine();
                                        boolean coverageForPreExistingCondition;
                                        if (answer.equalsIgnoreCase("t")) {
                                            coverageForPreExistingCondition = true;
                                        } else if (answer.equalsIgnoreCase(
                                                "f")) {
                                            coverageForPreExistingCondition = false;
                                        } else {
                                            System.out.println(
                                                    "Geçersiz seçim. Lütfen tekrar deneyiniz.");
                                            break;
                                        }
                                        account.addInsurance(
                                                new HealthInsurance(
                                                        healthCondition,
                                                        coverageForPreExistingCondition,
                                                        coverageLimit));
                                    } else if (insuranceChoice == 3) {

                                        System.out.print(
                                                "Bina değeriniz giriniz: ");
                                        double buildingValue = sc.nextDouble();
                                        System.out.print(
                                                "İçerik değerini giriniz: ");
                                        double contentValue = sc.nextDouble();
                                        account.addInsurance(
                                                new ResidenceInsurance(
                                                        buildingValue,
                                                        contentValue));
                                    } else if (insuranceChoice == 4) {
                                        List<String> coveredCountries = new ArrayList<>();
                                        System.out.println("Ülkeleri giriniz:");
                                        while (sc.hasNextLine()) {
                                            String item = sc.nextLine();
                                            if (item.isEmpty()) {
                                                break;
                                            }
                                            coveredCountries.add(item);
                                        }
                                        System.out.print("Süreyi giriniz:");
                                        int duration = sc.nextInt();
                                        account.addInsurance(
                                                new TravelInsurance(coveredCountries,
                                                        duration));
                                    } else {
                                        System.out.println(
                                                "Geçersiz seçim. Lütfen tekrar deneyiniz.");
                                    }

                                    break;

                                case 3:
                                    management.showUserInfo(account);
                                    break;
                                case 0:
                                    account = null;
                                    System.out.println("Çıkıyorsunuz");
                                    break;

                                default:
                                    System.out.println(
                                            "Geçersiz seçim. Lütfen tekrar deneyin!");
                                    break;
                            }
                        }
                    }

                    break;
                case 3:
                    management.listAccounts();
                    break;
                case 0:
                    System.out.println("Sistemden çıkılıyor... tekrar Görüşmek üzere. :D");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin!");
                    break;
            }
        }
        sc.close();
    }
}