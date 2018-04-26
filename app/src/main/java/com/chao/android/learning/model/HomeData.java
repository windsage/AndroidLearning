package com.chao.android.learning.model;

import java.util.List;

public class HomeData {


    /**
     * offset : 20
     * over : false
     * pageCount : 62
     * size : 20
     * total : 1235
     */
    private int curPage;
    private List<HomeItem> datas;
    private int offset;
    private boolean over;
    private int pageCount;
    private int size;
    private int total;

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public List<HomeItem> getDatas() {
        return datas;
    }

    public void setDatas(List<HomeItem> datas) {
        this.datas = datas;
    }
}
