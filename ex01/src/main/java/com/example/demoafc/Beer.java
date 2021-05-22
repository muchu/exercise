package com.example.demoafc;

public class Beer {
    private String band;
    private String year_of_beer;
    private String color;
    private Double ml;


    Beer(String a,String b, String c,Double d ){
        band = a;
        year_of_beer = b;
        color = c;
        ml = d ;
    }
    Beer(){
     band = "tianren";
     year_of_beer = "this year";
     ml = 500.00;
    }


    public void setBand(String a) {
        band = a ;
    }

    public void  setYear_of_beer(String b) {
        year_of_beer = b ;
    }

    public void setColor(String a){
      color = a ;
    }



    @Override
    public String toString() {
        return "Beer{" +
                "band='" + band + '\'' +
                ", year_of_beer='" + year_of_beer + '\'' +
                ", color='" + color + '\'' +
                ", ml=" + ml +
                '}';
    }
}
