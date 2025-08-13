
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2006 AllBinary 
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker

open public class TiledLayerUtil
            : Object
         {
        

        companion object {
            
    private val instance: TiledLayerUtil = TiledLayerUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TiledLayerUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun keepOnMapX(terrainTiledLayer: AllBinaryTiledLayer, x: Int, width: Int, mapBorderBufferWidth: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var terrainTiledLayer = terrainTiledLayer


                    var x = x


                    var width = width


                    var mapBorderBufferWidth = mapBorderBufferWidth

    var newX: Int = x


    var maxRight: Int = terrainTiledLayer!!.getWidth() -width -mapBorderBufferWidth


    
                        if(x +width > maxRight)
                        
                                    {
                                    newX= maxRight

                                    }
                                

    
                        if(x < mapBorderBufferWidth)
                        
                                    {
                                    newX= mapBorderBufferWidth

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newX
}


open fun keepOnMapY(terrainTiledLayer: AllBinaryTiledLayer, y: Int, height: Int, mapBorderBufferHeight: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var terrainTiledLayer = terrainTiledLayer


                    var y = y


                    var height = height


                    var mapBorderBufferHeight = mapBorderBufferHeight

    var newY: Int = y


    var maxBottom: Int = terrainTiledLayer!!.getHeight() -height -mapBorderBufferHeight


    
                        if(y +height > maxBottom)
                        
                                    {
                                    newY= maxBottom

                                    }
                                

    
                        if(y < mapBorderBufferHeight)
                        
                                    {
                                    newY= mapBorderBufferHeight

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newY
}


open fun keepOnMapX(terrainTiledLayer: AllBinaryTiledLayer, x: Int, width: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var terrainTiledLayer = terrainTiledLayer


                    var x = x


                    var width = width

    var newX: Int = x


    var maxRight: Int = terrainTiledLayer!!.getWidth() -width


    
                        if(x >= maxRight)
                        
                                    {
                                    newX= maxRight

                                    }
                                

    
                        if(x < 0)
                        
                                    {
                                    newX= 0

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newX
}


open fun keepOnMapY(terrainTiledLayer: AllBinaryTiledLayer, y: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var terrainTiledLayer = terrainTiledLayer


                    var y = y


                    var height = height

    var newY: Int = y


    var maxBottom: Int = terrainTiledLayer!!.getHeight() -height


    
                        if(y >= maxBottom)
                        
                                    {
                                    newY= maxBottom

                                    }
                                

    
                        if(y < 0)
                        
                                    {
                                    newY= 0

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newY
}


}
                
            

