package com.sda.post.office;
import java.util.List;
public enum PackageStatus {
    SENT("Your package was send", 1){
        @Override
        public PackageStatus nextStatus(){
            return  TRAVELLING;
        }
    },
    TRAVELLING("Your package is Travelling" , 2){
        @Override
        public PackageStatus nextStatus(){
            return  COURIER;
        }
    },
    COURIER("Courier take your Package", 3){
        @Override
        public PackageStatus nextStatus(){
            return  DELIVERED;
        }
    },
    DELIVERED("Your package will be soon", 4){
        @Override
        public PackageStatus nextStatus(){
            return  null;
        }
    },
    LOST("Sorry, your package was lost", 4){
        @Override
        public PackageStatus nextStatus(){
            return  null;
        }
    },
    RETURNED("Your package will be back", 5){
        @Override
        public PackageStatus nextStatus(){
            return  null;
        }
    };
    private  String description;
    private int statusCode;
    PackageStatus(String description, int statusCode) {
        this.description = description;
        this.statusCode = statusCode;
    }
    public String getDescription() {
        return description;
    }
    public int getStatusCode() {
        return statusCode;
    }
    public abstract PackageStatus nextStatus();
}