import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        byte chon,loai;
        Scanner sc = new Scanner(System.in);
        HangHoa dshh = new DSHangHoa();
        HangHoa h;
        do{
            System.out.println("1: them mot mat hang vao danh sach");
            System.out.println("2: xuat mat hang theo loai");
            System.out.println("0: thoat");
            System.out.print("chon chu nang");
            chon = sc.nextByte();
            switch (chon){
                case 1:
                    System.out.print("1: hang dien may, 2: hang thuc pham. hay chon loai mat hang:");
                    loai = sc.nextByte();
                    if(loai == 1)
                        h = new DienMay();
                    else
                        h = new ThucPham();
                    h.nhap();
                    dshh.themMH(h);
                    break;
                case 2:
                    System.out.print("xuat danh sach mat hang nao (DM/TP):");
                    loaimh = sc.nextByte();
                    dshh.xuatDSTheoLoai(loaimh);
                    break;
                default:chon =0;
                break;
            }
        }
        while (chon != 0);
    }
}