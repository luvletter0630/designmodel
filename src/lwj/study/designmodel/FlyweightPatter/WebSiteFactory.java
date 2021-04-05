package lwj.study.designmodel.FlyweightPatter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2021/4/2.
 */
public class WebSiteFactory {

    private Map<String, ConcreteWebsite> pool = new HashMap<String,ConcreteWebsite>();

    public Website getWebSiteCategory(String type){
        if (!pool.containsKey(type)){
            pool.put(type,new ConcreteWebsite(type));
        }
        return pool.get(type);
    }

    public int getWebSiteCount(){
        return pool.size();
    }
}
