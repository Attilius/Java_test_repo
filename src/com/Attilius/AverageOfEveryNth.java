package com.Attilius;

public class AverageOfEveryNth {
    public static void main(String[] args) {
         /*
        Készíts egy `averageOfEveryNth` nevű publikus függvényt, ami két paramétert vár:

        - egy `numbers` nevű tömböt pozitív integer-ekkel,
        - egy `n` nevű pozitív integer-t.

        A függvény térjen vissza a kapott tömb minden `n`-edik elemének átlagával.

        Példák:

        averageOfEveryNth(new int[] { 2, 4, 10, 34, 3, 16, 3, 21 }, 3)

        Amivel vissza kell térnie: `13`, mert `10` és `16` átlaga `13`.

        averageOfEveryNth(new int[] { 2, 4, 10, 34, 3, 16, 3, 21 }, 2)

        Amivel vissza kell térnie: `18.75`, mert `4`, `34`, `16`, `21` átlaga `18.75`.

        averageOfEveryNth(new int[] {2, 4, 10, 34, 3, 16, 3, 21 }, 10)

        Amivel vissza kell térnie: `0`, mert nincs érvényes elem.
    */

        int[] array = new int[]{2, 4, 10, 34, 3, 16, 3, 21};


        System.out.println(averageOfEveryNth(array, 5));

    }

    public static String averageOfEveryNth(int[] numbers, int n) {

        String average;
        if (n > numbers.length || n < 1) {
            average = String.valueOf(0);
        } else {
            int divisor = numbers.length / n;
            int sum = 0;

            for (int i = n - 1; i < numbers.length; i += n) {
                sum += numbers[i];
            }

            int averageValue = sum / divisor;
            if (sum % divisor != 0 && sum % 2 == 1) {
                average = String.valueOf((double) sum / (double) divisor);
            } else {
                average = String.valueOf(averageValue);
            }
        }
        return average;
    }
}
