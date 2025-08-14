
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
        package org.allbinary.game.terrain




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.math.Angle
import org.allbinary.math.AngleFactory

open public class BasicTerrainInfo
            : Object
         {
        

        companion object {
            
    val NULL_BASIC_TERRAIN_INFO: BasicTerrainInfo = BasicTerrainInfo(AngleFactory.getInstance()!!.NOT_ANGLE)

        }
            
    private var angle: Angle
public constructor        (angle: Angle)
            : super()
        {

                    var angle = angle
this.angle= angle
}


open fun getAngle()
        //nullable = true from not(false or (false and true)) = true
: Angle{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return angle
}


open fun setAngle(angle: Angle)
        //nullable = true from not(false or (false and false)) = true
{

                    var angle = angle
this.angle= angle
}


}
                
            

