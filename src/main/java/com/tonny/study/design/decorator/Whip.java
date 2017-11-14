package com.tonny.study.design.decorator;

/**
 * Created by fengwei on 2017/11/14.
 */
public class Whip extends Decorator
{
    public Whip(final Drink drink)
    {
        super(drink);
        this.desc = " add Whip ";
    }

    @Override
    public String getDesc()
    {
        return this.drink.getDesc() + this.desc;
    }

    @Override
    public float cost()
    {
        return this.drink.cost() + 15;
    }
}

