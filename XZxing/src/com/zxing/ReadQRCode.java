package com.zxing;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.datamatrix.DataMatrixReader;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/**
 * 通过程序读QRCocd
 */
public class ReadQRCode {

    public static void main(String[] args)  {

        try {
            MultiFormatReader reader = new MultiFormatReader();

            File file = new File("G:\\123.jpg");
            BufferedImage img = ImageIO.read(file);
            BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(img)));

            HashMap hints = new HashMap();
            hints.put(EncodeHintType.CHARACTER_SET, "utf-8");//字符集

            Result result = reader.decode(binaryBitmap, hints);
            System.out.println(result.toString());
            System.out.println(result.getBarcodeFormat());
            System.out.println(result.getText());
        }catch (Exception e){
            e.printStackTrace();
        }

    }


}
