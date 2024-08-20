package Lesson6;

public class Park {
    String name;
    String workSeason; //сезон работы (all season. winter, summer, autumn, spring)
    int numberAttractions;

    public Park(String name, int numberAttractions, String workSeason) {
        this.name = name;
        this.numberAttractions = numberAttractions;
        this.workSeason = workSeason;
    }

    public class infoAttraction {
        String workTime;
        int price;
        int ageRestriction; //возрастное ограничение
        int capacity; //вместимость человек

        public infoAttraction(String workTime, int price, int ageRestriction, int capacity) {
            this.workTime = workTime;
            this.price = price;
            this.ageRestriction = ageRestriction;
            this.capacity = capacity;
        }

        public String getWorkTime(){
            return workTime;
        }
        public int getPrice(){
            return price;
        }
        public int getAgeRestriction(){
            return ageRestriction;
        }
        public int getCapacity(){
            return capacity;
        }
        public String getName(){
            return name;
        }
        public String getWorkSeason(){
            return workSeason;
        }
        public int getNumberAttractions(){
            return numberAttractions;
        }
    }
}


