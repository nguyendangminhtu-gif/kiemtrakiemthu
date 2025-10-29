package org.example.nguyendangminhtu_29102025;

public class TinhTongSoLe {
    public Integer tinhTong(Integer num){
        if(num<0||num>1000){
            throw new IllegalArgumentException("So khong duoc <0 va >100");
        }
        if(num==0||num==null){
            throw new NullPointerException("So khong duoc de trong");
        }
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num%2!=0){
                sum+=num;
            }
        }
        return sum;
    }
}
