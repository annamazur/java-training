package com.github.annamazur.t2;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by pmazur on 2015-06-28.
 */

public class Trojkat implements Figura{

    @Getter
    @Setter
    private Double a;

    @Getter
    @Setter
    private Double h;


    public Double obliczPole(){
        return 0.5*a*h;
    }
}
