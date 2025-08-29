class Ajay{
    public static void count(String str){
        char original[]=str.toCharArray();
        int LowCount=0;
        int UppCount=0;

        for(int i=0;i<original.length;i++){
            if(original[i]>=97 && original[i]<=122){
                LowCount++;
            }
            else{
                UppCount++;
            }
        }
         if(LowCount>UppCount){
                System.out.println(new String(original).toLowerCase());
            }
        else{
                System.out.println(new String(original).toUpperCase());
        }

    }
    public static void main(String[] args) {
        String str="my Name IS AJAY ChutiYA";
        count(str);

    }
}