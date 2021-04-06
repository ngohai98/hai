package com.ngonhuhai.service.impl;

import com.ngonhuhai.DAO.iGioHangDAO;
import com.ngonhuhai.DAO.iPhoneDAO;
import com.ngonhuhai.DAO.impl.GioHangDAO;
import com.ngonhuhai.DAO.impl.PhoneDAO;
import com.ngonhuhai.model.GiohangModel;
import com.ngonhuhai.model.PhoneModel;
import com.ngonhuhai.service.iGioHangService;

import javax.inject.Inject;
import java.util.List;

public class GioHangService implements iGioHangService {

    private iGioHangDAO giohangDAO=new GioHangDAO();

    private iPhoneDAO phoneDAO=new PhoneDAO();
    @Override
    public List<GiohangModel> findAll(Integer offset, Integer limit , Long id) {
        // TODO Auto-generated method stub

        return giohangDAO.findAll2(offset, limit ,id);
    }
    @Override
    public List<GiohangModel> findAll2(Integer offset, Integer limit) {
        // TODO Auto-generated method stub

        return giohangDAO.findAll(offset, limit);
    }

    @Override
    public int getTotalItem() {
        // TODO Auto-generated method stub
        return giohangDAO.getTotalItem();
    }

    @Override
    public GiohangModel insert(GiohangModel ghm) {
        // TODO Auto-generated method stub
        if(ghm.getGh_gia()==null&&ghm.getGh_soluongmua()==null) {
            PhoneModel pm=phoneDAO.findOne(ghm.getGh_dt_id());
            ghm.setGh_gia(Long.parseLong(pm.getDt_GiaBan()) );

            ghm.setGh_soluongmua((long) (1));
        }
        ghm.setGh_tongtien(ghm.getGh_gia()*ghm.getGh_soluongmua());
        Long id=giohangDAO.save(ghm);
        return giohangDAO.findOne(id);
    }

    @Override
    public GiohangModel update(GiohangModel ghm) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long ghid, Long dtid) {

         giohangDAO.delete(ghid,dtid);
    }
    @Override
    public GiohangModel findOne(Long id) {
        // TODO Auto-generated method stub
        return giohangDAO.findOne(id);
    }



}
