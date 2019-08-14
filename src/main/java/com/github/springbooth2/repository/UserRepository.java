package com.github.springbooth2.repository;

import com.github.springbooth2.pojo.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <p>
 * 创建时间为 19:50 2019-04-12
 * 项目名称 spring-boot-h2
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

public interface UserRepository extends JpaRepository<UserDO, Integer> {
}
