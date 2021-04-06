package com.ngonhuhai.DAO.impl;

import com.ngonhuhai.DAO.iDonHangDAO;
import com.ngonhuhai.mapper.DonHangMapper;
import com.ngonhuhai.model.DonHangModel;

import java.util.List;

public class DonHangDAO extends AbstractDAO<DonHangModel> implements iDonHangDAO {

    @Override
    public List<DonHangModel> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Long save(DonHangModel dhm) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void update(DonHangModel update) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<DonHangModel> findAll2(Integer offset, Integer limit) {
        // TODO Auto-generated method stub
        String sql="select * from tbldonhang as d inner join tblgiohang as g on d.gh_id=g.gh_id inner join tbluser as u on d.dh_user_id=u.user_id limit ?,?";
        return query(sql, new DonHangMapper(), offset,limit);
    }

    @Override
    public int getTotalItem() {
        // TODO Auto-generated method stub
        String sql = "Select Count(*) from tbldonhang";
        return count(sql);
    }



}