package com.vanquyenit;

import java.io.File;

public class GetFileSize {
    public static long getFileSize(String filePath) {
        File file = new File(filePath);

        if (file.exists()) {
            return file.length();
        } else {
            return -1;
        }
    }
}
