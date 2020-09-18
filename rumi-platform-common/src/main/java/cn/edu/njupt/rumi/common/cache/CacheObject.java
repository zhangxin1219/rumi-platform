package cn.edu.njupt.rumi.common.cache;

import lombok.Data;

import java.util.Date;

/**
 * 缓存对象
 *
 * @author ZhangXin
 * @date 2020/9/18 20:52
 */
@Data
public class CacheObject<T> {
    /**
     * key
     */
    private String key;

    /**
     * 是否存在
     */
    private boolean existed;

    /**
     * 缓存时间
     */
    private Date createdTime;

    /**
     * value
     */
    private T value;

    public static <T> CacheObject<T> nullObject(String key) {
        CacheObject<T> cacheObject = new CacheObject<T>();
        cacheObject.setKey(key);
        cacheObject.setExisted(false);
        cacheObject.setCreatedTime(new Date());
        return cacheObject;
    }

    public static <T> CacheObject<T> newObject(String key, T value) {
        CacheObject<T> cacheObject = new CacheObject<T>();
        cacheObject.setKey(key);
        cacheObject.setExisted(true);
        cacheObject.setCreatedTime(new Date());
        cacheObject.setValue(value);
        return cacheObject;
    }

}
