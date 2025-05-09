public class oops1 {
    public static class Student{
        String Name;
        int Roll_no;
        double Fees;

        Student(String Name,int Roll_no,double Fees){
            this.Name=Name;
            this.Roll_no=Roll_no;
            this.Fees=Fees;
        }
         void info(){
            System.out.println(this.Name);
            System.out.println(this.Fees);
            System.out.println(this.Roll_no);
        }
      
    }
    public static void main(String[] args) {
        Student s1=new Student("arun",21,2000);
        s1.info();
    }
}
