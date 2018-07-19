package com.neo.remote;

import org.springframework.stereotype.Component;

/**
 * @author Create by lixz
 * @Description:
 * @date Create in 2018/7/18  11:53
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{
    @Override
    public String hello(String name) {
        return "hello,"+name+"you to fail";
    }
}
