class Solution {
    public String getHint(String secret, String guess) {
        int count[] = new int[10];
        int bull = 0;
        int sum_secret_not_in_guess = 0;
        int cow = 0;

        for(int i=0; i<secret.length(); i++){
            char ch_sec = secret.charAt(i);
            char ch_guess = guess.charAt(i);
            if(ch_sec == ch_guess){
                bull++;
            }else{
                count[Integer.parseInt(String.valueOf(ch_sec))]++;
                count[Integer.parseInt(String.valueOf(ch_guess))]--;
            }
        }

        for(int x: count){
            if(x > 0){
                sum_secret_not_in_guess += x;
            }
        }

        cow = secret.length() - bull - sum_secret_not_in_guess;
        return ""+bull+"A"+cow+"B";
    }
}