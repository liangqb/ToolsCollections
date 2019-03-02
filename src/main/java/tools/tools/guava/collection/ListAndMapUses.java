package tools.tools.guava.collection;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import tools.tools.guava.bean.Movie;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class ListAndMapUses {

    //创建List 写法 转换以及翻转list;
    public static void createListOrMap (){
        //list
        List<String> s = Lists.newArrayList("a","b","c");
        List<String> t = Lists.transform(s,z->z+"d");
        Lists.reverse(t);
        //map
        Maps.newHashMap();
    }


}
