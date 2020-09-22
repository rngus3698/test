package com.test.test.domain;

import org.apache.ibatis.type.Alias;


@Alias("Menu")
public class Menu {

    private String menu;
    private int count;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
