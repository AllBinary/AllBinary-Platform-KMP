
        /* Generated Code Do Not Modify */
        package org.allbinary.time




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Calendar
import java.util.TimeZone

open public class TimeTypeUtil
            : Object
         {
        
companion object {
            
    private val instance: TimeTypeUtil = TimeTypeUtil()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TimeTypeUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TimeTypeUtil.instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val NIGHT: String = "Night"

    val DAY: String = "Day"

    open fun isNight()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

    var hoursOfDay: Int = this.getHourOfDay()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hoursOfDay < 6 || hoursOfDay > 18
}


    open fun getHourOfDay()
        //nullable = true from not(false or (false and true)) = true
: Int{

    var calendar: Calendar = Calendar.getInstance()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return calendar.get(Calendar.HOUR_OF_DAY)
}


    open fun getNightOrDay()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return if(this.isNight()) {
                            
                            this.NIGHT
                        
                            } else {
                            this.DAY
                            }
    
}


    open fun getHourOfDay(timeInMillis: Long)
        //nullable = true from not(false or (false and false)) = true
: Int{
var timeInMillis = timeInMillis

    var calendar: Calendar = Calendar.getInstance()!!

calendar.setTimeInMillis(timeInMillis)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return calendar.get(Calendar.HOUR_OF_DAY)
}


    open fun isNight(timeInMillis: Long)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var timeInMillis = timeInMillis

    var hoursOfDay: Int = this.getHourOfDay(timeInMillis)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hoursOfDay < 6 || hoursOfDay > 18
}


    open fun getNightOrDay(timeInMillis: Long)
        //nullable = true from not(false or (false and false)) = true
: String{
var timeInMillis = timeInMillis



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return if(this.isNight(timeInMillis)) {
                            
                            this.NIGHT
                        
                            } else {
                            this.DAY
                            }
    
}


}
                
            

