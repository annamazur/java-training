package com.github.annamazur.t2;

import lombok.Data;

/**
 * Created by pmazur on 2015-06-28.
 */
@Data
public class Prostokat implements Figura{

    private Double a;
    private Double b;


    public Double obliczPole(){
        return a*b;
    }
}
