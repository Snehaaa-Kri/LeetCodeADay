public class Q2114MaxNumOfWords {

    public static int MaximumNumberOfWordsFoundInSentences(String[] sentences){
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<sentences.length;i++){

            String stringSentence = sentences[i];
            int spaceCount =0;

            for (int j=0; j<stringSentence.length();j++){
                if (stringSentence.charAt(j) == ' '){
                    spaceCount++;
                }
            }
            if(spaceCount>largest){
                largest = spaceCount;
            }   
        }
        return largest+1;
    }
    public static void main(String[] args) {
        String sentences[] = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        // String sentences[] = {"please wait", "continue to fight", "continue to win"};

        System.out.println(MaximumNumberOfWordsFoundInSentences(sentences));

    }
}