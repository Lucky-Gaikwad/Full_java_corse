class VarArgs {
    public static void main(String[] args) {
        System.out.println(concatenate("Lucky"));
        System.out.println(concatenate("Lucky","Gaikwad"));
        System.out.println(concatenate("Hello", "this", "my", "varArgs", "challenge","completed"));


    }
    public static String concatenate(String... strs){
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }

}
