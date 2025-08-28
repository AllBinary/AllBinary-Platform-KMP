
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
        package org.allbinary.layer.relationship




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.RelativeRelationship
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil

open public class RelativeLayerRelationship : RelativeRelationship {
        

    private var layer: AllBinaryLayer = AllBinaryLayer.NULL_ALLBINARY_LAYER
public constructor        (layer: AllBinaryLayer, x: Int, y: Int)                        

                            : this(layer, PointFactory.getInstance()!!.getInstance(x, y), BasicArrayListUtil.getInstance()!!.getImmutableInstance())

        Updates for KMP build        
        {
var layer = layer
var x = x
var y = y


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (layer: AllBinaryLayer, point: GPoint, typesAllowedList: BasicArrayList)                        

                            : super(point, typesAllowedList)

        Updates for KMP build        
        {
var layer = layer
var point = point
var typesAllowedList = typesAllowedList


                            //For kotlin this is before the body of the constructor.
                    
this.layer= layer
}

override fun getX()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.layer.getXP() +super.getX()
}

override fun getY()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.layer.getYP() +super.getY()
}

override fun getZ()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.layer.getZP() +super.getZ()
}


}
                
            

