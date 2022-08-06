public class Main {

  public Main(String[] args)  {
        System.out.println("РЕШЕНИЕ");

    }
    private static void task1() {
        System.out.println("ЗАДАНИЕ1") ;
    byte a = 1;
    short s = 500;
    int d = 266363;
    long f = 786735022L;
    float g = 2.1f;
    double h = 1.4d;
    char j = 6767;
    boolean k = false;}




    private static void task2(){
        double firstBoxerWeight = 78.2;
        double secondBoxerWeight = 82.7;
        double total = firstBoxerWeight + secondBoxerWeight;
        double difference = secondBoxerWeight - firstBoxerWeight;

        System.out.println(total);
        System.out.println(difference);}

    private static void task3() {
        int banana = 5;
        int bananaWeight = 80;
        int milk = 200 / 100;
        int milkweight = 105;
        int icecream = 2;
        int icecreamweight = 100;
        int raweggs = 4;
        int raweggsweight = 70;

        int total = (banana * bananaWeight) + (milk * milkweight) + (icecream * icecreamweight) + (raweggs * raweggsweight);
        int gramms = 1000;
        double totalkg = total / (gramms * 1.0);



     System.out.println("totalkg");}

    private static void task4() {
      int weight = 7;
      int grammsinkg = 1000;
      int weightingrams = weight * grammsinkg;

        int mingrammsaday = 250;
        int maxgrammsaday = 500;
        int minday = weightingrams / maxgrammsaday;
        int maxday = weightingrams / maxgrammsaday;

        double middledays = (minday + maxday) / (2 * 1.0);

       System.out.println("min = mindays");
        System.out.println("max = maxdays");
        System.out.println("middle = middledays");}

    private static void task5() {
        int percent = 10;
        double multyply = percent / (100 * 1.0);
        int mashasalary = 67_760;
        int denissalary = 83_690;
        int kristinsalary = 76_230;

        double mashaNewSalary = mashasalary + (mashasalary * multyply);
        double denisNewSalary = denissalary + (denissalary * multyply);
        double kristinNewSalary = kristinsalary + (kristinsalary * multyply);

        double mashaDifference = (mashaNewSalary - mashasalary) * 12;
        double denisDifference = (denisNewSalary - denissalary) * 12;
        double kristinDifference = (kristinNewSalary - kristinsalary) * 12;



    System.out.println( "Маша теперь получит" + mashaNewSalary + "рублей" + "Годовой доход вырос на" + mashaDifference + "рублей");
        System.out.println( "Денис теперь получает" + denisNewSalary + "рублей"+"Годовой доход вырос на" + denisDifference + "рублей");
        System.out.println( "Кристина теперь получает" + kristinNewSalary + "рублей"+"Годовой доход вырос на" + kristinDifference + "рублей");
    }












