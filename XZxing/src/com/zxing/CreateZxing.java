package com.zxing;

import com.google.zxing.*;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;

public class CreateZxing {

    public static void main(String[] args) {
        int w = 300;
        int h = 300;
        String formt = "png";
        String content = "https://www.baidu.com";
//        定义二维码参数
        HashMap hints = new HashMap();
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");//字符集
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);//出错等级
        hints.put(EncodeHintType.MARGIN, 2);//边距，生成的二维码的空白部分，默认是5
//        生成
        try {
            BitMatrix encode = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, w, h, hints);
//            生成二维码
            Path file = new File("G:/img.png").toPath();
            MatrixToImageWriter.writeToPath(encode,formt,file);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
