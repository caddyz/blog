package xyz.kaiser.demo.service.impl;

import xyz.kaiser.demo.pojo.Admin;
import xyz.kaiser.demo.mapper.AdminMapper;
import xyz.kaiser.demo.service.IAdminService;
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
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
