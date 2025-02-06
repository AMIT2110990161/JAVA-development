package packagesAndEncapsulation.Package2;

import packagesAndEncapsulation.package1.Teacher;

public class TeacherFriend extends Teacher {
    public static void main(String[] args) {
        Teacher s = new Teacher();
        TeacherFriend tf = new TeacherFriend();
        System.out.println(s.schoolName);
        // System.out.println(s.id); The field Teacher.id is not visible because its private 
        // System.out.println(s.numberOfSubject); only visibale in same pakage only
        System.out.println(tf.name);
    }
}
