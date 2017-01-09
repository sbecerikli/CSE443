/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse443_hw01;

import vpt.Image;

/**
 *
 * @author Seyfullah Becerikli
 */
public class Filter {
    private SmoothingFilter smtFilter;
    private EdgeDetectionFilter edgFilter;

    public Filter(SmoothingFilter smtFilter) {
        this.smtFilter = smtFilter;
    }

    public Filter(EdgeDetectionFilter edgFilter) {
        this.edgFilter = edgFilter;
    }
   
    public Image SmoothFilter(Image img) {
        return smtFilter.FilterImg(img);
    }
    
    public Image EdgeFilter(Image img) {
        return edgFilter.FilterImg(img);
    }
}
