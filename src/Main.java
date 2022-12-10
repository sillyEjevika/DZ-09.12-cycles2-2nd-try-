public class Main {
    public static void main(String[] args) {
        // Задача №1
        System.out.println("Задача №1");
        int firstDeposit = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2459000) {
            total = total + total / 100;
            total = total + firstDeposit;
            month = month + 1;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Итого накоплений " + total);
        System.out.println("Итого месяцев " + month);
        System.out.println("Итого лет " + month / 12);

        // Задача №2
        System.out.println("Задача №2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(" " + i);
        }
        System.out.println();
        for (int gg = 10; gg >= 1; gg--) {
            System.out.print(" " + gg);
        }
        System.out.println();

        // Задача №3
        System.out.println("Задача №3");
        int population = 12_000_000;
        int bornPer1000 = 17;
        int diePer1000 = 8;
        int dif = bornPer1000 - diePer1000;
        for (int f = 1; f <= 10; f++) {
            population += population * dif / 1000;
            System.out.println("Год " + f + ", численность населения составляет " + population + " человек");
        }
        // Задача №4
        System.out.println("Задача №4");
        int deposit = 15000;
        int total1 = 0;
        int month1 = 0;
        int plusPerMonth = 7;
        while (total1 <= 12_000_000) {
            total1 = total1 + total1 * plusPerMonth / 100;
            total1 = total1 + deposit;
            month1 = month1 + 1;
            System.out.println("Месяц " + month1 + " , сумма накоплений равна " + total1 + " рублей");
        }
        System.out.println(total1);
        System.out.println(month1);

        // Задача 5
        System.out.println("Задача №5");
        int deposit5 = 15000;
        int total5 = 0;
        int month5 = 0;
        int plusPerMonth5 = 7;
        while (total5 <= 12_000_000) {
            total5 = total5 + total5 * plusPerMonth5 / 100;
            total5 = total5 + deposit5;
            month5 = month5 + 1;
            if (month5 % 6 == 0) {
                System.out.println("Месяц " + month5 + " , сумма накоплений равна " + total5 + " рублей");
            }
        }
        // Задача 6
        System.out.println("Задача №6");
        int dep = 15000;
        int total11 = 0;
        int m = 0;
        for (int year =0; year <= 108; year ++ ) {
            total11 = total11  + total11  * 7/100;
            total11  = total11  + dep;
            m = m + 1;
            if (m % 6 == 0) {
                System.out.println("Месяц " + m + " , сумма накоплений равна " + total11 + " рублей");
            }
        }
        // Задача 7
        System.out.println("Задача №7");
        for (int days = 2; days <=31; days = days+7) {
            System.out.println ("Сегодня пятница, " + days + "-е число. Необходимо подготовить отчет");
        }
        // Задача 8
        System.out.println("Задача №8");
        for (int yearOfComet = 0; yearOfComet <=3000; yearOfComet =  yearOfComet + 79) {
            int ourDays = 2022;
            if (yearOfComet > (ourDays - 200) && yearOfComet < (ourDays + 100)) {
                System.out.println(yearOfComet);
            }
        }
    }
}
