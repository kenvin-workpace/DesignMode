package com.whz.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevin on 2018/4/25 23:10
 * <p>
 * 描述：
 */
public class BusinessReport {
    List<Staff> mStaff = new ArrayList<>();

    public BusinessReport() {
        mStaff.add(new Manager("王经理"));
        mStaff.add(new Engineer("工程师-1"));
        mStaff.add(new Engineer("工程师-2"));
        mStaff.add(new Engineer("工程师-3"));
        mStaff.add(new Engineer("工程师-4"));
        mStaff.add(new Engineer("工程师-5"));
    }

    public void showReport(Visitor visitor) {
        for (Staff staff : mStaff) {
            staff.accept(visitor);
        }
    }
}
