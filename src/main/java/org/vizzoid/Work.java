package org.vizzoid;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class Work {



    public Work() {

    }

    public static class Builder {

        private Border border;
        private long lastBorderChangeInDays;

        public Builder setBorder(Border border) {
            this.border = border;
            return this;
        }

        public Builder setLastBorderChange(LocalDateTime dateTime) {
            this.lastBorderChangeInDays = dateTime.get(ChronoField.EPOCH_DAY);
            return this;
        }
    }

}
