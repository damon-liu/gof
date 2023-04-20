package com.damon.gof.behavior.responsibility.sensitiveWord;

import com.damon.gof.behavior.responsibility.sensitiveWord.filter.SensitiveWordFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-19 8:49
 */

public class SensitiveWordFilterChain {

    private List<SensitiveWordFilter> filters = new ArrayList<>();

    public void addFilter(SensitiveWordFilter filter) {
        this.filters.add(filter);
    }

    public boolean filter(Content content) {
        for (SensitiveWordFilter filter : filters) {
            if (!filter.doFilter(content)) {
                return false;
            }
        }
        return true;
    }
}
