


/*

Given a list of dates, sort them in ascending order, Dates are described below

Each date is in the form dd mmm yyyy where  
dd has 0-31
mmm has Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec
yyyy is four digits

For Example dates = [’01 Mar 2017’,’03 Feb 2017’,’15 Jan 1998’] would sort to 
[’15 Jan 1998’,’03 Feb 2017’,’01 Mar 2017’];


input =
20 Oct  2052
06 Jun 1933
26 May 1960
20 Sep 1958
16 Mar 2068
25 May 1912
16 Dec 2018
26 Dec 2061
04 Nov 2030
28 Jul 1963
output =
25 May 1912
06 Jun 1933
20 Sep 1958
26 May 1960
28 Jul 1963
16 Dec 2018
04 Nov 2030
20 Oct 2052
26 Dec 2061
16 Mar 2068





*/






import java.util.*;
class A
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        Map<String,String> m = new HashMap<>();
        m.put("Jan","01");
        m.put("Feb","02");
        m.put("Mar","03");
        m.put("Apr","04");
        m.put("May","05");
        m.put("Jun","06");
        m.put("Jul","07");
        m.put("Aug","08");
        m.put("Sep","09");
        m.put("Oct","10");
        m.put("Nov","11");
        m.put("Dec","12");
        Map<String,String> m1 = new HashMap<>();
        m1.put("01","Jan");
        m1.put("02","Feb");
        m1.put("03","Mar");
        m1.put("04","Apr");
        m1.put("05","May");
        m1.put("06","Jun");
        m1.put("07","Jul");
        m1.put("08","Aug");
        m1.put("09","Sep");
        m1.put("10","Oct");
        m1.put("11","Nov");
        m1.put("12","Dec");
        List<String> l = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String a = sc.next();
            String b = sc.next();
            String c = sc.next();
            StringBuilder sb = new StringBuilder();
            sb.append(c);
            sb.append(m.get(b));
            sb.append(a);
            l.add(sb.toString());
        }
        Collections.sort(l);
        for(String str:l)
        {
            System.out.print(str.substring(6,8)+" ");
            System.out.print(m1.get(str.substring(4,6))+" ");
            System.out.print(str.substring(0,4));
            System.out.println();
        }
    }
}
