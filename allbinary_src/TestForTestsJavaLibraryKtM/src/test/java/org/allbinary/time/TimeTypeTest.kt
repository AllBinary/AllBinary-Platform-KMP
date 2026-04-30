
        /* Generated Code Do Not Modify */
        package org.allbinary.time




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Calendar
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

open public class TimeTypeTest
            : Object
         {
        
companion object {
            
    open fun millisForHourLocal(hour: Int)
        //nullable = true from not(false or (false and false)) = true
: Long{
var hour = hour

    var cal: Calendar = Calendar.getInstance()!!

cal.set(Calendar.HOUR_OF_DAY, hour)
cal.set(Calendar.MINUTE, 0)
cal.set(Calendar.SECOND, 0)
cal.set(Calendar.MILLISECOND, 0)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cal.getTimeInMillis()
}


open public class TestableTimeTypeUtil : TimeTypeUtil {
        
/*Static stuff is not allowed for Kotlin inner classescompanion object {
            *//*
        }
            */


    private val hour: Int
 constructor (hour: Int){
var hour = hour
this.hour= hour
}


    override fun getHourOfDay()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.hour
}


}
                
            
        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    open fun isNight_returnsTrue_for_hours_less_than_6()
        //nullable = true from not(false or (false and true)) = true
{

                    //Otherwise - statement - ForEachStmt

}


    open fun isNight_returnsTrue_for_hours_greater_than_18()
        //nullable = true from not(false or (false and true)) = true
{

                    //Otherwise - statement - ForEachStmt

}


    open fun isNight_returnsFalse_for_boundary_hours_6_and_18()
        //nullable = true from not(false or (false and true)) = true
{

                    //Otherwise - statement - ForEachStmt

}


    open fun getNightOrDay_returns_expected_label()
        //nullable = true from not(false or (false and true)) = true
{

    var nightUtil: TimeTypeUtil = TestableTimeTypeUtil(0)

Assertions.assertEquals(nightUtil!!.NIGHT, nightUtil!!.getNightOrDay())

    var dayUtil: TimeTypeUtil = TestableTimeTypeUtil(12)

Assertions.assertEquals(dayUtil!!.DAY, dayUtil!!.getNightOrDay())
}


    open fun getHourOfDay_long_converts_epoch_to_local_hour()
        //nullable = true from not(false or (false and true)) = true
{

    var util: TimeTypeUtil = TimeTypeUtil()


                    //Otherwise - statement - ForEachStmt

}


    open fun isNight_long_expected_ranges()
        //nullable = true from not(false or (false and true)) = true
{

    var util: TimeTypeUtil = TimeTypeUtil()


                    //Otherwise - statement - ForEachStmt


                    //Otherwise - statement - ForEachStmt

}


    open fun getNightOrDay_long_consistency()
        //nullable = true from not(false or (false and true)) = true
{

    var util: TimeTypeUtil = TimeTypeUtil()


    var nightMillis: Long = TimeTypeTest.millisForHourLocal(0)!!


    var dayMillis: Long = TimeTypeTest.millisForHourLocal(12)!!

Assertions.assertEquals(util.NIGHT, util.getNightOrDay(nightMillis))
Assertions.assertEquals(util.DAY, util.getNightOrDay(dayMillis))
}


    open fun boundaries_day_for_long_based_api()
        //nullable = true from not(false or (false and true)) = true
{

    var util: TimeTypeUtil = TimeTypeUtil()


                    //Otherwise - statement - ForEachStmt

}


    open fun constants_accessible_and_stable()
        //nullable = true from not(false or (false and true)) = true
{

    var util: TimeTypeUtil = TimeTypeUtil()

Assertions.assertEquals("Night", util.NIGHT)
Assertions.assertEquals("Day", util.DAY)
}


    open fun getInstance_returns_same_singleton()
        //nullable = true from not(false or (false and true)) = true
{

    var a: TimeTypeUtil = TimeTypeUtil.getInstance()!!


    var b: TimeTypeUtil = TimeTypeUtil.getInstance()!!

Assertions.assertSame(a, b)
}


}
                
            

