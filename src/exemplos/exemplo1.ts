class Person {
  name: String;
  age: Number;
  constructor(name: String, age: Number) {
    this.name = name;
    this.age = age;
  }
}

class Student extends Person {
  studentID: String;

  constructor(name: String, age: Number, studentID: String) {
    super(name, age);
    this.studentID = studentID;
  }

  print(): void {
    console.log(
      `Student name: ${this.name}\nAge: ${this.age}\nStudent ID: ${this.studentID}`
    );
  }
}

class Teacher extends Person {
  teacherID: String;
  classname: String;

  constructor(name: String, age: Number, teacherID: String, classname: String) {
    super(name, age);
    this.teacherID = teacherID;
    this.classname = classname;
  }

  print(): void {
    console.log(
      `Teacher name: ${this.name}\nAge: ${this.age}\nTeacher ID: ${this.teacherID}\nClassname: ${this.classname}`
    );
  }
}

const student: Student = new Student("Vitor Veras", 22, "20151045050287");
const teacher: Teacher = new Teacher(
  "Olivio indigena",
  99,
  "0000000000",
  "tupi guarani"
);
student.print();
console.log("\n");
teacher.print();
