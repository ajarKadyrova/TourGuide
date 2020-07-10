package com.example.android.tourguide;

public class Information {

    private String mPlaceName;
    private String mWorkingTime;
    private String mInformation;
    private String mAddress;
    private String mTelephoneNumber;
    private String mCuisine;
    private int mPictureId;

    public Information(String nameOfPlace, String typeOfPlace, String cuisine, String workTime, String address,
                       String phone, int pictureId){
        mPlaceName = nameOfPlace;
        mInformation = typeOfPlace;
        mCuisine = cuisine;
        mWorkingTime = workTime;
        mAddress = address;
        mTelephoneNumber = phone;
        mPictureId = pictureId;
    }

    public Information(String nameOfPlace, String information, String workTime, String address, int pictureId){
        mPlaceName = nameOfPlace;
        mInformation = information;
        mWorkingTime = workTime;
        mAddress = address;
        mPictureId = pictureId;
    }

    public String getPlaceName(){
        return mPlaceName;
    }

    public String getPlaceInformation(){ return mInformation; }

    public String getCuisineTypes(){ return "Cuisine: " + mCuisine; }

    public boolean hasCuisineTypes(){
        if(mCuisine != null){
            return true;
        }
        else return false;
    }

    public String getWorkingTime(){ return "Working hours: " + mWorkingTime; }

    public String getAddress(){ return mAddress; }

    public String getTelephoneNumber(){ return "+996 " + mTelephoneNumber; }

    public boolean hasPhoneNumber(){
        if(mTelephoneNumber != null){
            return true;
        }
        else return false;
    }

    public int getPictureId(){ return mPictureId; }
}
