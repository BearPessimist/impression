package com.itbear.impression.entities.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * @author：Bear
 * @site：https://www.yuque.com/bearpess
 * @email：bearpess@gmail.com
 * @created 2021-07-18 17:36:21 星期日
 * <p>
 * features：
 */
@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
@Data
@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String cover;

    @Lob
    private String content;

    private String type; // 项目的类型

    private String github; // github 地址

    private String gitee; // 码云地址

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private User user; // 用户id

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Category category;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private List<Tag> tag;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime; // 创建时间

    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyTime; // 更新时间

}
