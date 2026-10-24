class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        // int[]month = {31,28,31,30,31,30,31,31,30,31,30,31};
        String start = arriveAlice.compareTo(arriveBob)>0?arriveAlice:arriveBob;
        String end = leaveAlice.compareTo(leaveBob)>0?leaveBob:leaveAlice;
        return Math.max(0,day(end)-day(start)+1);

        
    }
    public int day(String str){
        int days = 0;
        int month = Integer.parseInt(str.substring(0,2));
        int[]dates = {31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=0;i<month-1;i++){
            days+= dates[i];
        }
        days+= Integer.parseInt(str.substring(3));
        return days;
    }
}