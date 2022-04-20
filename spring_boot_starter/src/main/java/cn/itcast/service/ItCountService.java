package cn.itcast.service;

import java.util.HashMap;
import java.util.Map;

public class ItCountService {
    private Map<Integer,Integer> ipCountMap=new HashMap<Integer,Integer>();
    private Integer count;
    private    Integer ip;
//    public ItCountService(Mouse a){
//        a.play();
//    }

    public ItCountService(
    ){
        Mouse mouse = new Mouse();
        mouse.play();
    }
//    @Autowired
//    private HttpServletRequest httpServletRequest;

    public void count(){
        if(count==0){
            ipCountMap.put(ip,1);
            count++;
        }else ipCountMap.put(ip,ipCountMap.get(ip)+1);
    }
}
