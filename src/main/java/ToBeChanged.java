public enum ToBeChanged {
    CROSS('X'),
    CIRCLE('O');

    private char value;

    ToBeChanged(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }
}
