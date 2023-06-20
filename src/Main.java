import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
//Mapインターフェースを実装するHashMapクラスの定義
    public static void main(String[] args) {
        Map<String, String> sports = new HashMap<>();
        sports.put("Baseball", "Shohei Ohtani");
        sports.put("Football", "Kaoru Mitoma");
        sports.put("Basketball", "Rui Hachimura");

//        種目を取り出す
        for (String sport : sports.keySet()) {
            System.out.println(sport);
        }

//        選手を取り出す
        for (String player : sports.values()) {
            System.out.println(player);
        }

//        種目から選手を取り出す
        for (String sport : sports.keySet()) {
            System.out.println(sports.get(sport));
        }

//        意図的に例外を投げる
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の範囲を超えています");
        }
    }
}