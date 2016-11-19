package com.oluwatimilehin.tourlagos;

/**
 * Created by timad on 19/11/2016.
 */
public class Information {

    private static final int NO_IMAGE_PROVIDED = -1;
    private static final String NO_NUMBER_PROVIDED = "NULL";

    private String mName;
    private String mAddress;
    private String mPhoneNumber = NO_NUMBER_PROVIDED;
    private int mImgResourceId = NO_IMAGE_PROVIDED;

    public Information(String name, String address, String phoneNumber,  int imgResourceId){

        mName = name;
        mAddress = address;
        mPhoneNumber = phoneNumber;
        mImgResourceId = imgResourceId;
    }

    public Information(String name, String address, int imgResourceId){
        mName = name;
        mAddress = address;
        mImgResourceId = imgResourceId;
    }

    public Information(String name, String address, String phoneNumber){
        mName = name;
        mAddress = address;
        mPhoneNumber = phoneNumber;
    }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public int getImgResourceId() {
        return mImgResourceId;
    }

    public boolean hasImage(){
        return mImgResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasPhoneNumber(){

        return mPhoneNumber != NO_NUMBER_PROVIDED;
    }



}
