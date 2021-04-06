package com.ngonhuhai.service;

import com.ngonhuhai.model.DonHangModel;

import java.util.List;

public interface iDonHangService {
    List<DonHangModel> findAll(Integer offset, Integer limit , Long id);
    int getTotalItem();
    DonHangModel insert(DonHangModel ghm);
    DonHangModel update(DonHangModel ghm);
    void delete(Long ghid, Long dtid);
    List<DonHangModel> findAll2(Integer offset, Integer limit);
    DonHangModel findOne(Long id);
}