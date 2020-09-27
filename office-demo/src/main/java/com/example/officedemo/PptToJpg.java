package com.example.officedemo;

import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hslf.model.Slide;
import org.apache.poi.hslf.model.TextRun;
import org.apache.poi.hslf.usermodel.RichTextRun;
import org.apache.poi.hslf.usermodel.SlideShow;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

/**
 * @ClassName PptToJpg
 * @Description TODO
 * @Author chenzl
 * @Date 2020/9/23 15:18
 */
public class PptToJpg {

    public static void main(String[] args) {
        // 读入PPT文件
        File file = new File("/Users/sevenchen/doc/1.JVM入门.ppt");
        doPPTtoImage(file);
    }

    public static boolean doPPTtoImage(File file) {
        boolean isppt = checkFile(file);
        if (!isppt) {
            System.out.println("The image you specify don't exit!");
            return false;
        }
        try {
            FileInputStream is = new FileInputStream(file);
            SlideShow ppt = new SlideShow(is);
            is.close();
            Dimension pgsize = ppt.getPageSize();
            Slide[] slide = ppt.getSlides();
            for (int i = 0; i < slide.length; i++) {
                TextRun[] truns = slide[i].getTextRuns();
                for (int k = 0; k < truns.length; k++) {
                    RichTextRun[] rtruns = truns[k].getRichTextRuns();
                    for (int l = 0; l < rtruns.length; l++) {
                        rtruns[l].setFontIndex(1);
                        rtruns[l].setFontName("微软雅黑");
                    }
                }
                BufferedImage img = new BufferedImage(pgsize.width, pgsize.height,
                BufferedImage.TYPE_INT_RGB);
                Graphics2D graphics = img.createGraphics();
                graphics.setPaint(Color.BLUE);
                graphics.fill(new Rectangle2D.Float(0, 0, pgsize.width, pgsize.height));
                slide[i].draw(graphics);
                // 这里设置图片的存放路径和图片的格式(jpeg,png,bmp等等),注意生成文件路径
                File path = new File("/Users/sevenchen/Desktop/Seven的代码实验室/01.JVM基础入门/原素材/images");
                if (!path.exists()) {
                    path.mkdirs();
                }
                // 可测试多种图片格式
                    FileOutputStream out = new FileOutputStream(path + "/" + (i + 1) + ".jpg");
                    javax.imageio.ImageIO.write(img, "jpeg", out);
//                FileOutputStream out = new FileOutputStream(path + "/" + (i + 1) + ".jpg");
//                javax.imageio.ImageIO.write(img, "png", out);
                out.close();
            }
            System.out.println("success!!");
            return true;
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {

        }
        return false;
    }

    // function 检查文件是否为PPT
    public static boolean checkFile(File file) {
        boolean isppt = false;
        String filename = file.getName();
        String suffixname = null;
        if (filename != null && filename.indexOf(".") != -1) {
            suffixname = filename.substring(filename.lastIndexOf("."));
            if (suffixname.equals(".ppt") || suffixname.equals(".pptx")) {
                isppt = true;
            }
            return isppt;
        } else {
            return isppt;
        }
    }

}