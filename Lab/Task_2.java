public class Task_2 {
    
    public static void main (String[] args){
        String str1 = "Farhan";
        String str2 = "Intesar";

        //combining into a single formatted full name
        String name = str1 +" "+ str2 ;
        System.out.println(name);

       //generate product code joining the product name and id
       String productId = "10259521";
       String productName = "CupCake";
       String pruductCode =productName.concat(productId);
       System.out.println("Product Code : " + pruductCode);

       //extract he username before @ from an email adress
       String emailId = "farhanintesar0099@gmail.com" ;
       int indexOf = emailId.indexOf("@");
       String userBefore = emailId.substring(0, indexOf);
       System.out.println("User name before @ : " + userBefore);

       //A chat app must show the total number of character in a users massege.
       String userMsg = "Hello! This is November second.";
       int numOfChar = userMsg.length();
       System.out.println("Total number of character : "+ numOfChar);

       //converting to uppercase
       String upperCase = userMsg.toUpperCase();
       System.out.println("Upper case: " + upperCase);

       //converting to Lowercase
       String lowerCase = userMsg.toLowerCase();
       System.out.println("Lower case: " + lowerCase);


       //replace a specific word is a sentence
       String replaceNovember = userMsg.replace("November" , "December");
       System.out.println("Replaced User Msg : " + replaceNovember);

        
    }


}
