import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк: ");
        int n = Integer.parseInt(scanner.nextLine());
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Введите строку " + (i + 1) + ": ");
            strings.add(scanner.nextLine());
        }

        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() != s2.length()) {
                    return s1.length() - s2.length();
                } else {
                    return s1.compareTo(s2);
                }
            }
        });

        System.out.println("Отсортированные строки: ");
        for (String str : strings) {
            System.out.println(str + " (" + str.length() + ")");
        }
    }
}