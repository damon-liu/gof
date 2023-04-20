package com.damon.gof.create.build;

/**
 * Description:
 *
 * @author damon.liu
 * Date 2023-04-20 4:00
 */
public class BuildDemo {

    public static void main(String[] args) {
        ResourcePoolConfig config = new ResourcePoolConfig.Builder()
                .setName("dbconnectionpool")
                .setMaxTotal(16)
                .setMaxIdle(16)
                .setMinIdle(12).build();
        System.out.println("config:  " + config);
    }
}
