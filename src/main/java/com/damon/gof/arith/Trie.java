package com.damon.gof.arith;

import java.util.*;

public class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String schoolName, List<String> keywords) {
        TrieNode node = root;
        for (String keyword : keywords) {
            for (int i = 0; i < keyword.length(); i++) {
                char ch = keyword.charAt(i);
                if (!node.containsKey(ch)) {
                    node.put(ch, new TrieNode());
                }
                node = node.get(ch);
            }
            node.setEndOfWord(schoolName);
            node = root;
        }
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        Map<String, List<String>> collegeData = new HashMap<>();
        collegeData.put("Swiss Federal Institute of Technology in Zurich", Arrays.asList("swiss", "ethz", "eth", "zurich", "federal", "eidgenossische", "technology"));
        collegeData.put("Technical University of Berlin", Arrays.asList("technical", "berlin"));
        for (Map.Entry<String, List<String>> entry : collegeData.entrySet()) {
            String schoolName = entry.getKey();
            List<String> keywords = entry.getValue();
            trie.insert(schoolName, keywords);
        }
        // System.out.println(trie.search("tech"));
        System.out.println(trie.search("tech ber"));
    }

    public List<String> search(String prefix) {
        TrieNode node = searchPrefix(prefix);
        List<String> result = new ArrayList<>();
        dfs(node, result);
        return result;
    }

    private TrieNode searchPrefix(String prefix) {
        TrieNode node = root;
        String[] split = prefix.split(" ");
        if (split.length > 1) {
            for (String s : split) {
                int length = s.length();
                node = getTrieNode(node, s, length);
            }
            return node;
        }

        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if (node.containsKey(ch)) {
                node = node.get(ch);
            } else {
                return null;
            }
        }
        return node;
    }

    private static TrieNode getTrieNode(TrieNode node, String s, int length) {
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (node.containsKey(ch)) {
                node = node.get(ch);
            } else {
                return new TrieNode();
            }
        }
        return node;
    }

    private void dfs(TrieNode node, List<String> result) {
        if (node == null) {
            return;
        }
        if (node.isEndOfWord()) {
            result.add(node.getSchoolName());
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            dfs(node.get(ch), result);
        }
    }
}
