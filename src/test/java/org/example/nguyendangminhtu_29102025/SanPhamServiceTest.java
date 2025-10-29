package org.example.nguyendangminhtu_29102025;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SanPhamServiceTest {
    SanPhamService sanPhamService;
    @BeforeEach
    void setUp(){
        sanPhamService = new SanPhamService();
    }

    @Test
    public void tc1_themHopLe(){
        SanPham sanPham = new SanPham("SP01","San pham 1",10,10f,5,"Danh muc 1");
        assertTrue(sanPhamService.add(sanPham));
    }

    @Test
    public void tc2_themSoLuongLaBienDuoi(){
        SanPham sanPham = new SanPham("SP01","San pham 1",10,10f,1,"Danh muc 1");
        assertTrue(sanPhamService.add(sanPham));
    }

    @Test
    public void tc3_themSoLuongLaBienTren(){
        SanPham sanPham = new SanPham("SP01","San pham 1",10,10f,100,"Danh muc 1");
        assertTrue(sanPhamService.add(sanPham));
    }

    @Test
    public void tc4_themSoLuongLaSoAm(){
        SanPham sanPham = new SanPham("SP01","San pham 1",10,10f,-100,"Danh muc 1");
        assertThrows(IllegalArgumentException.class, () -> sanPhamService.add(sanPham));
    }

    @Test
    public void tc5_themSoLuongLaSoLonHon100(){
        SanPham sanPham = new SanPham("SP01","San pham 1",10,10f,200,"Danh muc 1");
        assertThrows(IllegalArgumentException.class, () -> sanPhamService.add(sanPham));
    }

    @Test
    public void tc6_MaBiTrung(){
        SanPham sanPham = new SanPham("SP01","San pham 1",10,10f,5,"Danh muc 1");
        assertTrue(sanPhamService.add(sanPham));
        SanPham sanPham2 = new SanPham("SP01","San pham 1",10,10f,5,"Danh muc 1");
        assertThrows(IllegalArgumentException.class, () -> sanPhamService.add(sanPham2));
    }
}