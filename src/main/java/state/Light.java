package state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Light {
    protected LightState lightState;

    public Light() {
        lightState = offState;
    }

    public void on() {
        lightState.on();
    }

    public void off() {
        lightState.off();
    }

    private LightState offState = new LightState() {
        @Override
        public void on() {
            log.info("Light on");
            lightState = onState;
        }

        @Override
        public void off() {
            log.info("Nothing");
        }
    };

    private LightState onState = new LightState() {
        @Override
        public void on() {
            log.info("Nothing");
        }

        @Override
        public void off() {
            log.info("Light is off");
            lightState = offState;
        }
    };
}
