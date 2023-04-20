package com.damon.gof.behavior.responsibility.sensitiveWord.filter.impl;

import com.damon.gof.behavior.responsibility.sensitiveWord.Content;
import com.damon.gof.behavior.responsibility.sensitiveWord.filter.SensitiveWordFilter;

/**
 * Description: 广告拦截器
 *
 * @author damon.liu
 * Date 2023-04-19 9:02
 */
public class AdsWordFilter implements SensitiveWordFilter {
    @Override
    public boolean doFilter(Content content) {
        if (content.getCode() == 1) {
            System.out.println("可能涉及广告相关！");
            return false;
        }
        return true;
    }
}
