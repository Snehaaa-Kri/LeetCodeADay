public class Q2678NumberOfSeniorCitizens {
    public static int countSeniors(String[] details) {
        int count =0;

        for(int i=0; i<details.length; i++){
            // String person = details[i];

            // StringBuilder ageStr = new StringBuilder("");
            // ageStr.append(person.charAt(11));
            // ageStr.append(person.charAt(12)); 

            // int age = Integer.parseInt(ageStr.toString());


            String str = details[i].substring(11,13);
            int age = Integer.parseInt(str);


            if(age > 60){
                count++;
            } 
        }
        return count;
    }
    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};

        System.out.println(countSeniors(details));
    }
}
