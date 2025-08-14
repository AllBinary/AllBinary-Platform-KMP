
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
        package org.allbinary.game.life




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class Life
            : Object
        
                , LifeInterface {
        

        companion object {
            
    val NO_LIFE: Life = Life()

        }
            
    private var lives: Short

    private var startLives: Short

    private var maxlives: Short
public constructor        ()
            : super()
        {this.lives= 0
this.startLives= 0
this.maxlives= 0
}

public constructor        (lives: Short, maxlives: Short)
            : super()
        {

                    var lives = lives


                    var maxlives = maxlives
this.maxlives= maxlives

    
                        if(lives > this.maxlives)
                        
                                    {
                                    


                            throw Exception(
                            "To Many Lives")

                                    }
                                
this.lives= lives
this.startLives= lives
}

override fun get()
        //nullable = true from not(false or (false and true)) = true
: Short{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.lives
}

override fun set(lives: Short)
        //nullable = true from not(false or (false and false)) = true
{

                    var lives = lives
this.lives= lives
}

override fun reset()
        //nullable = true from not(false or (false and true)) = true
{this.lives= this.startLives
}

override fun add(lives: Short)
        //nullable = true from not(false or (false and false)) = true
{

                    var lives = lives

    
                        if(!this.reachedLimit())
                        
                                    {
                                    
    
                        if(this.lives +lives <= this.getMaxlives())
                        
                                    {
                                    this.lives= (this.lives +lives).toShort()

                                    }
                                
                        else {
                            this.lives= this.getMaxlives()

                        }
                            

                                    }
                                
}

override fun isAlive()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(this.lives <= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                        }
                            
}

override fun getMaxlives()
        //nullable = true from not(false or (false and true)) = true
: Short{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxlives
}


open fun reachedLimit()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(this.lives > this.maxlives || this.lives < 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}

override fun deaths(lives: Short)
        //nullable = true from not(false or (false and false)) = true
{

                    var lives = lives

    
                        if(!this.reachedLimit())
                        
                                    {
                                    
    
                        if(this.lives -lives >= 0)
                        
                                    {
                                    this.lives= (this.lives -lives).toShort()

                                    }
                                
                        else {
                            this.lives= 0

                        }
                            

                                    }
                                
}


open fun getStartLives()
        //nullable = true from not(false or (false and true)) = true
: Short{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return startLives
}


open fun setStartLives(startLives: Short)
        //nullable = true from not(false or (false and false)) = true
{

                    var startLives = startLives
this.startLives= startLives
}


}
                
            

