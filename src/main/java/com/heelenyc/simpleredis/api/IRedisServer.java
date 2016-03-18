package com.heelenyc.simpleredis.api;

/**
 * @author yicheng
 * @since 2016年1月11日
 *
 */
public interface IRedisServer {

    void stop();

    /**
     * @param address
     * @param port
     * @throws Exception
     */
    void start(String hostPort) throws Exception;
    
}
