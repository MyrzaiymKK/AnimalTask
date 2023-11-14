public abstract class Animal {
    int weight;
    int age;
    String genter;
    String nickName;
    public Animal(int weight, int age, String genter, String nickName) {
        this.weight = weight;
        this.age = age;
        this.genter = genter;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", age=" + age +
                ", genter='" + genter + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
