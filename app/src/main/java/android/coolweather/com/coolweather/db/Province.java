package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/2/18.
 */

public class Province extends DataSupport {
    private int id;
    private String provincename;
    private  int provincecode;

    public void setId(int id) {
        this.id = id;
    }

    public void setProvincecode(int provincecode) {
        this.provincecode = provincecode;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }

    public int getId() {
        return id;
    }

    public int getProvincecode() {
        return provincecode;

    }

    public String getProvincename() {
        return provincename;
    }
}
