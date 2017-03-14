package me.wind.groove.base.domain.model.entity;

/**
 * Created by GrooveWind on 2017/2/23.
 */
public abstract class Entity<T> {
    T id;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
