package com.denis.paluca.ankesa;

 class Model {

    private String url;
    private boolean folder;

    Model(String location, boolean folder) {

        this.url = location;
        this.folder = folder;
    }

     String getUrl() {
        return this.url;
    }

     boolean getFolder(){
        return this.folder;
    }

}
