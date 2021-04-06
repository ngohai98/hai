package com.ngonhuhai.service.impl;

import com.ngonhuhai.DAO.iDonHangDAO;
import com.ngonhuhai.DAO.iGioHangDAO;
import com.ngonhuhai.DAO.impl.DonHangDAO;
import com.ngonhuhai.DAO.impl.GioHangDAO;
import com.ngonhuhai.model.DonHangModel;
import com.ngonhuhai.model.GiohangModel;
import com.ngonhuhai.service.iDonHangService;

import javax.inject.Inject;
import java.util.List;

public class DonHangService implements iDonHangService {

    @Inject
    private iDonHangDAO donhangDAO =new DonHangDAO();
    @Inject
    private iGioHangDAO giohangDAO =new GioHangDAO();
    @Override
    public List<DonHangModel> findAll(Integer offset, Integer limit, Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getTotalItem() {
        // TODO Auto-generated method stub
        return donhangDAO.getTotalItem();
    }

    @Override
    public DonHangModel insert(DonHangModel ghm) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public DonHangModel update(DonHangModel ghm) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long ghid, Long dtid) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<DonHangModel> findAll2(Integer offset, Integer limit) {
        // TODO Auto-generated method stub
        List<DonHangModel> list = donhangDAO.findAll2(offset, limit);
        for (DonHangModel item : list) {
            GiohangModel gm= giohangDAO.findOne(item.getGh_id());
            item.setGiohang(gm);;
        }
        return list;
    }

    @Override
    public DonHangModel findOne(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

}