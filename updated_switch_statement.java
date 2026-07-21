public class updated_switch_statement {
    public static void main(String[] args) {
        String month="march";
        String result="";

        result=switch(month)
        {
            case"febraury"->
               "number of days is 28";
            
                case "march","may","january","july","august","october","december"->
               "march:number of days is 31";
                
                default->
                "number of days is 30";
        };
        System.out.println(result);
    }
}
