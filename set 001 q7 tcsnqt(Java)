public static String customCaesarCipher(int key, String message) {
    String ualpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String res="";
    String digit="0123456789";
    int pos=0,temp=0;
    if(key<0){
        return "INVALID INPUT";
    }else{
        for(int i=0;i<message.length();i++){
            temp=key;
            if(Character.isUpperCase(message.charAt(i))){
                temp%=26;
                pos=ualpha.indexOf(message.charAt(i));
                pos+=temp;
                if(pos>=26){
                    pos-=26;
                }
                res+=ualpha.charAt(pos);
            }else if(Character.isLowerCase(message.charAt(i))){
                temp%=26;
                pos=ualpha.indexOf(Character.toUpperCase(message.charAt(i)));
                pos+=temp;
                if(pos>=26){
                    pos-=26;
                }
                res+=Character.toLowerCase(ualpha.charAt(pos));
            }else if(Character.isDigit(message.charAt(i))){
                temp%=10;
                pos=digit.indexOf(message.charAt(i));
                pos+=temp;
                if(pos>=10){
                    pos-=10;
                }
                res+=digit.charAt(pos);
            }else{
                res+=message.charAt(i);
            }
        }
    }
    return res;

}
