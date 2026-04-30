
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
                        return PlatformKeyFactory.SINGLETON
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val androidKeyFactory: AndroidKeyFactory = ActivityFractureControllerUtilFactory.getInstance()!!

    open fun getString(keyCode: Int)
        //nullable = true from not(false or (false and false)) = true
: String{
var keyCode = keyCode



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AndroidGameKey.getString(keyCode)
}


    open fun isSubmission(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.androidKeyFactory!!.isSubmission(input)
}


    open fun isDelete(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.androidKeyFactory!!.isDelete(input)
}


    open fun isBackSpace(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.androidKeyFactory!!.isBackSpace(input)
}


    open fun isLeft(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.androidKeyFactory!!.isLeft(input)
}


    open fun isRight(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.androidKeyFactory!!.isRight(input)
}


    open fun isUp(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.androidKeyFactory!!.isUp(input)
}


    open fun isDown(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.androidKeyFactory!!.isDown(input)
}


    open fun isEnter(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.androidKeyFactory!!.isEnter(input)
}


}
                
            

