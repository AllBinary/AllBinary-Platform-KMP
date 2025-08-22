
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
        
import org.allbinary.graphics.GPoint
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonSeps

open public class CurrentlyPressedTouchButtonSingletonDebug : CurrentlyPressedTouchButtonSingleton {
        

        companion object {
            
    private val instance: CurrentlyPressedTouchButtonSingletonDebug = CurrentlyPressedTouchButtonSingletonDebug()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CurrentlyPressedTouchButtonSingleton{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private var string: String = StringUtil.getInstance()!!.EMPTY_STRING

    private var listString: String = StringUtil.getInstance()!!.EMPTY_STRING

    private var append: String = StringUtil.getInstance()!!.EMPTY_STRING

    private val PRESSED_AND_FIRED: String = "pressed & fired"

    private val PRESSED_AND_NOT_FIRED: String = "pressed in button but not fired"

    private val ASSOCIATED_RELEASED_AND_FIRED: String = "assoc. rel & fired"

    private val RELEASED_AND_FIRED: String = "rel & fired 1"

    private val RELEASED_AND_FIRED_2: String = "rel & fired 2"

    private val RELEASED_AND_NOT_FIRED: String = "rel & not fired"

open fun append(append: String, touchButtonInput: TouchButtonInput)
        //nullable = true from not(false or (false and false)) = true
{

                    var append = append


                    var touchButtonInput = touchButtonInput

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(touchButtonInput!!.toString())
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(append)
this.append= stringBuffer!!.toString()
this.string= StringMaker().
                            append(listString)!!.append(this.append)!!.toString()
}


open fun append(append: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var append = append
this.append= StringMaker().
                            append(this.append)!!.append(append)!!.toString()
this.string= StringMaker().
                            append(listString)!!.append(this.append)!!.toString()
}


open fun clearLog(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var x = x


                    var y = y
this.append= StringMaker().
                            append(GPoint.toStringStatic(x, y, 0))!!.append(CommonSeps.getInstance()!!.SPACE)!!.toString()
this.string= StringMaker().
                            append(listString)!!.append(this.append)!!.toString()
}


open fun releaseAndNotFired()
        //nullable = true from not(false or (false and true)) = true
{this.append(RELEASED_AND_NOT_FIRED)
}


open fun releaseAndFired(touchButtonInput: TouchButtonInput)
        //nullable = true from not(false or (false and false)) = true
{

                    var touchButtonInput = touchButtonInput
this.append(RELEASED_AND_FIRED, touchButtonInput)
}


open fun releaseAndFired2(touchButtonInput: TouchButtonInput)
        //nullable = true from not(false or (false and false)) = true
{

                    var touchButtonInput = touchButtonInput
this.append(RELEASED_AND_FIRED_2, touchButtonInput)
}


open fun releaseAndFiredAssociated(touchButtonInput: TouchButtonInput)
        //nullable = true from not(false or (false and false)) = true
{

                    var touchButtonInput = touchButtonInput
this.append(ASSOCIATED_RELEASED_AND_FIRED, touchButtonInput)
}


open fun pressedAndFired(touchButtonInput: TouchButtonInput)
        //nullable = true from not(false or (false and false)) = true
{

                    var touchButtonInput = touchButtonInput
this.append(PRESSED_AND_FIRED, touchButtonInput)
}


open fun pressedAndNotFired(touchButtonInput: TouchButtonInput)
        //nullable = true from not(false or (false and false)) = true
{

                    var touchButtonInput = touchButtonInput
this.append(PRESSED_AND_NOT_FIRED, touchButtonInput)
}

override fun remove(index: Int)
        //nullable = true from not(false or (false and false)) = true
: TouchButtonInput{

                    var index = index

    var touchButtonInput: TouchButtonInput = super.remove(index)!!

this.listString= list.toString()
this.string= StringMaker().
                            append(listString)!!.append(this.append)!!.toString()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return touchButtonInput
}

override fun remove(touchButtonInput: TouchButtonInput)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var touchButtonInput = touchButtonInput

    var isRemoved: Boolean = super.remove(touchButtonInput)!!

this.listString= list.toString()
this.string= StringMaker().
                            append(listString)!!.append(this.append)!!.toString()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return isRemoved
}

override fun add(touchButtonInput: TouchButtonInput)
        //nullable = true from not(false or (false and false)) = true
{

                    var touchButtonInput = touchButtonInput
super.add(touchButtonInput)
this.listString= list.toString()
this.string= StringMaker().
                            append(listString)!!.append(this.append)!!.toString()
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return string
}


}
                
            

