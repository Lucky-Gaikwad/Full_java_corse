class ArrayToString {
    public static void main(String[] args) {
        String [] arr = new String[] {"this", "is", "the",
                "best", "and", "most", "detailed",
                "course", "on", "java."};
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
