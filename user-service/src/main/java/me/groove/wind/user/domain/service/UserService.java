package me.groove.wind.user.domain.service;

import me.groove.wind.user.domain.model.entity.User;

/**
 * Created by GrooveWind on 2017/2/23.
 */
public interface UserService {

    public void add(User user) throws Exception;

    public void update(User user) throws Exception;

    public void delete(Long id) throws Exception;

    public User findById(Long id) throws Exception;

}
