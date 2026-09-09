
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
                        return J2MEKeyFactory.instance
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

    var gameKeyArray: Array<GameKey?> = arrayOf(this.gameKeyFactory!!.DOWN,this.gameKeyFactory!!.FIRE,this.gameKeyFactory!!.GAME_A,this.gameKeyFactory!!.GAME_B,this.gameKeyFactory!!.GAME_C,this.gameKeyFactory!!.GAME_D,this.gameKeyFactory!!.KEY_NUM0,this.gameKeyFactory!!.KEY_NUM1,this.gameKeyFactory!!.KEY_NUM2,this.gameKeyFactory!!.KEY_NUM3,this.gameKeyFactory!!.KEY_NUM4,this.gameKeyFactory!!.KEY_NUM5,this.gameKeyFactory!!.KEY_NUM6,this.gameKeyFactory!!.KEY_NUM7,this.gameKeyFactory!!.KEY_NUM8,this.gameKeyFactory!!.KEY_NUM9,this.gameKeyFactory!!.KEY_POUND,this.gameKeyFactory!!.KEY_STAR,this.gameKeyFactory!!.LEFT,this.gameKeyFactory!!.LEVEL_DOWN,this.gameKeyFactory!!.LEVEL_UP,this.gameKeyFactory!!.NONE,this.gameKeyFactory!!.RIGHT,this.gameKeyFactory!!.UP)


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

    
                        if(input == this.gameKeyFactory!!.FIRE)
                        
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

    
                        if(input == this.gameKeyFactory!!.GAME_D)
                        
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

    
                        if(input == this.gameKeyFactory!!.UP)
                        
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

    
                        if(input == this.gameKeyFactory!!.DOWN)
                        
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

    
                        if(input == this.gameKeyFactory!!.LEFT)
                        
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

    
                        if(input == this.gameKeyFactory!!.RIGHT)
                        
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

    
                        if(input == this.gameKeyFactory!!.FIRE)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

