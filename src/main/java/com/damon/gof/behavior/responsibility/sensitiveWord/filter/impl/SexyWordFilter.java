package com.damon.gof.behavior.responsibility.sensitiveWord.filter.impl;

import com.damon.gof.behavior.responsibility.sensitiveWord.Content;
import com.damon.gof.behavior.responsibility.sensitiveWord.filter.SensitiveWordFilter;

/**
 * Description: 涉黄拦截器
 *
 * @author damon.liu
 * Date 2023-04-19 8:47
 */
public class SexyWordFilter implements SensitiveWordFilter {

    @Override
    public boolean doFilter(Content content) {
        if (content.getCode() == 3) {
            System.out.println("可能涉及黄色相关！");
            return false;
        }
        return true;
    }

}
