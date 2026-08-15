import java.util.*;

class Bombproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        while (testCases-- > 0) {
            int houses = sc.nextInt();
            int attackStrength = sc.nextInt();

            int[] defence = new int[houses];

            for (int i = 0; i < houses; i++) {
                defence[i] = sc.nextInt();
            }

            System.out.println("Number of houses: " + houses);
            System.out.println("Bomb attack strength: " + attackStrength);
            System.out.println("House defence strengths: " + Arrays.toString(defence));

            int destroyedHouses = 0;

            for (int i = houses - 1; i >= 0; i--) {
                if (defence[i] < attackStrength) {
                    destroyedHouses = i + 1;

                    System.out.println(
                        "Bomb can destroy house number: " + (i + 1)
                    );
                    System.out.println(
                        "Therefore, houses destroyed: " + destroyedHouses
                    );

                    break;
                }
            }

            System.out.println("Maximum houses destroyed: " + destroyedHouses);
            System.out.println();
        }

        sc.close();
    }
}/*2
8 6
4 1 6 1 6 5 6 8
2 1
3 5 Sample inpute testcase */