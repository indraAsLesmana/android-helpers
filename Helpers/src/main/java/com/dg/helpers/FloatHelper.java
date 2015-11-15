package com.dg.helpers;

/**
 * Created by Daniel Cohen Gindi (danielgindi@gmail.com)
 */
public class FloatHelper
{
    public static Float withObject(Object value)
    {
        if (value == null) return null;
        else if (value instanceof Float) return (Float)value;
        else if (value instanceof Integer) return (float) (Integer) value;
        else if (value instanceof Short) return (float) (Short) value;
        else return null;
    }

    public static float[] toArray(Float[] inArray)
    {
        float[] array = new float[inArray.length];
        for (int i = 0, len = inArray.length; i < len; i++)
        {
            Float value = inArray[i];

            if (value != null)
            {
                array[i] = value;
            }
        }
        return array;
    }
}
