public class LeapYear {
    int enterTheYear;
    boolean leapYear;

    public LeapYear(int enterTheYear, boolean leapYear){
        this.enterTheYear = enterTheYear;
        this.leapYear = false;
    }

    public void checkLeapYear(){
        if (enterTheYear % 4 == 0){
            if (enterTheYear % 100 == 0){
                if (enterTheYear % 400 ==0)
                    leapYear = true;
                else
                    leapYear = false;
            }
            else
                leapYear = true;
        }
        else
            leapYear = false;

        if (leapYear)
            System.out.println(enterTheYear + " to rok przestepny");
        else
            System.out.println(enterTheYear + " to nie jest rok przestepny");
    }


}
