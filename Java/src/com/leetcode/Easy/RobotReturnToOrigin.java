package com.leetcode.Easy;

// 657. Robot Return to Origin
public class RobotReturnToOrigin {

    public boolean judgeCircle(String moves) {
        int numOfU = 0, numOfD = 0, numOfL = 0, numOfR = 0;
        for (char mv : moves.toCharArray()) {
            if (mv == 'U')
                ++numOfU;
            else if (mv == 'D')
                ++numOfD;
            else if (mv == 'L')
                ++numOfL;
            else
                ++numOfR;
        }

        return numOfU - numOfD == 0 && numOfL - numOfR == 0;
    }
}
