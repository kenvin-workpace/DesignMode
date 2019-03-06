package com.whz.factory.io;

/**
 * Created by kevin on 2018/4/17 22:20
 * <p>
 * 描述：
 */
public class FileHandler extends IOHandler {
    @Override
    public void add(int id) {

    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean update(int id) {
        return false;
    }

    @Override
    public String query(int id) {
        return "FileHandler";
    }
}
