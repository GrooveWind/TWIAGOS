package me.wind.groove.base.repository;

import java.util.Collection;
import java.util.Optional;

/**
 * 提供只读操作
 * Created by GrooveWind on 2017/2/23.
 */
public interface ReadOnlyRepository<TE, T> {

    boolean contain(T id);

    Optional<TE> findById(T id);

    Collection<TE> findAll();

}
