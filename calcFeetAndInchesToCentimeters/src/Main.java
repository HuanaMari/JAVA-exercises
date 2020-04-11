public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDuarationString(3945L));
    }

    private static String getDurationString (long minutes,long seconds) {

if(minutes < 0 || seconds<0 || seconds>59){
    return "Invalid value";
        }
        long hours = minutes /60;
        long remainingMin = minutes%60;
        String hoursString = hours + "h";
        if(hours <10){
            hoursString = "0"+hoursString;
        }

        String minutesString = remainingMin + "m";
        if(remainingMin <10){
            minutesString = "0"+ minutesString;
        }
        String secondsString = seconds + "s";
        if(minutes <10){
            secondsString = "0"+secondsString;
        }
        return hoursString + minutesString + secondsString ;
    }

    private static String getDuarationString(long seconds){
        if(seconds < 0){
            return "Invalid value";
        }
        long minutes =  seconds /60;
        long remainingSEc = seconds % 60;
        return getDurationString(minutes,remainingSEc);
    }
}