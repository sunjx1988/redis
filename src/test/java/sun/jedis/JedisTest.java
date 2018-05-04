package sun.jedis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunjx on 2018/4/16.
 */
public class JedisTest {

    private JedisDemo jedisDemo = new JedisDemo();

    @Before
    public void before(){
        jedisDemo.createJedis();
        jedisDemo.connect();
    }

    @Test
    public void keys(){
        jedisDemo.keys();
    }

    @Test
    public void set(){
        jedisDemo.set("name", "abc");
        jedisDemo.keys();
    }

    @After
    public void after(){
        jedisDemo.disconnect();
    }
}
