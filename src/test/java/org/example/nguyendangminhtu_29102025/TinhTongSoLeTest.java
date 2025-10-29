package org.example.nguyendangminhtu_29102025;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongSoLeTest {
    TinhTongSoLe tinhTongSoLe;
    @BeforeEach
    void setUp(){
        tinhTongSoLe = new TinhTongSoLe();
    }

    @Test
    public void tc1_tinhTongSoLeHopLe(){
        int num = 5;
        assertEquals(10,tinhTongSoLe.tinhTong(num));
    }

    @Test
    public void tc2_tinhTongSoLeTaiBienDuoi(){
        int num = 1;
        assertEquals(0,tinhTongSoLe.tinhTong(num));
    }

    @Test
    public void tc3_tinhTongSoLeBeHon0(){
        assertThrows(IllegalArgumentException.class,() -> tinhTongSoLe.tinhTong(-1));
    }

    @Test
    public void tc4_tinhTongSoLeLonHon100(){
        assertThrows(IllegalArgumentException.class,() -> tinhTongSoLe.tinhTong(2000));
    }

    @Test
    public void tc5_tinhTongSoLeNull(){
        assertThrows(NullPointerException.class,() -> tinhTongSoLe.tinhTong(null));
    }

}