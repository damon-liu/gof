package com.damon.gof.behavior.responsibility.sensitiveWord.filter.impl;

import com.damon.gof.behavior.responsibility.sensitiveWord.Content;
import com.damon.gof.behavior.responsibility.sensitiveWord.filter.SensitiveWordFilter;

/**
 * Description: 反动拦截器
 *
 * @author damon.liu
 * Date 2023-04-19 8:48
 */
public class PoliticalWordFilter implements SensitiveWordFilter {

    @Override
    public boolean doFilter(Content content) {
        if (content.getCode() == 2) {
            System.out.println("可能涉及反动相关！");
            return false;
        }
        return true;
    }
}
