package com.vanquyenit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chọn chức năng:");
        System.out.println("1. Lấy kích thước file");
        System.out.println("2. Xóa thư mục hoặc file");
        System.out.print("Nhập lựa chọn của bạn: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                getFileSize(scanner);
                break;
            case 2:
                deleteFileOrDirectory(scanner);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
    }

    private static void getFileSize(Scanner scanner) {
        System.out.print("Nhập đường dẫn tới file: ");
        String filePath = scanner.nextLine();

        long fileSize = GetFileSize.getFileSize(filePath);
        if (fileSize != -1) {
            System.out.println("Độ lớn của file là: " + fileSize + " bytes");
        } else {
            System.out.println("File không tồn tại.");
        }
    }

    private static void deleteFileOrDirectory(Scanner scanner) {
        System.out.print("Nhập đường dẫn tới thư mục hoặc file: ");
        String path = scanner.nextLine();

        DeleteFile.deleteFileOrDirectory(path);
    }
}