package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

    public class Milestones {
        private String name;
        private String references;
        private String parent;
        private String description;
        private String startDate;
        private String endDate;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Milestones milestones = (Milestones) o;
            return true;
        }
    }

