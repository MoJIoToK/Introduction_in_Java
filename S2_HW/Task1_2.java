package S2_HW;

public class Task1_2 {

    public static void main(String[] args) {

        String str = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
        //System.out.println(str);
        
        //System.out.println(str.replace("{", "").replace("}", "")
        //.replace("'", "").replace(":", ",").replace(" ", ""));
        
        String[] request = str.replace("{", "").replace("}", "")
        .replace("'", "").replace(":", ",").replace(" ", "").split(",");
        
        String result = getQuery(request);
        System.out.println(result);
        
        // for (String item : request) {
        //     System.out.print(item + " ");
            
        // }
        // System.out.println(str.replace("{", "").replace("}", "").split(","));
   
    }


    public static String getQuery(String[] request)
    {
        StringBuilder s = new StringBuilder();
        for (int i = 1; i < request.length; i += 2) {
            if (!request[i].equals("null")){
                s.append(request[i - 1] + " = '" + request[i] + "' and ");
                //System.out.println(request[i]);
            }
        }
        
        s.delete(s.toString().length()-5,s.toString().length());
        return s.toString();
    }


}
