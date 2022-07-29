package LessonThreePlus1;

public class LineOne {
    char[] arrayNum1 = new char[8];
    public void Line1() {
        for (int i = 0; i < arrayNum1.length; i+=2) {
            arrayNum1[i] = '*';
        }
        for (int i = 1; i < arrayNum1.length; i+=2) {
            arrayNum1[i] = ' ';
        }
        System.out.println(arrayNum1);
    }
}
