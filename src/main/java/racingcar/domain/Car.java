package racingcar.domain;

public class Car implements Comparable<Car> {
    private final String name;
    private int score;

    public Car(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addScore() {
        score++;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void printScore() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(" : ");
        for (int i = 0; i < score; i++) {
            sb.append("-");
        }
        System.out.println(sb);
    }

    @Override
    public int compareTo(Car o) {
        return o.score - this.score;
    }

}
