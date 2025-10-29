package org.example.nguyendangminhtu_29102025;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    public List<SanPham> sanPham = new ArrayList<SanPham>();

    public boolean add(SanPham sp) {
        if(sp.getMa()==null||sp.getMa().trim().isEmpty()){
            throw new IllegalArgumentException("Vui long khong duoc de trong ma");
        }
        if(sp.getTen()==null||sp.getTen().trim().isEmpty()){
            throw new IllegalArgumentException("Vui long khong duoc de trong ten");
        }
        if(sp.getNamBaoHanh()==0||sp.getNamBaoHanh()==null){
            throw new IllegalArgumentException("Vui long khong duoc de trong nam bao hanh");
        }
        if(sp.getGia()==0||sp.getGia()==null){
            throw new IllegalArgumentException("Vui long khong duoc de trong gia");
        }
        if(sp.getSoLuong()==0||sp.getSoLuong()==null){
            throw new IllegalArgumentException("Vui long khong duoc de trong luong");
        }
        if(sp.getSoLuong()<1||sp.getSoLuong()>100){
            throw new IllegalArgumentException("Vui long so luong phai <0 va >100");
        }
        if(sp.getDanhMuc()==null||sp.getDanhMuc().trim().isEmpty()){
            throw new IllegalArgumentException("Vui long khong duoc de trong danh muc");
        }
        for(SanPham sanpham : sanPham){
            if(sp.getMa().equals(sanpham.getMa())){
                throw new IllegalArgumentException("ID nay da ton tai:" +sanpham.getMa());
            }
        }
        sanPham.add(sp);
        return true;
    }
}
