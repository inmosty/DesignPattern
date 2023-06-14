package flyweight;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.TreeMap;

@Slf4j
public class FlyweightFactory {
    Map<String,Flyweight> pool;

    public FlyweightFactory() {
        this.pool = new TreeMap<>();
    }

    public Flyweight getFlyweight(String key){
        Flyweight flyweight = pool.get(key);

        if(flyweight == null){
            flyweight = new Flyweight(key);
            pool.put(key, flyweight);
            log.info("Flyweight created");
        }else{
            log.info("Flyweight already exists");
        }
        return flyweight;
    }

}
