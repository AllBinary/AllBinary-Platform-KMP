
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
        package org.allbinary.canvas




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.math.PrimitiveLongSingleton
import org.allbinary.logic.math.ScaleFactorFactory
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonSeps
import org.allbinary.time.GameTickTimeDelayHelper
import org.allbinary.time.GameTickTimeDelayHelperFactory
import org.allbinary.time.TimeDelayHelper

open public class BaseGameStatistics
            : Object
         {
        

    private val timeDelayHelper: TimeDelayHelper = TimeDelayHelper(Integer.MAX_VALUE)

    private val updateDelayHelper: TimeDelayHelper = TimeDelayHelper(2000)

    private var totalRefreshes: Long= 0

    private var totalFrames: Long= 0

    val gameTickTimeDelayHelper: GameTickTimeDelayHelper = GameTickTimeDelayHelperFactory.getInstance()!!
public constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


open fun init()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.timeDelayHelper!!.setStartTime()
this.totalRefreshes= 0
this.totalFrames= 0
}


open fun add(string: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var string = string
}


open fun process()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


open fun nextFrame()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.totalFrames++
}


open fun nextRefresh()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.totalRefreshes++
}


    private val DEFAULT_SCALE_FACTOR: Int = ScaleFactorFactory.getInstance()!!.DEFAULT_SCALE_FACTOR

open fun getRefreshRate()
        //nullable = true from not(false or (false and true)) = true
: Short

        Updates for KMP build        
        {

    var elapsed: Long = this.timeDelayHelper!!.getElapsed(this.gameTickTimeDelayHelper!!.startTime)!!


    
                        if(elapsed > 1)
                        
                                    {
                                    
    var time: Short = (this.totalRefreshes /(elapsed shr DEFAULT_SCALE_FACTOR)).toShort()




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return time

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0

                        }
                            
}


open fun getTimeDelayHelper()
        //nullable = true from not(false or (false and true)) = true
: TimeDelayHelper

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.timeDelayHelper
}


    val NOT: String = "Not enough Time to Calculate"

    private val EMPTY_STRING: String = StringUtil.getInstance()!!.EMPTY_STRING

    private val STRING_ARRAY: Array<String?> = arrayOf(" Total Time: ",EMPTY_STRING," Total Frames: ",EMPTY_STRING," Frames/10 Sec: ",EMPTY_STRING," Total Paints: ",EMPTY_STRING," Paints/10 Sec: ",EMPTY_STRING)

    private val SPACE_CHAR: Char = 
                ' '
            

    private val PLUS_CHAR: Char = 
                '+'
            

    private val X_CHAR: Char = 
                'X'
            

    private val CHAR_ARRAY: Array<CharArray?> = arrayOf(charArrayOf('F','r','a','m','e','s','/','1','0',' ','S','e','c',':'),charArrayOf('X','X'),charArrayOf('P','a','i','n','t','s','/','1','0',' ','S','e','c',':'),charArrayOf('X','X'))

    private val primitiveLongSingleton: PrimitiveLongSingleton = PrimitiveLongSingleton.getInstance()!!

open fun toCharArray()
        //nullable = true from not(false or (false and true)) = true
: Array<CharArray?>

        Updates for KMP build        
        {

    var totalTime: Long = this.timeDelayHelper!!.getElapsed(this.gameTickTimeDelayHelper!!.startTime)!!

totalTime= (totalTime shr DEFAULT_SCALE_FACTOR)

    
                        if(totalTime > 0 && updateDelayHelper!!.isTime(this.gameTickTimeDelayHelper!!.startTime))
                        
                                    {
                                    
    var framesPerSec: Int = (this.totalFrames /totalTime).toInt()


    
                        if(framesPerSec < 10)
                        
                                    {
                                    CHAR_ARRAY[1]!![0]= SPACE_CHAR
CHAR_ARRAY[1]!![1]= primitiveLongSingleton!!.NUMBER_CHAR_ARRAY[framesPerSec]!!

                                    }
                                
                             else 
    
                        if(framesPerSec < 100)
                        
                                    {
                                    
    var tens: Int = framesPerSec /10


    var removeTens: Int = tens *10

CHAR_ARRAY[1]!![0]= primitiveLongSingleton!!.NUMBER_CHAR_ARRAY[tens]!!
CHAR_ARRAY[1]!![1]= primitiveLongSingleton!!.NUMBER_CHAR_ARRAY[framesPerSec -removeTens]!!

                                    }
                                
                        else {
                            CHAR_ARRAY[1]!![0]= PLUS_CHAR
CHAR_ARRAY[1]!![1]= PLUS_CHAR

                        }
                            

    var refreshesPerSec: Int = (this.totalRefreshes /totalTime).toInt()


    
                        if(refreshesPerSec < 10)
                        
                                    {
                                    CHAR_ARRAY[3]!![0]= X_CHAR
CHAR_ARRAY[3]!![1]= primitiveLongSingleton!!.NUMBER_CHAR_ARRAY[refreshesPerSec]!!

                                    }
                                
                             else 
    
                        if(refreshesPerSec < 100)
                        
                                    {
                                    
    var tens: Int = refreshesPerSec /10


    var removeTens: Int = tens *10

CHAR_ARRAY[3]!![0]= primitiveLongSingleton!!.NUMBER_CHAR_ARRAY[refreshesPerSec /10]!!
CHAR_ARRAY[3]!![1]= primitiveLongSingleton!!.NUMBER_CHAR_ARRAY[refreshesPerSec -removeTens]!!

                                    }
                                
                        else {
                            CHAR_ARRAY[3]!![0]= PLUS_CHAR
CHAR_ARRAY[3]!![1]= PLUS_CHAR

                        }
                            

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CHAR_ARRAY
}


open fun toStringArray()
        //nullable = true from not(false or (false and true)) = true
: Array<String?>

        Updates for KMP build        
        {

    var totalTime: Long = this.timeDelayHelper!!.getElapsed(this.gameTickTimeDelayHelper!!.startTime)!!

totalTime= (totalTime /10000)

    
                        if(totalTime > 0)
                        
                                    {
                                    STRING_ARRAY[1]= (totalTime).toString()
STRING_ARRAY[3]= (this.totalFrames).toString()
STRING_ARRAY[5]= (this.totalFrames /totalTime).toString()
STRING_ARRAY[7]= (this.totalRefreshes).toString()
STRING_ARRAY[9]= (this.totalRefreshes /totalTime).toString()

                                    }
                                
                        else {
                            
    var string: String = EMPTY_STRING

STRING_ARRAY[1]= string
STRING_ARRAY[3]= string
STRING_ARRAY[5]= string
STRING_ARRAY[7]= string
STRING_ARRAY[9]= string

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return STRING_ARRAY
}


open fun toString(totalTime: Long)
        //nullable = true from not(false or (true and false)) = true
: String

        Updates for KMP build        
        {
var totalTime = totalTime

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(STRING_ARRAY[0]!!)
stringBuffer!!.append(totalTime)
stringBuffer!!.append(STRING_ARRAY[2]!!)
stringBuffer!!.append(this.totalFrames)
stringBuffer!!.append(STRING_ARRAY[4]!!)
stringBuffer!!.append(this.totalFrames /totalTime)

    
                        if(this.totalRefreshes > 0)
                        
                                    {
                                    stringBuffer!!.append(STRING_ARRAY[6]!!)
stringBuffer!!.append(this.totalRefreshes)
stringBuffer!!.append(STRING_ARRAY[8]!!)
stringBuffer!!.append(this.totalRefreshes /totalTime)
stringBuffer!!.append(CommonSeps.getInstance()!!.NEW_LINE)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        {

    var totalTime: Long = this.timeDelayHelper!!.getElapsed(this.gameTickTimeDelayHelper!!.startTime)!!

totalTime= (totalTime /1000)

    
                        if(totalTime > 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.toString(totalTime)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NOT

                        }
                            
}


}
                
            

