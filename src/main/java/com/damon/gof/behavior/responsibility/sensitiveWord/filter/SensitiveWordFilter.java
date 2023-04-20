package com.damon.gof.behavior.responsibility.sensitiveWord.filter;

import com.damon.gof.behavior.responsibility.sensitiveWord.Content;

/**
 * Description: 敏感词汇拦截器
 *
 * @author damon.liu
 * Date 2023-04-19 8:08
 */
public interface SensitiveWordFilter {

    boolean doFilter(Content content);

}
