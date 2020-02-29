package com.czl.classloader;

/**
 * ClassName:Person
 * Package:com.czl.classloader
 * Description:
 *
 * @date:2020-2-22 11:37
 * @autor:18855032359
 */
public class Person {
    public Person person;

    public Person(){}

    public void setObject(Object object) {
        System.out.println("object++"+object);
        this.person = (Person) object;
    }
}
