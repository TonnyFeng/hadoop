package com.tonny.study.design.decorator;

/**
 * Created by fengwei on 2017/11/14.
 */
public abstract class Drink
{
    protected String desc;

    public String getDesc()
    {
        return this.desc;
    }

    public abstract float cost();
}