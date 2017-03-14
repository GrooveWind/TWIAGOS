package me.wind.groove.base.repository;

/**
 * 提供增删改查操作
 * Created by GrooveWind on 2017/2/23.
 */
public interface ModifyRepository<TE, T> extends ReadOnlyRepository<TE, T> {

    boolean save(TE entity);

    boolean update(TE entity);

    /**
     * 逻辑删除
     * @param id
     * @return
     */
    boolean remove(T id);

    /**
     * 物理删除
     * @param id
     * @return
     */
    boolean delete(T id);

}
