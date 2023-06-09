
public class Student {
    private int id;
    private String name;
    // ham tao mac dinh/ ham tao khong co tham so
    Student(){
        
    }
    // ham tao co tham so
    Student(int id, String name){
        this.id = id;
        this.name = name;
        
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(String name) {
        this.name = name;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setId(int id){
        if(id >= 100 && id <= 999)
        this.id = id;
        else
            System.out.println("ID khong hơp le! ");
    }
    public void setName(String ten){
        this.name = ten;
    }
    @Override
    public String toString(){
       // return id+" | "+ name;
        return String.format("%3d | %20s", id, name);
    }
    
}
