package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/2/18.
 */

public class County extends DataSupport{
    private int id;
    private String countyname;
    private String weatherid;
    private int cityid;

    public int getId() {
        return id;
    }

    public int getCityid() {
        return cityid;
    }

    public String getCountyname() {
        return countyname;
    }

    public String getWeatherid() {
        return weatherid;
    }

    public void setCountyname(String countyname) {
        this.countyname = countyname;
    }

    public void setCityid(int cityid) {
        this.cityid = cityid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWeatherid(String weatherid) {
        this.weatherid = weatherid;
    }

}
