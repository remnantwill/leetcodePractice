package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/student-attendance-record-i/
 */
public class StudentAttendanceRecordI551 {

    public boolean checkRecord(String s) {
        int absents = 0;
        int lates = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                absents++;
                if (absents > 1) {
                    return false;
                }
            }
            if (c == 'L') {
                lates++;
                if (lates > 2) {
                    return false;
                } else {
                    lates = 0;
                }
            }
        }
        return true;
    }

}
