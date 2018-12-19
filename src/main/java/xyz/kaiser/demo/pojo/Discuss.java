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
@TableName("t_discuss")
public class Discuss implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "discuss_id", type = IdType.AUTO)
    private Integer discussId;

    private Integer userId;

    private Integer articleId;

    private String discussContents;

    private LocalDateTime discussCreateTime;

    private String discussReplay;

    private LocalDateTime discussReplayTime;

    public Integer getDiscussId() {
        return discussId;
    }

    public void setDiscussId(Integer discussId) {
        this.discussId = discussId;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }
    public String getDiscussContents() {
        return discussContents;
    }

    public void setDiscussContents(String discussContents) {
        this.discussContents = discussContents;
    }
    public LocalDateTime getDiscussCreateTime() {
        return discussCreateTime;
    }

    public void setDiscussCreateTime(LocalDateTime discussCreateTime) {
        this.discussCreateTime = discussCreateTime;
    }
    public String getDiscussReplay() {
        return discussReplay;
    }

    public void setDiscussReplay(String discussReplay) {
        this.discussReplay = discussReplay;
    }
    public LocalDateTime getDiscussReplayTime() {
        return discussReplayTime;
    }

    public void setDiscussReplayTime(LocalDateTime discussReplayTime) {
        this.discussReplayTime = discussReplayTime;
    }

    @Override
    public String toString() {
        return "Discuss{" +
        "discussId=" + discussId +
        ", userId=" + userId +
        ", articleId=" + articleId +
        ", discussContents=" + discussContents +
        ", discussCreateTime=" + discussCreateTime +
        ", discussReplay=" + discussReplay +
        ", discussReplayTime=" + discussReplayTime +
        "}";
    }
}
