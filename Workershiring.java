import java.util.Scanner;

public class Workershiring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] cost = new int[n];
        int[] type = new int[n];

        for (int i = 0; i < n; i++) {
            cost[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            type[i] = scanner.nextInt();
        }

        long cheapestTranslator = Long.MAX_VALUE / 2;
        long cheapestAuthor = Long.MAX_VALUE / 2;
        long cheapestAuthorTranslator = Long.MAX_VALUE / 2;

        for (int i = 0; i < n; i++) {
            if (type[i] == 1) {
                cheapestTranslator = Math.min(
                    cheapestTranslator,
                    cost[i]
                );
            } else if (type[i] == 2) {
                cheapestAuthor = Math.min(
                    cheapestAuthor,
                    cost[i]
                );
            } else {
                cheapestAuthorTranslator = Math.min(
                    cheapestAuthorTranslator,
                    cost[i]
                );
            }
        }

        long separateWorkersCost =
            cheapestTranslator + cheapestAuthor;

        long finalAnswer = Math.min(
            separateWorkersCost,
            cheapestAuthorTranslator
        );

        System.out.println(
            "Cheapest translator cost: " + cheapestTranslator
        );
        System.out.println(
            "Cheapest author cost: " + cheapestAuthor
        );
        System.out.println(
            "Cheapest author-translator cost: "
            + cheapestAuthorTranslator
        );
        System.out.println(
            "Cost using separate translator and author: "
            + separateWorkersCost
        );
        System.out.println(
            "Minimum total cost: " + finalAnswer
        );

        scanner.close();
    }
 }//tescase input try o/p is 2
// 4
// 10 8 2 5
// 1 2 3 3