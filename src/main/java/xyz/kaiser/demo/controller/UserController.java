package xyz.kaiser.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.kaiser.demo.pojo.User;
import xyz.kaiser.demo.service.IUserService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Kaiser
 * @since 2018-12-20
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService us;
    @GetMapping("/find")
    public User find(@RequestParam("uid") Integer userId){
        return us.getById(userId);
    }
}
