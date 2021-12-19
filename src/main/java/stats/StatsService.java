package stats;

public class StatsService {

    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calcAvg(int[] sales) {
        return calcSum(sales) / sales.length;
    }

    public int findMaxSalesMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
                // при >= метод вернет последний месяц с макс. продажей, если есть месяцы с равными макс. продажами
                // при > метод вернет первый месяц с макс. продажей, если есть месяцы с равными макс. продажами
            }
            month++; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1; //индекс массива продаж начинается с нуля, а месяцы - с 1
    }

    public int findMinSalesMonth(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
                // при <= метод вернет последний месяц с мин. продажей, если есть месяцы с равными мин. продажами
                // при < метод вернет первый месяц с мин. продажей, если есть месяцы с равными мин. продажами
            }
            month++; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1; //индекс массива продаж начинается с нуля, а месяцы - с 1
    }

    public int countMonthsBelowAvg(int[] sales) {
        int counter = 0;
        for (int sale : sales) {
            if (sale < calcAvg(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int countMonthsAboveAvg(int[] sales) {
        int counter = 0;
        for (int sale : sales) {
            if (sale > calcAvg(sales)) {
                counter++;
            }
        }
        return counter;
    }
}
