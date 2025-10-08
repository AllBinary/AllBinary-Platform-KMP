
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
import org.allbinary.util.BasicArrayList

open public class RandomTranslation
            : Object
         {
        
companion object {
            
                @Throws(Exception::class)
            
    open fun getInstance(vector: BasicArrayList, howMuch: Int)
        //nullable =  from not(true or (false and false)) = 
: BasicArrayList{
var vector = vector
var howMuch = howMuch

    var myRandomFactory: MyRandomFactory = MyRandomFactory.getInstance()!!


    var x: Int =  -myRandomFactory!!.getNextInt(howMuch)


    var y: Int = myRandomFactory!!.getNextInt(howMuch)!!


    var graphicsPipe: BasicGraphicsPipeline = BasicGraphicsPipeline(vector)

graphicsPipe!!.createMatrix()
graphicsPipe!!.translate(x, y)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return graphicsPipe!!.getMatrix()
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

