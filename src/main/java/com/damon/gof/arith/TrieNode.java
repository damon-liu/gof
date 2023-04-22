package com.damon.gof.arith;

public class TrieNode {

    private String element;

    private Integer i;

    private TrieNode[] children;
    // 判断当前节点是否为单词结尾
    private boolean isEndOfWord;
    // 存储学校名称
    private String schoolName;

    public TrieNode() {
        children = new TrieNode[26]; // 假设只包含小写英文字母
        isEndOfWord = false;
        schoolName = null;
    }

    public boolean containsKey(char ch) {
        return children[ch - 'a'] != null;
    }

    public TrieNode get(char ch) {
        return children[ch - 'a'];
    }

    public void put(char ch, TrieNode node) {
        element = String.valueOf(ch);
        int i = ch - 'a';
        System.out.println(i + "个位置放入元素："+ element);
        children[ch - 'a'] = node;
    }

    public void setEndOfWord(String schoolName) {
        isEndOfWord = true;
        this.schoolName = schoolName;
    }

    public boolean isEndOfWord() {
        return isEndOfWord;
    }

    public String getSchoolName() {
        return schoolName;
    }
}
