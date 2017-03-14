package me.groove.wind.user.resources;

import me.groove.wind.user.domain.model.entity.User;
import me.groove.wind.user.domain.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by GrooveWind on 2017/2/23.
 */
@RestController
@RequestMapping("/v1/user") /** 使用v1前缀进行API版本控制*/
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping(value = "/home")
    public String home() {
        return "Hello World";
    }

    @GetMapping(value = "/info/{id}")
    public ResponseEntity<User> findById(@PathVariable("id") Long id) {
        logger.info("userService findById() for {} ", id);
        User user;
        try {
            user = userService.findById(id);
        } catch (Exception ex) {
            logger.error("Exception raised findById REST Call {}", ex.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

}
