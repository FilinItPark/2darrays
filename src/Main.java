import java.util.Random;

/**
 * @author 1ommy
 * @version 10.10.2023
 */
public class Main {
    public static void main(String[] args) {
     /*   int i = 1;

        int sum = 0;
        int proizv = 1;

        // вывести числа оканчивающиеся на 5
        while (i <= 10000) {
            if (i % 100 == 15) {
                System.out.println(i);
            }
//            sum += i;
//            proizv *= i;
            *//*
            sum = sum + i
            sum += i;

            sum++ - прибавляем 1
             *//*
            i++;
        }
*/
    /*    int i2 = 0;
        do {
            i2++;
            System.out.println(i2);
        } while (i2 != 100);
*/

//        System.out.println(sum);
//        System.out.println(proizv);

     /*   for (int j = 0; j <= 100; j += 2) {
            System.out.println(j);
        }

        long a = 6487951928L;*/
        // вывести на экран все ЦИФРЫ числа

     /*   int count = 0;
        while (a > 0) {
            count += 1;
            a /= 10;
        }
        System.out.println(count);
    */


//        array[0] = 1;
//        array[1] = 3;
//        array[10] = 15;
//        int[] array2 = {1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
//        System.out.println(array2.length);



        /*
        задача №1: посчитать сумму и произведение элементов массива
         */
    /*    int sum = 0;
        long proizv = 1L;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            // sum += array[i];
            proizv *= (long) array[i];
        }
        System.out.println(sum);
        System.out.println(proizv);

*/
        int[] arr2 = new int[50];
        Random rand = new Random();

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = rand.nextInt(0, 1000);
        }


        int max = -10000;
        int min = 10000000;
        int[] array = {1, 3, 9, 15, 17, 19, 21, 23, 27, 29, 35, 24, 25, 30, 31, 33, 34, 35, 57, 75};

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println(max);
        System.out.println(min);

        String privetMir = "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Delectus deleniti eius facere fuga iure laboriosam, nisi praesentium quos sapiente voluptatibus! Atque consequuntur dolor dolorum eaque nulla officia ratione vitae voluptatibus. Ad architecto atque beatae consectetur deleniti earum error esse eveniet, fugit harum id illo ipsum itaque minima nihil numquam odit pariatur placeat, quidem repudiandae sequi ut voluptatibus! Assumenda at dolores id incidunt ipsum officia pariatur quibusdam reiciendis, suscipit ullam? Cupiditate, dolor exercitationem itaque laborum laudantium libero minus non nulla odio praesentium quo, quod recusandae rerum velit voluptate! Corporis dolor magnam soluta. Alias assumenda corporis dignissimos facilis ipsa iusto libero maiores, neque omnis perspiciatis quae veniam! Accusantium consequuntur ex illum in iure pariatur perferendis ut! Eligendi exercitationem in itaque natus sequi. At dignissimos dolores ducimus eaque et eveniet fugit id, ipsam laboriosam laudantium maxime molestias nostrum nulla numquam odio qui quod quos reiciendis repellat sequi similique sint soluta unde veniam voluptatem!\n";

        for (int i = 0; i < privetMir.length(); i++) {
            System.out.println(privetMir.charAt(i));
        }

        int[][] a = new int[3][3];

        int count = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = count;
                count++;
            }
        }
//        (i,j)

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}