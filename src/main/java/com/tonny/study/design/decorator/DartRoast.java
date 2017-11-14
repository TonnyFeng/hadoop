package com.tonny.study.design.decorator;

/**
 * Created by fengwei on 2017/11/14.
 */
public class DartRoast extends Drink
{
    public DartRoast()
    {
        this.desc = "in DartRoast,";
    }

    @Override
    public float cost()
    {
        return 50;
    }
}