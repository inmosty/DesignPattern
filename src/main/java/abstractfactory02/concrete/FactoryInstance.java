package abstractfactory02.concrete;

import abstractfactory02.abst.GuiFac;
import abstractfactory02.linux.LinuxGuiFac;
import abstractfactory02.mac.MacGuiFac;
import abstractfactory02.win.WinGuiFac;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FactoryInstance {
    public static GuiFac getGuiFac(){
        String os = System.getProperty("os.name").toLowerCase();
        log.info("os={}", os);
        switch (os.contains("mac") ? "mac os x" : os.contains("win") ? "windows" : "linux") {
            case "mac os x":
                return new MacGuiFac();
            case "linux":
                return new LinuxGuiFac();
            case "windows":
                return new WinGuiFac();
        }
        return null;
    }
}
