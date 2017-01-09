/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse443_hw01;

import java.util.LinkedList;
import vpt.Image;
import vpt.algorithms.io.Load;

/**
 *
 * @author Seyfullah Becerikli
 */
public class AverageAlgorithm implements SmoothingFilter {

    @Override
    public Image FilterImg(Image img) {
        img = Load.invoke("lennaGray.png");
        // genisligi ogren
        int genislik = img.getXDim();

        // yuksekligi ogren
        int yukseklik = img.getYDim();

        Image copy = img.newInstance(false);

        LinkedList<Integer> matrix = new LinkedList<Integer>();
        int matrixC = 0;
        for (int i = 2; i < genislik - 2; ++i) {
            for (int j = 2; j < yukseklik - 2; ++j) {
                matrixC = 0;
                for (int k = i - 2; k <= i + 2; ++k) {
                    for (int l = j - 2; l <= j + 2; ++l) {
                        matrix.add(matrixC, img.getXYByte(k, l));
                        ++matrixC;
                    }
                }
                int sum = 0;
                for (int o = 0; o < 25; ++o) {
                    sum += matrix.get(o);
                }
                copy.setXYByte(i, j, sum / 25);
                //System.out.println(matrixC);
            }
        }
        return copy;
    }
}
