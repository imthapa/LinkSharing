package com.ttnd.linksharing.co

/**
 * Created by ishwar on 7/5/17.
 */
//todo GORM2 Q1a) Add String q, Integer max,Integer offset,String order, String sort parameter in searchCO which will be used for text search
class SearchCO {

    String q
    Integer max
    Integer offset
    String order
    String sort
    long id


    @Override
    public String toString() {
        return "SearchCO{" +
                "q='" + q + '\'' +
                ", max=" + max +
                ", offset=" + offset +
                ", order='" + order + '\'' +
                ", sort='" + sort + '\'' +
                ", id=" + id +
                '}';
    }
}
