
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import android.view.View
import org.allbinary.android.view.BaseViewWrapper
import org.allbinary.android.view.ViewWrapper
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil

open public class AndroidGameStatistics : BaseGameStatistics {
        

    private var view: BaseViewWrapper = BaseViewWrapper.NULL_VIEW_WRAPPER

    private var totalOnDraws: Long= 0

    private val STRING_ARRAY: Array<String?> = arrayOfNulls(14)
public constructor        (){

    var stringUtil: StringUtil = StringUtil.getInstance()!!





                        for (index in 0 until STRING_ARRAY.size)

        {
this.STRING_ARRAY[index]= stringUtil!!.EMPTY_STRING
}

}


open fun init(view: View)
        //nullable = true from not(false or (false and false)) = true
{
var view = view
super.init()
this.view= ViewWrapper(view)
this.totalOnDraws= 0
}

override fun process()
        //nullable = true from not(false or (false and true)) = true
{
view.postInvalidate()
}


open fun nextOnDraw()
        //nullable = true from not(false or (false and true)) = true
{
this.totalOnDraws++
}


    private val TOTAL_ONDRAWS: String = " Total onDraws: "

    private val ONDRAWS_RATE: String = " onDraws(/10) Sec: "
override fun toStringArray()
        //nullable = true from not(false or (false and true)) = true
: Array<String?>{

    var stringArray: Array<String?> = super.toStringArray()!!





                        for (index in 0 until stringArray!!.size)

        {
STRING_ARRAY[index]= stringArray[index]!!
}


    var totalTime: Long = getTimeDelayHelper()!!.getElapsed(this.gameTickTimeDelayHelper!!.startTime)!!

totalTime= (totalTime /10000)
STRING_ARRAY[10]= TOTAL_ONDRAWS
STRING_ARRAY[11]= (this.totalOnDraws).toString()
STRING_ARRAY[12]= ONDRAWS_RATE
STRING_ARRAY[13]= (this.totalOnDraws /totalTime).toString()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return STRING_ARRAY
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var totalTime: Long = getTimeDelayHelper()!!.getElapsed(this.gameTickTimeDelayHelper!!.startTime)!!

totalTime= (totalTime /1000)

    
                        if(totalTime > 0)
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(super.toString(totalTime))

    
                        if(this.totalOnDraws > 0)
                        
                                    {
                                    stringBuffer!!.append(TOTAL_ONDRAWS)
stringBuffer!!.append(totalOnDraws.toString())
stringBuffer!!.append(ONDRAWS_RATE)

    var drawsOverTime: String = (this.totalOnDraws /totalTime).toString()!!

stringBuffer!!.append(drawsOverTime)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NOT

                        }
                            
}


}
                
            

