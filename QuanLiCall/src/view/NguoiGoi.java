/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import view.HienThi.HienThi_NguoiGoi;
import view.Sua.Sua_NguoiGoi;
import view.Sua.Sua_NguoiGoi;
import view.Them.Them_NguoiGoi;
import view.Them.Them_NguoiGoi;
import view.TimKiem.Tim_NguoiGoi;
import view.Xoa.Xoa_NguoiGoi;

/**
 *
 * @author admin
 */
public class NguoiGoi {
    public static void main(String[] args) {
        NguoiGoi ng = new NguoiGoi();
        Scanner nhap = new Scanner(System.in);
        boolean stt = true;
        while (stt) {
            System.out.println("");
            System.out.println("Bạn đã chọn mục Người gọi");
            System.out.println("1.Thêm");
            System.out.println("2.Sửa");
            System.out.println("3.Xóa");
            System.out.println("4.Tìm kiếm");
            System.out.println("5.Hiển thị");
            System.out.println("6.Thoát");
            System.out.print("Mời chọn: ");
            int chon = Integer.parseInt(nhap.nextLine());
            switch (chon) {
                case 1:
                    stt = false;
                    Them_NguoiGoi TNG = new Them_NguoiGoi();
                    TNG.main(args);
                    break;
                case 2:
                    stt = false;
                    Sua_NguoiGoi SNG = new Sua_NguoiGoi();
                    SNG.main(args);
                    break;
                case 3:
                    stt = false;
                    Xoa_NguoiGoi XNG = new Xoa_NguoiGoi();
                    XNG.main(args);
                    break;
                case 4:
                    stt = false;
                    Tim_NguoiGoi TimNG = new Tim_NguoiGoi();
                    TimNG.main(args);
                    break;
                case 5:
                    stt = false;
                    HienThi_NguoiGoi HNG = new HienThi_NguoiGoi();
                    HNG.main(args);
                    break;
                case 6:
                    stt=false;
                    System.out.println("Bạn đã kết thúc phiên làm việc với Bảng Người Gọi");
                    System.out.println("");
                    QuanLi ql=new QuanLi();
                    ql.main(args);
            }
        }
    }
}
