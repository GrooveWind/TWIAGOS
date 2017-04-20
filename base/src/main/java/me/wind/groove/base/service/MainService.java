package me.wind.groove.base.service;

import me.wind.groove.base.repository.ModifyRepository;

/**
 * Created by GrooveWind on 2017/2/23.
 */
public abstract class MainService<TE, T> extends ReadOnlyBaseService<TE, T> {

    private ModifyRepository<TE, T> repository;

    protected MainService(ModifyRepository<TE, T> repository) {
        super(repository);
        this.repository = repository;
    }

}
