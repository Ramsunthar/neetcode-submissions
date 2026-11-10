class Solution {
    public boolean isValidSudoku(char[][] board) {
        /**
        * since this shouldn't have duplicates, set is the best data structure for this one.
        * lets try with hash set, should have 27 hasSet for rows, coloums , and the squares (3x3).
        * validity check : board length is 9 and 1-9 with '.'.
        */


    Set<Character>[] rows = new HashSet[9];
    Set<Character>[] cols = new HashSet[9];
    Set<Character>[] boxes = new HashSet[9];
    for (int i = 0; i < 9; i++) {
        rows[i] = new HashSet<>();
        cols[i] = new HashSet<>();
        boxes[i] = new HashSet<>();
    }

    for (int r = 0; r < 9; r++) {
        for (int c = 0; c < 9; c++) {
            char val = board[r][c];
            if (val == '.') continue;

            int b = (r / 3) * 3 + (c / 3);
            if (!rows[r].add(val) || !cols[c].add(val) || !boxes[b].add(val)) {
                return false;
            }
        }
    }
    return true;

    }
}
