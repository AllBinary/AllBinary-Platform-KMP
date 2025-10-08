
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
        

open public class J2MEKeyFactory
            : Object
         {
        
companion object {
            
    private val instance: J2MEKeyFactory = J2MEKeyFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: J2MEKeyFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor ()
            : super()
        {
}


    private val gameKeyFactory: GameKeyFactory = GameKeyFactory.getInstance()!!

    open fun init()
        //nullable = true from not(false or (false and true)) = true
{

    var gameKeyArray: Array<GameKey?> = arrayOf(gameKeyFactory!!.DOWN,gameKeyFactory!!.FIRE,gameKeyFactory!!.GAME_A,gameKeyFactory!!.GAME_B,gameKeyFactory!!.GAME_C,gameKeyFactory!!.GAME_D,gameKeyFactory!!.KEY_NUM0,gameKeyFactory!!.KEY_NUM1,gameKeyFactory!!.KEY_NUM2,gameKeyFactory!!.KEY_NUM3,gameKeyFactory!!.KEY_NUM4,gameKeyFactory!!.KEY_NUM5,gameKeyFactory!!.KEY_NUM6,gameKeyFactory!!.KEY_NUM7,gameKeyFactory!!.KEY_NUM8,gameKeyFactory!!.KEY_NUM9,gameKeyFactory!!.KEY_POUND,gameKeyFactory!!.KEY_STAR,gameKeyFactory!!.LEFT,gameKeyFactory!!.LEVEL_DOWN,gameKeyFactory!!.LEVEL_UP,gameKeyFactory!!.NONE,gameKeyFactory!!.RIGHT,gameKeyFactory!!.UP)


    var inputFactory: InputFactory = InputFactory.getInstance()!!





                        for (index in gameKeyArray!!.size  - 1  downTo 0)

        {
inputFactory!!.add(gameKeyArray[index]!!.getId(), gameKeyArray[index]!!)
}

}


    open fun isSubmission(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input

    
                        if(input == gameKeyFactory!!.FIRE)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun isDelete(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input

    
                        if(input == gameKeyFactory!!.GAME_D)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun isBackSpace(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun isUp(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input

    
                        if(input == gameKeyFactory!!.UP)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun isDown(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input

    
                        if(input == gameKeyFactory!!.DOWN)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun isLeft(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input

    
                        if(input == gameKeyFactory!!.LEFT)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun isRight(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input

    
                        if(input == gameKeyFactory!!.RIGHT)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun isEnter(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input

    
                        if(input == gameKeyFactory!!.FIRE)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

