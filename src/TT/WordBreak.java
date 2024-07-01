package TT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreak {
	public static List<String> wordBreak(String s, List<String> wordDict) {
        return wordBreakHelper(s, wordDict, new HashMap<>());
    }

    private static List<String> wordBreakHelper(String s, List<String> wordDict, Map<String, List<String>> memo) {
        if (memo.containsKey(s)) {
            return memo.get(s);
        }

        List<String> results = new ArrayList<>();
        if (s.isEmpty()) {
            results.add("");
            return results;
        }

        for (String word : wordDict) {
            if (s.startsWith(word)) {
                String substring = s.substring(word.length());
                List<String> subResults = wordBreakHelper(substring, wordDict, memo);
                for (String subResult : subResults) {
                    String space = subResult.isEmpty() ? "" : " ";
                    results.add(word + space + subResult);
                }
            }
        }

        memo.put(s, results);
        return results;
    }

    public static void main(String[] args) {
        String s = "catsanddog";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("and");
        wordDict.add("sand");
        wordDict.add("dog");

        List<String> result = wordBreak(s, wordDict);
        System.out.println(result);
    }
}
