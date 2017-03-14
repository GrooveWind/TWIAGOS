package me.groove.wind.user.domain.service.impl;

import me.groove.wind.user.domain.model.entity.User;
import me.groove.wind.user.domain.repository.UserRepository;
import me.groove.wind.user.domain.service.UserService;
import me.wind.groove.base.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by GrooveWind on 2017/2/23.
 */
@Service("userService")
public class UserServiceImpl extends MainService<User, Long> implements UserService {

    private UserRepository<User, Long> userRepository;

    @Autowired
    public UserServiceImpl(UserRepository<User, Long> userRepository) {
        super(userRepository);
        this.userRepository = userRepository;
    }

    @Override
    public void add(User user) throws Exception {
        userRepository.save(user);
    }

    @Override
    public void update(User user) throws Exception {
        userRepository.update(user);
    }

    @Override
    public void delete(Long id) throws Exception {
        userRepository.delete(id);
    }

    @Override
    public User findById(Long id) throws Exception {
        return userRepository.findById(id).get();
    }
}
