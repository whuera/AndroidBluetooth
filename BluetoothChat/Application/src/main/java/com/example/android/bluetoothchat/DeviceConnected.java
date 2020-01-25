package com.example.android.bluetoothchat;

public class DeviceConnected {

    private String addresDevice;

    private String nameDevice;

    private String iDDevice;

    public String getAddresDevice() {
        return addresDevice;
    }

    public void setAddresDevice(String addresDevice) {
        this.addresDevice = addresDevice;
    }

    public String getNameDevice() {
        return nameDevice;
    }

    public void setNameDevice(String nameDevice) {
        this.nameDevice = nameDevice;
    }

    public String getiDDevice() {
        return iDDevice;
    }

    public void setiDDevice(String iDDevice) {
        this.iDDevice = iDDevice;
    }

    @Override
    public String toString() {
        return "DeviceConnected{" +
                "addresDevice='" + addresDevice + '\'' +
                ", nameDevice='" + nameDevice + '\'' +
                ", iDDevice='" + iDDevice + '\'' +
                '}';
    }
}
