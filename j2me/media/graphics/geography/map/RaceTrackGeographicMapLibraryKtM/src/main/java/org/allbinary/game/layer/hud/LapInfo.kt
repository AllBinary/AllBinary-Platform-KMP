
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
        package org.allbinary.game.layer.hud




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker

open public class LapInfo
            : Object
         {
        

    private var numberOfLaps: Int

    private var totalLaps: Int
public constructor        (totalLaps: Int)
            : super()
        

        Updates for KMP build        
        {
var totalLaps = totalLaps
this.totalLaps= totalLaps
this.numberOfLaps= 1
}


open fun add()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.numberOfLaps++
}


open fun getCurrentLap()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.numberOfLaps
}


open fun getTotalLaps()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.totalLaps
}


open fun isDone()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {

    
                        if(this.numberOfLaps >= this.totalLaps)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        {

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("isDone: ")
stringBuffer!!.append(this.isDone())
stringBuffer!!.append(" CurrentLap: ")
stringBuffer!!.append(this.getCurrentLap())
stringBuffer!!.append(" Total Laps: ")
stringBuffer!!.append(this.getTotalLaps())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

