package DesignPattern.Singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: JavaCache
 * @Auther: zhoucc
 * @Date: 2019/5/29 11:26
 * @Description: 利用双重加锁的懒汉式单例实现Java缓存
 */
public class JavaCache {

    private final static String DEFAULT_KEY = "One";
    private static Map<String,JavaCache> map = new HashMap<>();

    private static volatile JavaCache uniqueCache;

    private JavaCache(){
    }

    public static JavaCache getUniqueCache(){
        if (uniqueCache == null) {
            synchronized (JavaCache.class) {
                if (uniqueCache == null) {
                    uniqueCache = new JavaCache();
                    map.put(DEFAULT_KEY, uniqueCache);
                }
            }
        }
        return uniqueCache;
    }

}
