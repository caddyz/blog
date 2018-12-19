package xyz.kaiser.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.kaiser.demo.mapper.AdminMapper;
import xyz.kaiser.demo.pojo.Admin;
import xyz.kaiser.demo.service.IAdminService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Kaiser
 * @since 2018-12-20
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private IAdminService as;
   @GetMapping("/find")
    public Admin find(@RequestParam("id") Integer adminId){
        return as.getById(adminId);
    }

}
