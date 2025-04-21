import java.util.Scanner;
public class Hocsinh{
    private int maso;
    private string hoten;
    private float dtb;
    public int getMaso(){
        return maso;
    }
    public void setMaso(int maso){
        this.maso=maso;
    }
    public String gethoten(){
        return hoten;
    }
    public void sethoten(string hoten){
        this.hoten=hoten;
    }
    public float getdtb(){
        return dtb;
    }
    public void setdtb(float dtb){
        this.dtb=dtb;
    }
    public hocsinh(){
        this.maso=0;
        this.hoten=null;
        this.dtb=0f;
    }
    public hocsinh(int maso,string hoten, float dtb){
        this.maso=maso;
        this.hoten=hoten;
        this.dtb=dtb;
    }
    public hocsinh(hocsinh tmp){
        this.maso=tmp.maso;
        this.hoten=tmp.hoten;
        this.dtb=tmp.dtb;
    }
    public void input(){
        Scanner sc=nem Scanner(system.in);
        system.out.println("nhap ma so:");
        maso=sc.nextInt();
        system.out.println("nhap ho ten:");
        sc.nextLine();
        hoten=sc.nextLine();
        system.out.println("nhap diem trung binh:");
        dtb=sc.nextfloat();
    }
    public void output(){
        system.out.println(maso +"-"+ hoten +"-"+ dtb );
    }
    public void rank(){
        if(dtb<5)
        system.out.println("xep loai yeu");
        else{
            if(dtb>=5 && dtb<7)
            system.out.println("xep loai trung binh");
            else{
                else  if (diemTB >= 7 && diemTB < 8){  
                    System.out.println("xep loai kha ");
                }
                else  if (diemTB >= 8 && diemTB < 10){  
                    System.out.println("xep loai gioi ")
            }
        }

    }
}   