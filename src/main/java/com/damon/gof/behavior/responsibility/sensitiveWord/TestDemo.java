package com.damon.gof.behavior.responsibility.sensitiveWord;

import com.damon.gof.behavior.responsibility.sensitiveWord.filter.impl.AdsWordFilter;
import com.damon.gof.behavior.responsibility.sensitiveWord.filter.impl.PoliticalWordFilter;
import com.damon.gof.behavior.responsibility.sensitiveWord.filter.impl.SexyWordFilter;

/**
 * Description: 论坛中发表的帖子可能会包含一些敏感词（比如涉黄、广告、反动等词汇）
 * 只要有一项满足，整个责任链执行不通过
 *
 * @author damon.liu
 * Date 2023-04-19 8:53
 */
public class TestDemo {

    public static void main(String[] args) {
        SensitiveWordFilterChain filterChain = new SensitiveWordFilterChain();
        filterChain.addFilter(new AdsWordFilter());
        filterChain.addFilter(new SexyWordFilter());
        filterChain.addFilter(new PoliticalWordFilter());
        for (int i = 1; i <= 4; i++) {
            System.out.println("----- 发表第：" + i + " 篇文章 -----");
            Content content = new Content();
            content.setCode(i);
            boolean legal = filterChain.filter(content);
            if (!legal) {
                System.out.println("发表失败！");
            } else {
                System.out.println("发表成功！");
            }
        }
    }
}
