package com.github.annamazur.t2;

import lombok.Data;

/**
 * Created by pmazur on 2015-06-28.
 */
@Data
public class Kwadrat implements Figura{

    private Double a;


    public Double obliczPole(){
        return a*a;
    }
}
