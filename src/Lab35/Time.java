package Lab35;

public class Time implements Comparable<Time> {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        int standardHour = hour % 12;
        if (standardHour == 0) {
            standardHour = 12;
        }
        String period = (hour < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", standardHour, minute, second, period);
    }

    public void add(Time other) {
        int totalSeconds = this.toSeconds() + other.toSeconds();
        totalSeconds %= 86400; 
        this.hour = (totalSeconds / 3600) % 24;
        this.minute = (totalSeconds % 3600) / 60;
        this.second = totalSeconds % 60;
    }

    private int toSeconds() {
        return (hour * 3600) + (minute * 60) + second;
    }

    @Override
    public int compareTo(Time other) {
        int thisTotalSeconds = this.toSeconds();
        int otherTotalSeconds = other.toSeconds();
        return Integer.compare(thisTotalSeconds, otherTotalSeconds);
    }

    public static void bubbleSort(Time[] times) {
        for (int i = 0; i < times.length - 1; i++) {
            for (int j = 0; j < times.length - 1 - i; j++) {
                if (times[j].compareTo(times[j + 1]) > 0) {
                    Time temp = times[j];
                    times[j] = times[j + 1];
                    times[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Time t1 = new Time(23, 5, 6);
        Time t2 = new Time(4, 24, 33);
        Time t3 = new Time(18, 45, 50);
        Time t4 = new Time(8, 12, 15);

        Time[] times = { t1, t2, t3, t4 };

        System.out.println("Before:");
        for (Time t : times) {
            System.out.println(t.toUniversal());
        }

        bubbleSort(times);

        System.out.println("\nAfter:");
        for (Time t : times) {
            System.out.println(t.toUniversal());
        }

    }
}
