package cn.magicgone.learning.leetcode.problem278;

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return firstBadVersion(1, n);
    }

    private int firstBadVersion(int start, int end) {
        int length = end - start;
        if (length == 0) {
            return isBadVersion(start) ? start : -1;
        }

        int middle = start + (end - start) / 2;
        if (isBadVersion(middle)) {
            return firstBadVersion(start, middle);
        } else {
            return firstBadVersion(middle + 1, end);
        }
    }
}

class VersionControl {
    private int firstBadVersion;

    protected boolean isBadVersion(int n) {
        return n >= firstBadVersion;
    }
}