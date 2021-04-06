package com.ngonhuhai.service;

import java.util.List;

import com.ngonhuhai.model.UserModel;

public interface iUserService {
    UserModel findByUserPass(String username, String password);

    List<UserModel> findAll(Integer offset, Integer limit);

    int getTotalItem();

    Long insert(UserModel um);

    UserModel insert2(UserModel um);

    UserModel findOne(Long id);

    UserModel update(UserModel um);

    void delete(long[] ids);

    void updatePass(String passN, long id);
}
