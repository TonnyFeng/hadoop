package com.tonny.study.design.strategy;

/**
 * Created by fengwei on 2017/11/9.
 */
public class AdvancedMember implements MemberStrategy {
    @Override
    public double discount() {
        return 0.3;
    }
}
