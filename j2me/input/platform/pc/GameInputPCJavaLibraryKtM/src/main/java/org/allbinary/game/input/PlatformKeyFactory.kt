
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
        package org.allbinary.game.input




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class PlatformKeyFactory
            : Object
         {
        

        companion object {
            
    private val SINGLETON: PlatformKeyFactory = PlatformKeyFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PlatformKeyFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun getString(keyCode: Int)
        //nullable = true from not(false or (false and false)) = true
: String{
var keyCode = keyCode



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PCGameKey.getString(keyCode)
}


open fun isSubmission(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PCKeyFactory.getInstance()!!.isSubmission(input)
}


open fun isDelete(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PCKeyFactory.getInstance()!!.isDelete(input)
}


open fun isBackSpace(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PCKeyFactory.getInstance()!!.isBackSpace(input)
}


open fun isUp(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PCKeyFactory.getInstance()!!.isUp(input)
}


open fun isDown(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PCKeyFactory.getInstance()!!.isDown(input)
}


open fun isEnter(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PCKeyFactory.getInstance()!!.isEnter(input)
}


open fun isLeft(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PCKeyFactory.getInstance()!!.isLeft(input)
}


open fun isRight(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PCKeyFactory.getInstance()!!.isRight(input)
}


}
                
            

