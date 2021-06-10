package com.company;

public class Enterprise {
    private final String Month;
    private int RealOutput;
    private int PlaneOutput;

    public int GetRrealOutput(){
        return RealOutput;
    }

    public int GetPlaneOutput(){
        return PlaneOutput;
    }

    Enterprise(Month month, int realOtput, int planeOutput){

        Month = month.getMonthToUA();
        RealOutput = realOtput;
        PlaneOutput = planeOutput;
    }

    public void ToString(){
        System.out.println("| " + Month + " | " +RealOutput+ " | "+ PlaneOutput+ " | ");
    }
}