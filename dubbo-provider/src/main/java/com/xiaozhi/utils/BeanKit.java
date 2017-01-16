package com.xiaozhi.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.PropertyUtils;


/**
 * Created by huangzh on 2017/1/9.
 */

/**
 * @param <P> 目标类
 * @param <R> 源类
 */
@Slf4j
public class BeanKit<P, R> {
    /**
     * 把p对象相同的属性赋予其
     *
     * @param d 目标对象
     * @param r 源对象
     * @return
     */
    public P Ro2Po(Class<P> d, R r) {
        P entity = null;
        try {
            entity = d.newInstance();
            PropertyUtils.copyProperties(entity, r);
        } catch (Exception e) {
            log.error("PropertyUtils.copyProperties error, orig={} desc={}", entity, r, e);

        }
        return entity;
    }
}
