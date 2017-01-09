/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse443_hw01;

import vpt.Image;
import vpt.algorithms.display.Display2D;
import vpt.algorithms.io.Load;

/**
 *
 * @author Seyfullah Becerikli
 */
public class CSE443_HW01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Goruntu belgesini diskten bellege aktar
        Image img = Load.invoke("lennaGray.png");
        
        
        Filter f = new Filter(new AverageAlgorithm());
        Display2D.invoke(f.SmoothFilter(img));
        
        Filter f2 = new Filter(new MedianAlgorithm());
        Display2D.invoke(f2.SmoothFilter(img));
        
        Filter f3 = new Filter(new MorphoIntAlgorithm());
        Display2D.invoke(f3.EdgeFilter(img));
        
        Filter f4 = new Filter(new MorphoExtAlgorithm());
        Display2D.invoke(f4.EdgeFilter(img));
        /*
        // genisligi ogren
        int genislik = img.getXDim();

        // yuksekligi ogren
        int yukseklik = img.getYDim();
        System.err.println(genislik + " " + yukseklik);

        // ayni boyutta bos goruntu olustur
        Image copy = img.newInstance(false);

        // 100, 100 konumundaki degeri oku
        int p = img.getXYByte(100, 100);
        System.err.println(p);

        // goruntule
        Display2D.invoke(img);

        // 100, 100 konumuna yeni deger ata
        img.setXYByte(100, 100, 255);

        // yeniden goruntule
        Display2D.invoke(img);
         */
    }

}
