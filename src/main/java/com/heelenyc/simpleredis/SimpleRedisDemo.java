package com.heelenyc.simpleredis;

import com.heelenyc.simpleredis.api.reply.RedisReply;
import com.heelenyc.simpleredis.handler.AbstractRedisCommandHandler;
import com.heelenyc.simpleredis.reply.ErrorReply;
import com.heelenyc.simpleredis.reply.SimpleStringReply;
import com.heelenyc.simpleredis.server.AbstractRedisServer;

/**
 * @author yicheng
 * @since 2016年1月11日
 * 
 */
public class SimpleRedisDemo {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {

        new AbstractRedisServer(new AbstractRedisCommandHandler() {
            @Override
            protected RedisReply<?> set(String key, String value) {

                return new ErrorReply("later job".getBytes());
            }
            
            @Override
            protected RedisReply<?> info() {
                return new SimpleStringReply("info".getBytes());
            }
        }).start("127.0.0.1:6379");
    }

}
