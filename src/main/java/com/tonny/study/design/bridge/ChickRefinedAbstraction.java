package com.tonny.study.design.bridge;

/**
 * Created by fengwei on 2017/11/17.
 */
public class ChickRefinedAbstraction extends Abstraction
{
    public ChickRefinedAbstraction(final MovementImplementor implementor)
    {
        super(implementor);
    }

    @Override
    public void move()
    {
        System.out.print("chicks");
        super.move();
    }
}