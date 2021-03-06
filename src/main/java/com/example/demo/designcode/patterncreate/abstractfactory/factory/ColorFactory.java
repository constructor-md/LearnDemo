package com.example.demo.designcode.patterncreate.abstractfactory.factory;

import com.example.demo.designcode.patterncreate.abstractfactory.*;
import com.example.demo.designcode.patterncreate.abstractfactory.item.*;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }
        //不直接把null和无内容进行判断是因为会报空指针异常，equals和equalsIgnoreCase的前置容易报空指针，所以要把必然存在值的放在前面
        if ("RED".equalsIgnoreCase(colorType)) {
            return new Red();
        }
        if ("BLUE".equalsIgnoreCase(colorType)) {
            return new Blue();
        }
        if ("GREEN".equalsIgnoreCase(colorType)) {
            return new Green();
        }
        return null;
    }
}
