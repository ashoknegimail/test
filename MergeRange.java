import java.util.*;

import java.util.Comparator;

public class MergeRange{

     public static void main(String []args){
    	CalculateRange cr= new CalculateRange();
    	{

    	//Test input 1

        Range rt1= new Range(94133,94133);

        Range rt2= new Range(94200,94212); 

        Range rt3= new Range(94226,94399);

        ArrayList<Range> ar= new ArrayList<Range>();

        ar.add(rt2);

        ar.add(rt1);

        ar.add(rt3);

        //Test result 1

        System.out.println("Test result 1: " + cr.minNumberOfRanges(ar));

    	}
     

    	{

    	//Test input 2=

        Range rt1= new Range(94133,94133);

        Range rt2= new Range(94200,94299); 

        Range rt3= new Range(94226,94399);

        ArrayList<Range> ar= new ArrayList<Range>();

        ar.add(rt3);

        ar.add(rt1);

        ar.add(rt2);

        //Test result 2

        System.out.println("Test result 2: " + cr.minNumberOfRanges(ar));

    	}

        

    	{

        	//Test input 3

            Range rt1= new Range(94133,94134);

            Range rt2= new Range(94200,94299); 

            Range rt3= new Range(94226,94399);

            Range rt4= new Range(94387,94399);

            ArrayList<Range> ar= new ArrayList<Range>();

            ar.add(rt3);

            ar.add(rt1);

            ar.add(rt2);

            //Test result 3

            System.out.println("Test result 3: " + cr.minNumberOfRanges(ar));

        	}

     }

}

class Range

{

    int start;

    int end;

    Range(int st, int ed)

    {

        start=st;

        end=ed;

    }

}


class CalculateRange

{

	public int minNumberOfRanges(ArrayList<Range> ar)

	{

		Collections.sort(ar,new Comparator<Range>(){ 

            public int compare(Range i1,Range i2) 

            { 

                return i1.start-i2.start; 

            } 

            });

          

            Stack<Integer>st1= new Stack<Integer>();

            Stack<Integer>st2= new Stack<Integer>();

            

            for(Range r: ar)

            {

               if (!(st1.isEmpty()))

               {

            	   if(st2.peek()> r.start)

            	   {

            		   st2.pop();

            		   st2.push(r.end);

            		   continue;

            	   }       

               }

               st1.push(r.start);

               st2.push(r.end);

            }

           return st1.size();

	}

}

