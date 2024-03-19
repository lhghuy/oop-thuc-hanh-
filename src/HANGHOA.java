import java.util.Scanner;

public class HangHoa {
    String mahang,tenhang,nsx;
    Scanner sc = new Scanner(System.in);

    class DSHangHoa(){
        private int sl;
        private HangHoa ds[];

        public DSHangHoa(){
            ds = new HangHoa[100];
            sl = 0;
        }
        public void themHH(HangHoa h){
            ds[sl] = h;
            sl++;
        }
    }
    void HangHoa() {
        this.mahang = mahang;
        this.tenhang = tenhang;
        this.nsx = nsx;
    }

    void Xuat(){
        System.out.print("ma hang: ");
        mahang = sc.nextLine();
        System.out.print("ten hang: ");
        tenhang = sc.nextLine();
        System.out.print("nha sx: ");
        nsx = sc.nextLine();
    }
}

class DienMay extends HangHoa{
    Double TGBH,DienAp,CongSuat;

    void DienMay(){
        this.TGBH = TGBH;
        this.DienAp = DienAp;
        this.CongSuat = CongSuat;
    }

    void dmm(){
        super.Xuat();
        System.out.print("tgbh: ");
        TGBH = sc.nextDouble();
        System.out.print("dien ap: ");
        DienAp = sc.nextDouble();
        System.out.print("cong suat: ");
        CongSuat = sc.nextDouble();
    }
}

class SanhSu extends HangHoa{
    String nLieu;

    void Sanhsu(){
        this.nLieu = nLieu;
    }

    void sss(){
        super.Xuat();
        System.out.print("nguyen lieu: ");
        nLieu = sc.nextLine();
    }
}

class ThucPham extends HangHoa{
    int nsx,hsd;

    void ThucPham(){
        this.nsx = nsx;
        this.hsd = hsd;
    }

    void tpp(){
        super.Xuat();
        System.out.print("ngay sx: ");
        nsx = sc.nextInt();
        System.out.print("hsd: ");
        hsd = sc.nextInt();
    }
}