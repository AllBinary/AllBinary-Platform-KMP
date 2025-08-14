
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
            
    private var multiTouch: Boolean= false

    private var touch: Boolean= false

    private var touchScreenType: TouchScreenType = TouchScreenTypesFactory.getInstance()!!.NOTOUCH
private constructor        ()
            : super()
        {}


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
}


open fun isTouch()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return touch
}


open fun getTouchScreenType()
        //nullable = true from not(false or (false and true)) = true
: TouchScreenType{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return touchScreenType
}


}
                
            

