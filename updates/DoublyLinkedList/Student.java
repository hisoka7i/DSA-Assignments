class Student{
  int rollNo;
  String name="";
  public Student(int rollNo, String name){
    this.rollNo=rollNo;
    this.name=name;
  }
  public String toString(){
    return "Name of the Student is "+name+" and his roll number is "+rollNo;
  }
}
