package io.github.futurewl.module;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-07-03:17:21
 * @version 1.0
 */
@Data
@Entity
@Table(name = "t_user")
@EqualsAndHashCode(callSuper = true)
@org.hibernate.annotations.Table(appliesTo = "t_user", comment = "用户表")
public class User extends BaseEntity {

}
