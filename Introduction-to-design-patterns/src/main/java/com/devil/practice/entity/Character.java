package com.devil.practice.entity;

import com.devil.practice.behavior.WeaponBehavior;

/**
 * Created by wangdi on 2017/6/30.
 */
public abstract class Character {

    WeaponBehavior weaponBehavior;

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    void fight(){
        weaponBehavior.useWeapon();
    }
}
