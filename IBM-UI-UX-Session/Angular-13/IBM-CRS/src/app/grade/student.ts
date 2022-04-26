export class Student {
     studentId: number;
     courseId: number;
     grade: string;

    constructor(studentId: number, courseId: number, grade: string) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.grade = grade;
    }
}
