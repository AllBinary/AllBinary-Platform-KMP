
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
        
import org.allbinary.util.BasicArrayList

open public class CurrentlyPressedTouchButtonSingleton
            : Object
         {
        

        companion object {
            
    private val instance: CurrentlyPressedTouchButtonSingleton = CurrentlyPressedTouchButtonSingleton()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CurrentlyPressedTouchButtonSingleton{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val list: BasicArrayList = BasicArrayList()
protected constructor        ()
            : super()
        {}


open fun size()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.list.size()
}


open fun remove(index: Int)
        //nullable = true from not(false or (false and false)) = true
: TouchButtonInput{

                    var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.list.remove(index) as TouchButtonInput
}


open fun remove(touchButtonInput: TouchButtonInput)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var touchButtonInput = touchButtonInput



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.list.remove(touchButtonInput)
}


open fun get(index: Int)
        //nullable = true from not(false or (false and false)) = true
: TouchButtonInput{

                    var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.list.objectArray[index]!! as TouchButtonInput
}


open fun contains(touchButtonInput: TouchButtonInput)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var touchButtonInput = touchButtonInput



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.list.contains(touchButtonInput)
}


open fun add(touchButtonInput: TouchButtonInput)
        //nullable = true from not(false or (false and false)) = true
{

                    var touchButtonInput = touchButtonInput
this.list.add(touchButtonInput)
}


}
                
            

