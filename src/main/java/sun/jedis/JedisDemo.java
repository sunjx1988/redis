package sun.jedis;

import com.sun.media.jfxmedia.logging.Logger;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * Created by sunjx on 2018/4/16.
 */
@Slf4j
public class JedisDemo {

    private String serverName = "jx.sun";

    private int port = 6379;

    private String password = "000000";

    private Jedis jedis ;

    //创建jedis client
    public Jedis createJedis(){
        this.jedis = new Jedis(serverName, port);
        log.debug("创建jedis成功");
        return jedis;
    }

    //连接jedis
    public void connect(){
        this.jedis.connect();
        log.debug("连接jedis成功");
    }

    //断开连接
    public void disconnect(){
        this.jedis.disconnect();
        log.debug("断开jedis");
    }

    //登录
    public void auth(){
        this.jedis.auth(this.password);
        log.debug("登录jedis");
    }

    //列出所有的key
    public void keys(){
        Set<String> keys = this.jedis.keys("*");
        log.debug("列出所有key");
        for (String s : keys){
            System.out.println(s);
        }
    }

    //set
    public void set(String key , String value){
        this.jedis.set(key, value);
        log.debug("set {}={}",key,value);
    }

}
