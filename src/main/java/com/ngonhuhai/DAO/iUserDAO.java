package com.ngonhuhai.DAO;

import java.util.List;

import com.ngonhuhai.model.UserModel;

public interface iUserDAO extends GenericDAO<UserModel> {
    UserModel findbyUserpass(String username, String password);

    Long save(UserModel um);

    public Long save2(UserModel um);

    void update(UserModel update);

    void delete(Long id);

    List<UserModel> findAll2(Integer offset, Integer limit);

    int getTotalItem();

    public UserModel findOne(Long id);

    void updatePass(String passN, long id);
}
