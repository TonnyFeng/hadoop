package com.tonny.study.design.bridge;

/**
 * Created by fengwei on 2017/11/17.
 */
public class JumpConcreteImplement extends MovementImplementor
{
    @Override
    public void move()
    {
        System.out.println(" jump!!!");
    }
}
