package cn.edu.njupt.rumi.base.cache;

/**
 * 缓存管理器基类
 *
 * @author ZhangXin
 * @date 2020/9/18 21:04
 */
public abstract class BaseCacheManager<T> {

    /**
     * 使用本地缓存
     */
    private boolean useLocalCache = true;

    /**
     * 使用分布式缓存
     */
    private boolean useRemoteCache = false;

    /**
     * 本地缓存过期时间，单位为s
     */
    protected long localCacheExpireTime = 1000;

    /**
     * 分布式缓存过期时间，单位为s
     */
    protected long remoteCacheExpireTime = 5 * 1000;

    protected BaseCacheManager(boolean useLocalCache, boolean useRemoteCache, long localCacheExpireTime, long remoteCacheExpireTime) {
        // 本地缓存和分布式缓存都为false时，采用默认设置
        if (useLocalCache || useRemoteCache) {
            this.useLocalCache = useLocalCache;
            this.useRemoteCache = useRemoteCache;
        }
        // 分布式缓存过期时间必须大于等于本地缓存过期时间
        if (localCacheExpireTime <= remoteCacheExpireTime) {
            this.localCacheExpireTime = localCacheExpireTime;
            this.remoteCacheExpireTime = remoteCacheExpireTime;
        }
    }

    /**
     * 加载对象
     *
     * @param key key
     * @return 对象
     */
    public T load(String key) {
        CacheObject<T> cacheObject = null;

        // 1.从本地缓存中加载
        if (useLocalCache) {
            cacheObject = loadFromLocalCache(key);
            if (cacheObject != null && cacheObject.isExisted()) {
                return cacheObject.getValue();
            }
        }

        // 2.从分布式缓存中加载
        if (useRemoteCache) {
            cacheObject = loadFromRemoteCache(key);
            if (cacheObject != null && cacheObject.isExisted()) {
                if (useLocalCache) {
                    putToLocalCache(key, cacheObject.getValue(), localCacheExpireTime);
                }
                return cacheObject.getValue();
            }
        }

        // 3.从数据库中加载
        cacheObject = loadFromDb(key);
        if (useLocalCache) {
            putToLocalCache(key, cacheObject.getValue(), localCacheExpireTime);
        }
        if (useRemoteCache) {
            putToRemoteCache(key, cacheObject.getValue(), remoteCacheExpireTime);
        }
        return cacheObject.getValue();
    }

    /**
     * 从本地缓存中获取对象
     *
     * @param key key
     * @return 缓存对象
     */
    protected abstract CacheObject<T> loadFromLocalCache(String key);

    /**
     * 放进本地缓存
     *
     * @param key        key
     * @param value      value
     * @param expireTime 过期时间
     */
    protected abstract void putToLocalCache(String key, T value, long expireTime);

    /**
     * 从分布式缓存中获取对象
     *
     * @param key key
     * @return 缓存对象
     */
    protected abstract CacheObject<T> loadFromRemoteCache(String key);

    /**
     * 放进分布式缓存
     *
     * @param key        key
     * @param value      value
     * @param expireTime 过期时间
     */
    protected abstract void putToRemoteCache(String key, T value, long expireTime);

    /**
     * 从DB中获取对象
     *
     * @param key key
     * @return 缓存对象
     */
    protected abstract CacheObject<T> loadFromDb(String key);
}
