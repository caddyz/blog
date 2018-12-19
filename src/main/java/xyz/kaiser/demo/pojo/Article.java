package xyz.kaiser.demo.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Kaiser
 * @since 2018-12-20
 */
@TableName("t_article")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "article_id", type = IdType.AUTO)
    private Integer articleId;

    private String articleTitle;

    private String articleAthor;

    private String articleContents;

    private Integer articleType;

    private LocalDateTime articleCreateTime;

    private String articleTitleImage;

    private String articleBackgroundImage;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }
    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }
    public String getArticleAthor() {
        return articleAthor;
    }

    public void setArticleAthor(String articleAthor) {
        this.articleAthor = articleAthor;
    }
    public String getArticleContents() {
        return articleContents;
    }

    public void setArticleContents(String articleContents) {
        this.articleContents = articleContents;
    }
    public Integer getArticleType() {
        return articleType;
    }

    public void setArticleType(Integer articleType) {
        this.articleType = articleType;
    }
    public LocalDateTime getArticleCreateTime() {
        return articleCreateTime;
    }

    public void setArticleCreateTime(LocalDateTime articleCreateTime) {
        this.articleCreateTime = articleCreateTime;
    }
    public String getArticleTitleImage() {
        return articleTitleImage;
    }

    public void setArticleTitleImage(String articleTitleImage) {
        this.articleTitleImage = articleTitleImage;
    }
    public String getArticleBackgroundImage() {
        return articleBackgroundImage;
    }

    public void setArticleBackgroundImage(String articleBackgroundImage) {
        this.articleBackgroundImage = articleBackgroundImage;
    }

    @Override
    public String toString() {
        return "Article{" +
        "articleId=" + articleId +
        ", articleTitle=" + articleTitle +
        ", articleAthor=" + articleAthor +
        ", articleContents=" + articleContents +
        ", articleType=" + articleType +
        ", articleCreateTime=" + articleCreateTime +
        ", articleTitleImage=" + articleTitleImage +
        ", articleBackgroundImage=" + articleBackgroundImage +
        "}";
    }
}
