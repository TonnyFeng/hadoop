package com.tonny.study.design.bridge;

/**
 * Created by fengwei on 2017/11/17.
 */
public class Abstraction
{
    protected final MovementImplementor implementor;

    public Abstraction(final MovementImplementor implementor)
    {
        this.implementor = implementor;
    }

    public void move()
    {
        this.implementor.move();
    }
}