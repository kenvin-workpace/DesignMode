package com.whz.decorator.simple2;

/**
 * Created by kevin on 2018/4/29 21:55
 * <p>
 * 描述：
 */
public class PersonCloth extends IPerson {

    private IPerson person;

    public PersonCloth(IPerson person) {
        this.person = person;
    }

    @Override
    public void dressed() {
        person.dressed();
    }
}
