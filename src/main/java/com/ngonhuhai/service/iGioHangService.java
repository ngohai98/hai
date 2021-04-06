package com.ngonhuhai.service;

import com.ngonhuhai.model.GiohangModel;

import java.util.List;

public interface iGioHangService {
    List<GiohangModel> findAll(Integer offset, Integer limit , Long id);
    int getTotalItem();
    GiohangModel insert(GiohangModel ghm);
    GiohangModel update(GiohangModel ghm);
    void delete(Long ghid, Long dtid);
    List<GiohangModel> findAll2(Integer offset, Integer limit);
    GiohangModel findOne(Long id);
}
