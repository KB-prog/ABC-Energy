

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiero
 */
public class Date {
   private int day;
   private int month;
   private int year;
   
   public Date()
    {
        day=0;
        month=0;
        year=0;
    }
   
   public Date (Date other)
   {
       this.day=other.day;
       this.month=other.month;
       this.year=other.year;
   }
   public Date(int day, int month, int year)
   {
       if(day >=1)
       {
         if(month>=1 && month<=12)
         {
            if(year>=0)
            {
                this.day=day;
                this.month=month;
                this.year=year;   
             }
             else
             {
                System.out.println("That is the wrong year!! Must be greater than 0");  
             }
         }
         else
         {
           System.out.println("Thats the wrong month!!! The month must be from 1-12");
         }
        
      } 
       else
      {
        System.out.println("Thats the wrong day!! Must be greater then 0");
      }
       
       
    }
   
    public void setDay(int day)
     {
      if(day >=1)
      {
        this.day=day; 
      }
      else
      {
        System.out.println("Thats the wrong day!! Must be greater then 0");
      }
          
     }
   
    public void setMonth(int month)
    {
        if(month>=1 && month<=12)
        {
            this.month=month;
        }
         else
         {
           System.out.println("Thats the wrong month!!! The month must be from 1-12");
         }
    }
       
    public void setYear(int year)
    {
        if(year>=0)
        {
            this.year=year;
        }
        else
             {
              System.out.println("That is the wrong year!! Must be greater than 0");  
             }
    }
        
     public String monthAsString()
     {
         String month=null;
         switch(this.month)
         {
             case 1: month="Jan";
                 break;
             case 2: month="Feb";
                 break;
             case 3: month="Mar";
                 break;
             case 4: month="Apr";
                 break;
             case 5: month="May";
                 break;
             case 6: month="Jun";
                 break;
             case 7: month="Jul";
                 break;
             case 8: month="Aug";
                 break;
             case 9: month="Sep";
                 break;
             case 10: month="Oct";
                 break;
             case 11: month="Nov";
                 break;
             case 12: month="Dec";
                 break;
             default: month="no month";
                 break;
         }
           return month;
     }
     
    public void copy(Date other)
    {
       day=other.day;
       month=other.month;
       year=other.year;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.day;
        hash = 37 * hash + this.month;
        hash = 37 * hash + this.year;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Date other = (Date) obj;
        if (this.day != other.day) {
            return false;
        }
        if (this.month != other.month) {
            return false;
        }
        if (this.year != other.year) {
            return false;
        }
        return true;
    }
   @Override
     public String toString()
     {
         return "" + day + "/" + this.monthAsString() + "/" + year;
         
         
     }
}
