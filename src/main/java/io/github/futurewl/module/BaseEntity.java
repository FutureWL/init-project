package io.github.futurewl.module;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 功能描述：实体基类
 *
 * @author weilai create by 2019-03-23:09:07
 * @version 1.0
 */
@Data
@MappedSuperclass
public class BaseEntity implements Serializable {

    /**
     * ID
     */
    @Id
    @ApiModelProperty(hidden = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, columnDefinition = "bigint(20) comment 'ID'")
    protected Long id;

    /**
     * 创建时间
     */
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(updatable = false, columnDefinition = "timestamp default current_timestamp comment '创建时间'")
    protected Date createTime;

    /**
     * 更新时间
     */
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(updatable = false, columnDefinition = "timestamp default current_timestamp on update current_timestamp comment '更新时间'")
    protected Date updateTime;

}
