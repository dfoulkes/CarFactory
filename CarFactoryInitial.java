package com.mycompany.carfactoryassignment;

/**
 *
 * @author Shaksham Kapoor
 */
public class CarFactoryInitial implements CarFactory
{
    public ModelIt produce() {
        return new ModelIt();
    }   
}
