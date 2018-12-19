package xyz.kaiser.demo.service.impl;

import xyz.kaiser.demo.pojo.User;
import xyz.kaiser.demo.mapper.UserMapper;
import xyz.kaiser.demo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Kaiser
 * @since 2018-12-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
