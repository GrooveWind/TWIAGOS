package me.wind.groove.base.service;

import me.wind.groove.base.repository.ReadOnlyRepository;

/**
 * Created by GrooveWind on 2017/2/23.
 */
public abstract class ReadOnlyBaseService<TE, T> {

    private ReadOnlyRepository<TE, T> repository;

    ReadOnlyBaseService(ReadOnlyRepository<TE, T> repository) {
        this.repository = repository;
    }

}
