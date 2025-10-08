
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
        package org.allbinary.game.layer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class BasicLayerPlacement
            : Object
         {
        

    private var layerType: LayerPlacementType

    private var width: Int

    private var height: Int
public constructor (layerType: LayerPlacementType, width: Int, height: Int)
            : super()
        {
var layerType = layerType
var width = width
var height = height
this.layerType= layerType
this.width= width
this.height= height
}


    open fun getWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.width
}


    open fun getHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.height
}


    open fun getLayerType()
        //nullable = true from not(false or (false and true)) = true
: LayerPlacementType{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return layerType
}


    open fun setLayerType(layerType: LayerPlacementType)
        //nullable = true from not(false or (false and false)) = true
{
var layerType = layerType
this.layerType= layerType
}


}
                
            

