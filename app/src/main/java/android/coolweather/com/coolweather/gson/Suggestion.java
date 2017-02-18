package android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/2/18.
 */
/*SerializedName:使用Gson解析的时候就会将n对应的值赋值到userName属性上，
同样的如果我们要将User生成json字符串使用Gson生成的时候也会将userName的名字生成n。
这样就解决了java对象里属性名跟json里字段名不匹配的情况了*/
public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;
    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class  CarWash{
        @SerializedName("txt")
        public String info;
    }
    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
