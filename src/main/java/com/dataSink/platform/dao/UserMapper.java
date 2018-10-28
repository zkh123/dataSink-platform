package com.dataSink.platform.dao;

import com.dataSink.platform.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by huanglijun on 2018/10/29.
 */
public interface UserMapper {
    User getUserByID(@Param(value = "id")int id);
}
