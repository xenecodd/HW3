import javax.swing.*;

public class Main {

    // Rastgele bir sayı üreten fonksiyon
    public static int randomNum() {
        int number = (int) (Math.random() * 6 + 1);
        return number;
    }

    // 1 ile 100 arasında rastgele bir sayı üreten fonksiyon
    public static int randomnum2() {
        return (int) (Math.random() * 100) + 1;
    }

    // Bir sayının asal olup olmadığını kontrol eden fonksiyon
    public static boolean asal(int sayi) {
        for (int i = 2; i <= 7; i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Bir sayının asal olup olmadığını kontrol eden fonksiyon
    public static boolean prime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Bir sayının rakamlarının toplamını hesaplayan fonksiyon
    public static int total(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Bir sayının özel bir asal sayı kontrolünü yapan fonksiyon
    public static boolean isPrimeX(int num) {
        while (num > 9) {
            if (!prime(num)) {
                return false;
            }
            num = total(num);
        }
        return prime(num);
    }

    // Zar desenini ekrana basan fonksiyon
    public static void displayZarPattern(int zar) {
        if (zar == 1) {
            System.out.println("         ");
            System.out.println("    *    ");
            System.out.println("         ");
        } else if (zar == 2) {
            System.out.println(" *       ");
            System.out.println("         ");
            System.out.println("       * ");
        } else if (zar == 3) {
            System.out.println(" *       ");
            System.out.println("    *    ");
            System.out.println("       * ");
        } else if (zar == 4) {
            System.out.println(" *     * ");
            System.out.println("         ");
            System.out.println(" *     * ");
        } else if (zar == 5) {
            System.out.println(" *     * ");
            System.out.println("    *    ");
            System.out.println(" *     * ");
        } else if (zar == 6) {
            System.out.println(" *  *  * ");
            System.out.println(" *  *  * ");
            System.out.println(" *  *  * ");
        } else {
            System.out.println("Invalid zar value.");
        }
    }

    public static void main(String[] args) {
        // Kullanıcıdan hangi görevi yapmak istediğini seçmesini isteyen kod parçası
        String input = JOptionPane.showInputDialog("Lütfen yapmak istediğiniz görevin numarasını girin (1-5 arası):");
        int choice = Integer.parseInt(input);

        if (choice == 2) {
            // 2. görev: Zar atma işlemi ve sonuçların ekrana basılması
            int zar1 = randomNum();
            int zar2 = randomNum();
            System.out.println("1. Zar :\n" + zar1);
            System.out.println("2. Zar :\n" + zar2);
            displayZarPattern(zar1);
            System.out.println("                  ");
            displayZarPattern(zar2);
        } else if (choice == 3) {
            // 3. görev: Rastgele bir sayıyı tahmin etme işlemi
            int randomNum = randomnum2();
            boolean correctGuess = false;

            while (!correctGuess) {
                try {
                    String giris = JOptionPane.showInputDialog("Bir tahmin girin (1 ile 100 arasında):");
                    int guess = Integer.parseInt(giris);

                    if (guess < 1 || guess > 100) {
                        JOptionPane.showMessageDialog(null, "Geçersiz giriş! 1 ile 100 arasında bir sayı girin.");
                    } else if (guess < randomNum) {
                        JOptionPane.showMessageDialog(null, "Daha yüksek bir sayı giriniz.");
                    } else if (guess > randomNum) {
                        JOptionPane.showMessageDialog(null, "Daha düşük bir sayı giriniz.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Tebrikler, doğru tahmin! Sayı: " + randomNum);
                        correctGuess = true;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Geçersiz giriş! Bir sayı girin.");
                }
            }

        } else if (choice == 4) {
            // 4. görev: Belirli koşullara uyan asal sayıları bulma işlemi
            for (int abc = 100; abc <= 999; abc++) {
                int cba = Integer.parseInt(new StringBuilder(String.valueOf(abc)).reverse().toString());
                if (cba > abc && asal(abc) && asal(cba)) {
                    int ab = abc / 10;
                    int bc = abc % 100;
                    int cb = cba / 10;
                    int ba = cba % 100;

                    if (asal(ab) && asal(bc) && asal(cb) && asal(ba)) {
                        System.out.println(abc);
                    }
                }
            }
        } else if (choice == 5) {
            // 5. görev: Özel asal sayı kontrolünü yapma işlemi
            String number = JOptionPane.showInputDialog("Input number:");
            int num = Integer.parseInt(number);
            boolean result = isPrimeX(num);
            System.out.println("isPrimeX result : " + result);
        } else {
            // Geçersiz görev numarası durumu
            JOptionPane.showMessageDialog(null, "Geçersiz görev numarası", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }
}
