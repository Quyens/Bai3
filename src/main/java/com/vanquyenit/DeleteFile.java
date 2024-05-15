package com.vanquyenit;

import java.io.File;

public class DeleteFile {
    public static void deleteFileOrDirectory(String path) {
        File file = new File(path);

        if (file.exists()) {
            if (file.isDirectory()) {
                deleteDirectory(file);
            } else {
                deleteFile(file);
            }
        } else {
            System.out.println("Thư mục hoặc file không tồn tại.");
        }
    }

    private static void deleteFile(File file) {
        if (file.delete()) {
            System.out.println("Đã xóa file thành công.");
        } else {
            System.out.println("Không thể xóa file.");
        }
    }

    private static void deleteDirectory(File directory) {
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteDirectory(file);
                } else {
                    deleteFile(file);
                }
            }
        }

        if (directory.delete()) {
            System.out.println("Đã xóa thư mục thành công.");
        } else {
            System.out.println("Không thể xóa thư mục.");
        }
    }
}
