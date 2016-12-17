package db;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aasksoft
 */
public class NewClass {
    public int main()
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        String dat=dateFormat.format(date);
        Date date1=new Date(dat);
        Date date2 = new Date("2016/04/03");
        int comparison = date2.compareTo(date1);
        return comparison;
    }
}
