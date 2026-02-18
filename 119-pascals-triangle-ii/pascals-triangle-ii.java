class Solution {
    public List<Integer> getRow(int row) {
        List<Integer> elements = new ArrayList<>();
        long value = 1;
        elements.add((int)value);

        for(int col = 1; col <= row ; col++){
            value *= (row-col+1);
            value /= col;
            elements.add((int)value);
        }

        return elements;
    }
}
