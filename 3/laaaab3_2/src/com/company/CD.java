package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class CD {
    private int inventorNumber;
    private String albumName;
    private int diskVolume;
    private String Type;
    private LocalDate localDate;

    public CD(int inventorNumber, String albumName, int diskVolume, String type, LocalDate localDate) {
        this.inventorNumber = inventorNumber;
        this.albumName = albumName;
        this.diskVolume = diskVolume;
        Type = type;
        this.localDate = localDate;
    }

    public void setDiskVolume(int diskVolume) {
        this.diskVolume = diskVolume;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void toste(){
        System.out.println("CD{" +
                "Інвентарний номер = " + inventorNumber +
                ", назва альбому = '" + albumName + '\'' +
                ", об'єм диску = " + diskVolume +
                ", тип = '" + Type + '\'' +
                ", Дата запису = " + localDate +
                '}');
    }

    @Override
    public String toString() {
        return "CD{" +
                "Інвентарний номер = " + inventorNumber +
                ", назва альбому = '" + albumName + '\'' +
                ", об'єм диску = " + diskVolume +
                ", тип = '" + Type + '\'' +
                ", Дата запису = " + localDate +
                '}';
    }

    public String toSave() {
        return inventorNumber + " "+
                albumName +" "+
                diskVolume+ " "+
                Type+" "+
                localDate + "\n";
    }
}