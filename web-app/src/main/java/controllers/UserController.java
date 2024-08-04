package controllers;

import com.imambux.converters.UserMapper;
import com.imambux.maven.domain.UserCommand;
import com.imambux.maven.entities.User;

public class UserController {

    User saveUser(UserCommand userCommand) {
        return UserMapper.INSTANCE.userCommandToUser(userCommand);
    }

}
