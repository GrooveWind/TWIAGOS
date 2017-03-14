package me.groove.wind.user.domain.repository.impl;

import me.groove.wind.user.domain.model.entity.User;
import me.groove.wind.user.domain.repository.UserRepository;
import me.wind.groove.base.domain.model.entity.Entity;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Created by GrooveWind on 2017/2/23.
 */
@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository<User, Long> {

    /** just demo */
    private Map<Long, User> demos;

    /** just demo */
    public UserRepositoryImpl(){
        demos = new HashMap<>();
        User u1 = new User();
        u1.setId(1L);
        u1.setRealname("test1");
        demos.put(1L, u1);

        User u2 = new User();
        u2.setId(2L);
        u2.setRealname("test2");
        demos.put(2L, u2);
    }

    @Override
    public boolean save(User entity) {
        demos.put(entity.getId(), entity);
        return true;
    }

    @Override
    public boolean update(User entity) {
        demos.put(entity.getId(), entity);
        return true;
    }

    @Override
    public boolean remove(Long id) {
        demos.remove(id);
        return true;
    }

    @Override
    public boolean delete(Long id) {
        demos.remove(id);
        return true;
    }

    @Override
    public boolean contain(Long id) {
        return demos.containsKey(id);
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.of(demos.get(id));
    }

    @Override
    public Collection<User> findAll() {
        return demos.values();
    }
}
