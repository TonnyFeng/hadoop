package com.tonny.study.design.decorator;

/**
 * Created by fengwei on 2017/11/14.
 */
public class Espresso extends Drink
{
    public Espresso()
    {
        this.desc = "in Espresso,";
    }

    @Override
    public float cost()
    {
        return 100;
    }
}