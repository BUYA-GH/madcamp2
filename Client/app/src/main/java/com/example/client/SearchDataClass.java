package com.example.client;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchDataClass {

    private List<Place> documents;

    public List<Place> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Place> documents) {
        this.documents = documents;
    }

    class Place
    {
        @SerializedName("place_name")
        private String place_name;
        @SerializedName("address_name")
        private String address_name;

        public String getAddress_name() {
            return address_name;
        }

        public void setAddress_name(String address_name) {
            this.address_name = address_name;
        }

        public String getPlace_name() {
            return place_name;
        }

        public void setPlace_name(String place_name) {
            this.place_name = place_name;
        }
    }

}
