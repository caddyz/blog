package xyz.kaiser.demo.service.impl;

import xyz.kaiser.demo.pojo.Discuss;
import xyz.kaiser.demo.mapper.DiscussMapper;
import xyz.kaiser.demo.service.IDiscussService;
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
public class DiscussServiceImpl extends ServiceImpl<DiscussMapper, Discuss> implements IDiscussService {

}
