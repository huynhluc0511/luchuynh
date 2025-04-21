import java.util.Scanner;
public class ToaDo {
    private float x;
    private float y;

    public ToaDo() {
        this.x = 0.0f;
        this.y = 0.0f;
    }
    public ToaDo(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float layX() {
        return this.x;
    }
    public float layY() {
        return this.y;
    }
    public ToaDo congToaDo(ToaDo diemKhac) {
        float tongX = this.x + diemKhac.x;
        float tongY = this.y + diemKhac.y;
        return new ToaDo(tongX, tongY);
    }
    public ToaDo doiXungTrucHoanh() {
        return new ToaDo(this.x, -this.y);
    }
    public void inToaDo() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }
    public static void main(String[] args) {
        ToaDo diem1 = new ToaDo(2.5f, 3.0f);
        ToaDo diem2 = new ToaDo(1.5f, -1.0f);
        ToaDo tong = diem1.congToaDo(diem2);
        ToaDo doiXung = diem1.doiXungTrucHoanh();

        System.out.print("Tọa độ điểm 1: ");
        diem1.inToaDo();

        System.out.print("Tọa độ điểm 2: ");
        diem2.inToaDo();

        System.out.print("Tổng hai điểm: ");
        tong.inToaDo();

        System.out.print("Điểm đối xứng qua trục hoành của điểm 1: ");
        doiXung.inToaDo();
    }
}
