import java.util.Arrays;

public class _881_BoatToSavePeople {
    public static void main(String[] args) {
        int people[] = { 3, 5, 3, 4 };
        int limit = 5;
        System.out.println(numberOfBoats(people, limit));

    }

    static int numberOfBoats(int people[], int limit) {

        int len = people.length;
        int i = 0, j = len - 1, boats = 0;
        Arrays.sort(people);
        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;
            }
            j--;
            boats++;

        }

        return boats;
    }
}
