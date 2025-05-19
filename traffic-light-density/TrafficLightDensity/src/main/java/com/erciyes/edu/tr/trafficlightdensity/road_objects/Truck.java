package com.erciyes.edu.tr.trafficlightdensity.road_objects;
//	Vehicle’den türeyen ağır yük aracı.
public class Truck extends Vehicle {
    public class TrafficLight {
        // TrafficLight.java - Trafik ışığı sınıfı
import java.time.Duration;

        public class TrafficLight {
            private Direction direction;
            private LightPhase currentPhase;
            private Duration remainingTime;

            public TrafficLight(Direction direction) {
                this.direction = direction;
                this.currentPhase = LightPhase.RED; // Başlangıçta kırmızı
                this.remainingTime = currentPhase.getDuration();
            }

            /**
             * Trafik ışığını bir sonraki faza geçirir
             */
            public void switchToNextPhase() {
                currentPhase = currentPhase.next();
                remainingTime = currentPhase.getDuration();
            }

            /**
             * Kalan süreyi günceller
             * @param elapsed Geçen süre
             */
            public void updateRemainingTime(Duration elapsed) {
                remainingTime = remainingTime.minus(elapsed);
                if (remainingTime.isNegative() || remainingTime.isZero()) {
                    remainingTime = Duration.ZERO;
                }
            }

            // Getter metotları
            public Direction getDirection() {
                return direction;
            }

            public LightPhase getCurrentPhase() {
                return currentPhase;
            }

            public Duration getRemainingTime() {
                return remainingTime;
            }

            /**
             * Işığın yeşil olup olmadığını kontrol eder
             * @return Yeşil ise true, değilse false
             */
            public boolean isGreen() {
                return currentPhase == LightPhase.GREEN;
            }

            /**
             * Işığın kırmızı olup olmadığını kontrol eder
             * @return Kırmızı ise true, değilse false
             */
            public boolean isRed() {
                return currentPhase == LightPhase.RED;
            }
        }
    }

}
