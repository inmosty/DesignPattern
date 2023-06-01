package deepshallow;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat cat = new Cat();
        cat.setName("Tom");
        cat.setAge(new Age(2020, 10));

        Cat yo = cat.copy(); //깊은 복사  //cat; 낮은 수준의 복사
        yo.setName("Yo");
        yo.setAge(new Age(2021,2));
        log.info("{} {}", cat.getName(), cat.getAge().year);
        log.info("{} {}", yo.getName(), yo.getAge().year);

    }
}
