
public class Student1 {
  private int id;
  private String name;
  private int age;
  private String address;
  private int score;
  
  Student1(){
      
  }
  Student1(int id, int age, int score, String name, String address){
      this.id = id;
      this.age = age;
      this.score = score;
      this.name = name;
      this.address = address;
  }
  public Student1(int id, int age, int score){
      this.id = id;
      this.age = age;
      this.score = score;
  }
  
  public Student1(String name, String address){
      this.name = name;
      this.address = address;
  }
  public void SeltId(int id){
      this.id = id;
  }
  public void SeltAge(int age){
      this.age = age;
  }
  public void SeltScore(int score){
      this.score = score;
  }
  public int getId(){
      return id;
  }
  public int getAge(){
      return age;
  }
  public int getScore(){
      return score;
  }
  
  public void setName(String name){
      this.name = name;
  }
  public void setAddress(String address){
      this.address = address;
  }
  
  public String getName(){
      return name;
  }
  public void setAge(int age){
      this.age = age;
  }
  public void setId( int id){
      this.id = id;
  }
  
  public String getAddress(){
      return address;
  }
  
}
