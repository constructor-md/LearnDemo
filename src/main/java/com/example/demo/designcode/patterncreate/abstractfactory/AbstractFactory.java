package com.example.demo.designcode.patterncreate.abstractfactory;

import com.example.demo.designcode.patterncreate.abstractfactory.item.Color;
import com.example.demo.designcode.patterncreate.abstractfactory.item.Shape;

/**
 * 工厂抽象类，具体工厂方法的抽象，提供统一访问和方法调用接口
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String shapeType);
    public abstract Color getColor(String colorType);

}
