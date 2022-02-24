package Practice;

public class Heroes {

    public String name;
    public String sex;
    public String shout;
    public String power;

    public Heroes(String name, String sex, String power){
      this.name = name;
      this.sex = sex;
      this.power = power;
    }


    public void setShout(String shout) {
        this.shout = shout;
    }

    public String getName() {
        return name;
    }

    public String getPower() {
        return power;
    }

    public String getSex() {
        return sex;
    }

    public String getShout() {
        return shout;
    }
    public String present(){
        return ("I am " + name + ", a " + sex + "-" + shout + " with " + power + " power !");
    }
}
