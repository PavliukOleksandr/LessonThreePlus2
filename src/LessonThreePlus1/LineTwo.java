package LessonThreePlus1;

public class LineTwo {
    char[] arrayNum2 = new char[8];
    public void Line2() {
        for (int i = 1; i < arrayNum2.length; i+=2) {
            arrayNum2[i] = '*';
        }
        for (int i = 0; i < arrayNum2.length; i+=2) {
            arrayNum2[i] = ' ';
        }
        System.out.println(arrayNum2);
    }
}
