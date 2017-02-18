package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/2/18.
 */

public class City extends DataSupport{
    private int id;
    private String cityname;
    private int  citycode;
    private int provinceid;

    public void setId(int id) {
        this.id = id;
    }

    public void setCitycode(int citycode) {
        this.citycode = citycode;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public void setProvinceid(int provinceid) {
        this.provinceid = provinceid;
    }

    public int getCitycode() {
        return citycode;
    }

    public int getId() {
        return id;
    }

    public int getProvinceid() {
        return provinceid;
    }

    public String getCityname() {
        return cityname;
    }
}
