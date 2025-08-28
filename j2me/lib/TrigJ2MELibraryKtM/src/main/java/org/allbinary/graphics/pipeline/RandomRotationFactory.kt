
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
        package org.allbinary.graphics.pipeline




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.rand.MyRandomFactory
import org.allbinary.math.AngleFactory
import org.allbinary.util.BasicArrayList

open public class RandomRotationFactory
            : Object
         {
        

        companion object {
            
    private val instance: RandomRotationFactory = RandomRotationFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: RandomRotationFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val myRandomFactory: MyRandomFactory = MyRandomFactory.getInstance()!!

    private val angleFactory: AngleFactory = AngleFactory.getInstance()!!

                @Throws(Exception::class)
            
open fun getInstance(vector: BasicArrayList, howMuch: Int)
        //nullable =  from not(true or (false and false)) = 
: BasicArrayList{
var vector = vector
var howMuch = howMuch

    var graphicsPipe: BasicGraphicsPipeline = BasicGraphicsPipeline(vector)

graphicsPipe!!.createMatrix()
graphicsPipe!!.rotate(angleFactory!!.getInstance(getNextRandomAngle(howMuch)))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return graphicsPipe!!.getMatrix()
}


open fun getNextRandomAngle(howMuch: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
var howMuch = howMuch



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return myRandomFactory!!.getNextInt(howMuch *10)
}


}
                
            

