package com.jcip.controller.chapter.three.ex.six;

public class ToBuild
{
    public boolean one;
    public boolean two;
    public boolean three;

    public boolean isProperlyBuilt()
    {
        return one && two && three;
    }
}