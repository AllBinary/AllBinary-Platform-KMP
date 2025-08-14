
        /*
                * 
                *  AllBinary Open License Version 1
                *  Copyright (c) 2011 AllBinary
                *  
                *  By agreeing to this license you and any business entity you represent are
                *  legally bound to the AllBinary Open License Version 1 legal agreement.
                *  
                *  You may obtain the AllBinary Open License Version 1 legal agreement from
                *  AllBinary or the root directory of AllBinary's AllBinary Platform repository.
                *  
                *  Created By: Travis Berthelot  
        */
        
        /* Generated Code Do Not Modify */
        package org.allbinary.time




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Calendar

open public class TimeUtil
            : Object
         {
        

        companion object {
            
    private val instance: TimeUtil = TimeUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TimeUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


    private val calendar: Calendar = Calendar.getInstance()!!
            

        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun setCalendar(calendar: Calendar, yearString: String, monthString: String, dayString: String, hourString: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var calendar = calendar


                    var yearString = yearString


                    var monthString = monthString


                    var dayString = dayString


                    var hourString = hourString

    var year: Int = Integer(yearString).
                            toInt()!!
            


    var month: Int = Integer(monthString).
                            toInt()!!
            


    var day: Int = Integer(dayString).
                            toInt()!!
            


    var hour: Int = Integer(hourString).
                            toInt()!!
            

calendar.set(year, month, day, hour, 0)
}


open fun setCalendar(calendar: Calendar, yearString: String, monthString: String, dayString: String, hourString: String, minuteString: String, secondString: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var calendar = calendar


                    var yearString = yearString


                    var monthString = monthString


                    var dayString = dayString


                    var hourString = hourString


                    var minuteString = minuteString


                    var secondString = secondString

    var year: Int = Integer(yearString).
                            toInt()!!
            


    var month: Int = Integer(monthString).
                            toInt()!!
            


    var day: Int = Integer(dayString).
                            toInt()!!
            


    var hour: Int = Integer(hourString).
                            toInt()!!
            


    var minute: Int = Integer(minuteString).
                            toInt()!!
            


    var second: Int = Integer(secondString).
                            toInt()!!
            

calendar.set(year, month, day, hour, minute, second)
}


open fun setExpirationCalendar(calendar: Calendar, yearsString: String, monthsString: String, daysString: String, hoursString: String, minutesString: String, secondsString: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var calendar = calendar


                    var yearsString = yearsString


                    var monthsString = monthsString


                    var daysString = daysString


                    var hoursString = hoursString


                    var minutesString = minutesString


                    var secondsString = secondsString

    var year: Int = calendar.get(Calendar.YEAR) +Integer(yearsString).
                            toInt()


    var month: Int = calendar.get(Calendar.MONTH) +Integer(monthsString).
                            toInt()


    var day: Int = calendar.get(Calendar.DAY_OF_MONTH) +Integer(daysString).
                            toInt()


    var hour: Int = calendar.get(Calendar.HOUR) +Integer(hoursString).
                            toInt()


    var minute: Int = calendar.get(Calendar.MINUTE) +Integer(minutesString).
                            toInt()


    var second: Int = calendar.get(Calendar.SECOND) +Integer(secondsString).
                            toInt()

calendar.set(year, month, day, hour, minute, second)
}


open fun getTotalTime(yearString: String, monthString: String, dayString: String, hourString: String, minuteString: String, secondString: String)
        //nullable = true from not(false or (false and false)) = true
: Long{

                    var yearString = yearString


                    var monthString = monthString


                    var dayString = dayString


                    var hourString = hourString


                    var minuteString = minuteString


                    var secondString = secondString

    var time: Long = calendar.getTimeInMillis()!!
            

this.setExpirationCalendar(calendar, yearString, monthString, dayString, hourString, minuteString, secondString)

    var timeDelta: Long = calendar.getTimeInMillis()!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return timeDelta -time
}


}
                
            

