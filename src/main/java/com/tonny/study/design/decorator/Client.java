package com.tonny.study.design.decorator;

/**
 * Created by fengwei on 2017/11/14.
 */
public class Client
{
    public static void main(final String[] args)
    {
        final Drink dartRoastDrink = new DartRoast();
        final Drink espressoDrink = new Espresso();

        final Drink Mocha = new Mocha(dartRoastDrink);
        final Drink soy = new Soy(Mocha);
        System.out.println(soy.getDesc() + soy.cost());

        final Drink whip = new Whip(espressoDrink);
        System.out.println(whip.getDesc() + whip.cost());
    }
}