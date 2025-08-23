
        /* Generated Code Do Not Modify */
        package org.allbinary.time




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.NullUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.util.visitor.Visitor
import org.allbinary.string.CommonStrings
import org.allbinary.thread.ThreadObjectUtil

open public class StupidTimer
            : Object
         {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    val nullUtil: NullUtil = NullUtil.getInstance()!!

    private val threadObjectUtil: ThreadObjectUtil = ThreadObjectUtil.getInstance()!!

open fun visitBool(visitorInterface: Visitor)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var visitorInterface = visitorInterface

    var result: Boolean = visitorInterface!!.visit(nullUtil!!.NULL_OBJECT) as Boolean


    var result2: Boolean = result!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result2
}


                @Throws(Exception::class)
            
open fun visit(visitorInterface: Visitor, timeDelayHelper: TimeDelayHelper)
        //nullable = true from not(false or (false and false)) = true
{

                    var visitorInterface = visitorInterface


                    var timeDelayHelper = timeDelayHelper

    var tookTooLong: Boolean = false


    var WAITING_FOR: String = "Waiting for: "

PreLogUtil.put(StringMaker().
                            append(WAITING_FOR)!!.append(StringUtil.getInstance()!!.toString(visitorInterface))!!.toString(), this, commonStrings!!.VISIT)

    var index: Int = 0


        while(this.visitBool(visitorInterface))
        {
    
                        if(index % 10 == 0)
                        
                                    {
                                    PreLogUtil.put(StringMaker().
                            append(WAITING_FOR)!!.append(index)!!.toString(), this, commonStrings!!.VISIT)

                                    }
                                
index++

        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(this) 

        //mutex.withLock
        {this.threadObjectUtil!!.waitObject(this, 1800)
}


    
                        if(timeDelayHelper!!.isTime())
                        
                                    {
                                    tookTooLong= true
break;

                    

                                    }
                                
}


    
                        if(tookTooLong)
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.VISIT, Exception(StringMaker().
                            append("Took Too Long: ")!!.append(StringUtil.getInstance()!!.toString(visitorInterface))!!.toString()))

                                    }
                                
                        else {
                            PreLogUtil.put(timeDelayHelper!!.toString(), this, commonStrings!!.VISIT)

                        }
                            
}


                @Throws(Exception::class)
            
open fun stopWaiting()
        //nullable = true from not(false or (false and true)) = true
{
        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(this) 

        //mutex.withLock
        {this.threadObjectUtil!!.notifyObject(this)
}

}


}
                
            

