public class Player {
    private int ranking;
    private String name;
    private int age;

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
    public int getRanking() {
        return ranking;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public Player (int age, String name,int ranking){
        this.age=age;
        this.name=name;
        this.ranking=ranking;
    }

}
