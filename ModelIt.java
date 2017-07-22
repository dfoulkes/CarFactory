package com.mycompany.carfactoryassignment;

/**
 *
 * @author Shaksham Kapoor
 */
public class ModelIt 
{
    public Wheels getWheels()
    {
        return new Wheels();
    }
    
    public Engine getEngine()
    {
        return new Engine();
    }
    
    public Color getColor()
    {
        return new Color();
    }
    
    public Diameter getDiameter()
    {
        return new Diameter();
    }
    
    public Transmission getTrans()
    {
        return Transmission.MANUAL;
    }
    
    public Doors getDoors()
    {
        return new Doors();
    }
}
