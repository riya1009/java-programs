public class string1 {
    public static void main(String[] args){
        String name = "Riddhimma";
        String name1 = name.toLowerCase();
        System.out.println(name1);
        String name2 = name.toUpperCase();
        System.out.println(name2);
        int length = name.length();
        System.out.println(length);
        String name3 = name.substring(3);
        System.out.println(name3);
        String name4 = name.substring(3,7);
        System.out.println(name4);
        System.out.println(name.replace('i','p'));
        System.out.println(name.replace("idd","gff"));
        System.out.println(name.startsWith("Ri"));
        System.out.println(name.endsWith("ma"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("id"));
        System.out.println(name.indexOf('i',3));
        System.out.println(name.lastIndexOf('i'));
        System.out.println(name.lastIndexOf('i',3));

    }
    
}
