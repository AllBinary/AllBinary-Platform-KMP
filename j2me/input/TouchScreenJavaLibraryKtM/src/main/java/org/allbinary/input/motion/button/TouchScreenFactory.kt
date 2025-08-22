
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
        package org.allbinary.input.motion.button




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings

open public class TouchScreenFactory
            : Object
         {
        

        companion object {
            
    private val SINGLETON: TouchScreenFactory = TouchScreenFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TouchScreenFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var touch: Boolean= false

    private var multiTouch: Boolean= false

    private var multiTouchDistinct: Boolean= false

    private var touchScreenType: TouchScreenType = TouchScreenTypesFactory.getInstance()!!.NOTOUCH
private constructor        ()
            : super()
        {
        try {
            this.setTouch(true)
this.setMultiTouch(false)
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, SINGLETON, commonStrings!!.GET_INSTANCE, e)
}

}


open fun setMultiTouch(multiTouch: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var multiTouch = multiTouch
this.multiTouch= multiTouch
}


open fun isMultiTouch()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return multiTouch
}


open fun setTouch(touch: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var touch = touch
this.touch= touch
}


open fun isTouch()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return touch
}


open fun setMultiTouchDistinct(multiTouchDistinct: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var multiTouchDistinct = multiTouchDistinct
this.multiTouchDistinct= multiTouchDistinct
}


open fun isMultiTouchDistinct()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return multiTouchDistinct
}


open fun setTouchScreenType(touchScreenType: TouchScreenType)
        //nullable = true from not(false or (false and false)) = true
{

                    var touchScreenType = touchScreenType
this.touchScreenType= touchScreenType
}


open fun getTouchScreenType()
        //nullable = true from not(false or (false and true)) = true
: TouchScreenType{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return touchScreenType
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("TouchScreen: ")
stringBuffer!!.append(this.isTouch())
stringBuffer!!.append(" MultiTouch: ")
stringBuffer!!.append(this.isMultiTouch())
stringBuffer!!.append(" Distinct MultiTouch: ")
stringBuffer!!.append(this.isMultiTouchDistinct())
stringBuffer!!.append(" TouchScreenType: ")
stringBuffer!!.append(StringUtil.getInstance()!!.toString(this.getTouchScreenType()))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

