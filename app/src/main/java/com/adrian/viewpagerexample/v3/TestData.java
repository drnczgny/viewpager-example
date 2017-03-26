package com.adrian.viewpagerexample.v3;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by cadri on 2017. 03. 26..
 */

final class TestData {

    public static final List<DataModel> getDataModelList() {
        DataModel dataModel1 = new DataModel("ONE");
        DataModel dataModel2 = new DataModel("TWO");
        DataModel dataModel3 = new DataModel("THREE");
        List<DataModel> list = new ArrayList<>();
        list.add(dataModel1);
        list.add(dataModel2);
        list.add(dataModel3);
        return list;
    }

    public static final List<String> getTitleList() {
        String title1 = "title1";
        String title2 = "title2";
        String title3 = "title3";
        List<String> list = new ArrayList<>();
        list.add(title1);
        list.add(title2);
        list.add(title3);
        return list;
    }

}
