package xyz.kaiser.demo.service.impl;

import xyz.kaiser.demo.pojo.Article;
import xyz.kaiser.demo.mapper.ArticleMapper;
import xyz.kaiser.demo.service.IArticleService;
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
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
