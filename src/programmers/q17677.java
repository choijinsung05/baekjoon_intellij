package programmers;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class q17677 {
    public static void main(String[] args) {
        String str1 = "FRANCE";
        String str2 = "french";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        Map<String, Long> A = group(str1);
        Map<String, Long> B = group(str2);

        int intersection = getIntersection(A,B);
        int union = getUnion(A,B);

        int answer = intersection*65536/union;
        System.out.println(answer);

    }
    private static Map<String, Long> group(String word) {
        return IntStream.range(0, word.length() - 1)
                .mapToObj(index -> word.substring(index, index + 2))
                .filter(text -> text.chars().allMatch(character -> Character.isAlphabetic((char) character)))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    private static Integer getIntersection(Map<String, Long> words1, Map<String, Long> words2) {
        return words1.entrySet().stream()
                .filter(entry -> words2.containsKey(entry.getKey()))
                .map(entry -> Math.min(entry.getValue(), words2.get(entry.getKey())))
                .mapToInt(Long::intValue)
                .sum();
    }

    private static Integer getUnion(Map<String, Long> words1, Map<String, Long> words2) {
        Map<String, Long> copiedWords = new HashMap<>(words2);
        words1.forEach((key, value) -> copiedWords.put(key, Math.max(value, words2.getOrDefault(key, 0L))));

        return copiedWords.values().stream()
                .mapToInt(Long::intValue)
                .sum();
    }
}
/*
String.chars() 문자열을 IntStream 바꿔준다.
groupingBy(K V) 키 벨류값으로 map?? 해준다?
Fuction.identity() 매개변수로 받은걸 그대로 반환한다? 이렇게 생각해야되나?
collectors.counting() 개수 세주기
Map.getOrDefault(K, defaultValue) 키에 해당하는 값이 있으면 반환 아니면 디폴트값 반환
*/