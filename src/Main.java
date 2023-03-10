public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        byte byteVariable = 127;
        short shortVariable = 32767;
        int intVariable = 2147483647;
        long longVariable = 9223372036854775807L;
        float floatVariable = 0.123456f;
        double doubleVariable = 0.6543210123456789;
        System.out.println("Значение переменной byteVariable с типом byte равно " + byteVariable);
        System.out.println("Значение переменной shortVariable с типом short равно " + shortVariable);
        System.out.println("Значение переменной intVariable с типом int равно " + intVariable);
        System.out.println("Значение переменной longVariable с типом long равно " + longVariable);
        System.out.println("Значение переменной floatVariable с типом float равно " + floatVariable);
        System.out.println("Значение переменной doubleVariable с типом double равно " + doubleVariable);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        float x1 = 27.12f;
        long x2 = 987678965549L;
        float x3 = 2.786f;
        short x4 = 569;
        short x5 = -159;
        short x6 = 27897;
        byte x7 = 67;
        System.out.println(x1 + " - тип float");
        System.out.println(x2 + " - тип long");
        System.out.println(x3 + " - тип float");
        System.out.println(x4 + " - тип short");
        System.out.println(x5 + " - тип short");
        System.out.println(x6 + " - тип short");
        System.out.println(x7 + " - тип byte");
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte lyudmilaPavlovnaClass = 23;
        byte annaSergeevnaClass = 27;
        byte ekaterinaAndreevnaClass = 30;
        short sheetsOfPaper = 480;
        byte sheetsPerStudent = (byte) (sheetsOfPaper / (lyudmilaPavlovnaClass + annaSergeevnaClass + ekaterinaAndreevnaClass));
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte minutesToBottles = 2;
        byte bottles = 16;
        byte bottlePerMinute = (byte) (bottles / minutesToBottles);
        short bottlesPerTwentyMinutes = (short) (bottlePerMinute * 20);
        System.out.println("За 20 минут машина произвела " + bottlesPerTwentyMinutes + " штук бутылок");
        short bottlesPerDay = (short) (bottlePerMinute * 60 * 24);
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        int bottlesPerThreeDays = bottlesPerDay * 3;
        System.out.println("За трое суток машина произвела " + bottlesPerThreeDays + " штук бутылок");
        int bottlesPerMonth = bottlesPerThreeDays * 10;
        System.out.println("За один месяц (из 30 суток) машина произвела " + bottlesPerMonth + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte canOfPaint = 120;
        byte canOfWhitePaintPerClass = 2;
        byte canOfBrownPaintPerClass = 4;
        byte totalClasses = (byte) (canOfPaint / (canOfWhitePaintPerClass + canOfBrownPaintPerClass));
        byte totalCanOfWhitePaint = (byte) (totalClasses * canOfWhitePaintPerClass);
        byte totalCanOfBrownPaint = (byte) (totalClasses * canOfBrownPaintPerClass);
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalCanOfWhitePaint + " банок белой краски и " + totalCanOfBrownPaint + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte bananas = 5;
        byte weightPerOneBanana = 80;
        short milk = 200;
        byte weightPer100mlOfMilk = 105;
        byte iceCream = 2;
        byte weightPerOneIceCream = 100;
        byte eggs = 4;
        byte weightPerOneEgg = 70;
        short totalWeightInGrams = (short) (bananas * weightPerOneBanana + milk * weightPer100mlOfMilk / 100 + iceCream * weightPerOneIceCream + eggs * weightPerOneEgg);
        float totalWeightInKilogram = totalWeightInGrams / 1000f;
        System.out.println("Вес (количество граммов) такого спортзавтрака " + totalWeightInGrams + " г, или " + totalWeightInKilogram + " кг");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        short weightOfFat = 7000;
        short lowerLimitOfFatDropping = 250;
        short topLimitOfFatDropping = 500;
        short daysPerLowerLimit = (short) (weightOfFat / lowerLimitOfFatDropping);
        short daysPerTopLimit = (short) (weightOfFat / topLimitOfFatDropping);
        short mediumLimitOfFatDropping = (short) ((lowerLimitOfFatDropping + topLimitOfFatDropping) / 2);
        short mediumDaysOfFatDropping = (short) (weightOfFat / mediumLimitOfFatDropping);
        System.out.println(daysPerLowerLimit + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(daysPerTopLimit + " дней уйдет на похудение, если каждый день будет худеть на 500 грамм");
        System.out.println(mediumDaysOfFatDropping + " дней может потребоваться в среднем, чтобы добиться результата похудения");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        float salaryGrowing = 0.1f;
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinkaSalary = 76230;
        float mashaSalaryAfterGrowing = mashaSalary * salaryGrowing + mashaSalary;
        float denisSalaryAfterGrowing = denisSalary * salaryGrowing + denisSalary;
        float kristinkaSalaryAfterGrowing = kristinkaSalary * salaryGrowing + kristinkaSalary;
        float mashaDifferenceInAnnualIncome = (mashaSalaryAfterGrowing - mashaSalary) * 12;
        float denisDifferenceInAnnualIncome = (denisSalaryAfterGrowing - denisSalary) * 12;
        float kristinkaDifferenceInAnnualIncome = (kristinkaSalaryAfterGrowing - kristinkaSalary) * 12;
        System.out.println("Маша теперь получает " + mashaSalaryAfterGrowing + " рублей. Годовой доход вырос на " + mashaDifferenceInAnnualIncome + " рублей");
        System.out.println("Денис теперь получает " + denisSalaryAfterGrowing + " рублей. Годовой доход вырос на " + denisDifferenceInAnnualIncome + " рублей");
        System.out.println("Кристинка теперь получает " + kristinkaSalaryAfterGrowing + " рублей. Годовой доход вырос на " + kristinkaDifferenceInAnnualIncome + " рублей");
    }
}