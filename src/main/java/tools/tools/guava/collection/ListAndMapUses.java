package tools.tools.guava.collection;

import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.base.Stopwatch;
import com.google.common.collect.*;
import com.google.common.io.Resources;
import tools.tools.guava.bean.Movie;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ListAndMapUses {

    /*
     1.创建普通List和Map
     2.创建不可变的List,Set，Map
     */
    public static void createListOrMap() {
        //正常
        List<String> s = Lists.newArrayList("a", "b", "c");
        List<String> t = Lists.transform(s, z -> z + "d");
        Lists.reverse(t);
        Maps.newHashMap();
        //创建不可变集合
        ImmutableList<String> imList = ImmutableList.copyOf(s);
        ImmutableList immutableList = ImmutableList.of("a", "b", "c");
        ImmutableMap immutableMap = ImmutableMap.copyOf(new HashMap<>());
        ImmutableMap immutableMap2 = ImmutableMap.of(1, "2", 2, "3");
        //返回一个 Map<String，List<>>
        Multimap<String, Integer> map = ArrayListMultimap.create();
        //MultiSet: 无序+可重复   count()方法获取单词的次数  增强了可读性+操作简单
        Multiset<String> set = HashMultiset.create();
        //Multimap: key-value  key可以重复
        Multimap<String, String> teachers = ArrayListMultimap.create();
        // BiMap: 双向Map(Bidirectional Map) 键与值都不能重复
        BiMap<String, String> biMap = HashBiMap.create();
        //Table: 双键的Map Map--> Table-->rowKey+columnKey+value  //和sql中的联合主键有点像
        Table<String, String, Integer> tables = HashBasedTable.create();

        String str = "1-2-3-4-  5-  6   ";
        List<String> list = Splitter.on("-").omitEmptyStrings().trimResults().splitToList(str);
    }

    public static void checkParam() {
        //6.检查参数
        //当count不符合>0则抛出异常
        int count = 0;
        Preconditions.checkArgument(count > 0, "must be positive: %s", count);

    }

    /*
       计算中间代码的运行时间
     */
    public static void checkCodeRunningTime() {
        Stopwatch stopwatch = Stopwatch.createStarted();
        System.out.println("do any things....");
        stopwatch.elapsed(TimeUnit.MILLISECONDS); //TimeUnit 可以指定时间输出精确到多少时间

    }

    public static void main(String[] args) {
        List<String> t = Lists.newArrayList("1", "2", "3");
        ImmutableList<String> imList = ImmutableList.copyOf(t);
        URL url = Resources.getResource("tconfig");
        System.out.println(url.getFile());
        System.out.println(url.getPath());

        BufferedReader bufferedReader = null;
        FileReader reader = null;
        try {
            reader = new FileReader(url.getPath());
            bufferedReader = new BufferedReader(new FileReader(url.getFile()));
            String str = null;
            while ((str=bufferedReader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }


}
