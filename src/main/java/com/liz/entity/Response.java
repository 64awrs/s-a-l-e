package com.liz.entity;

//泛型
public class Response<T> {
    private T  list;
    private int total=50;

    public Response(T list, int total) {
        this.list = list;
        this.total = total;
    }

    public T getList() {
        return list;
    }

    public void setList(T list) {
        this.list = list;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
