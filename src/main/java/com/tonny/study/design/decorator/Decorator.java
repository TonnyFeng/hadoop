package com.tonny.study.design.decorator;

/**
 * Created by fengwei on 2017/11/14.
 */
public abstract class Decorator extends Drink
{
    protected final Drink drink;

    public Decorator(final Drink drink)
    {
        this.drink = drink;
    }

    @Override
    public abstract float cost();
}