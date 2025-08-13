
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
        package org.allbinary.game.layer.geographic.map



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.BasicArrayList
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition

open public class LayerPartialCellPositionsUtil
            : Object
         {
        

        companion object {
            
    private val instance: LayerPartialCellPositionsUtil = LayerPartialCellPositionsUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: LayerPartialCellPositionsUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
open fun getAll(geographicMapInterface: BasicGeographicMap, layerInterface: AllBinaryLayer, reusableList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var geographicMapInterface = geographicMapInterface


                    var layerInterface = layerInterface


                    var reusableList = reusableList
reusableList!!.clear()

    var topLeftGeographicMapCellPosition: GeographicMapCellPosition = geographicMapInterface!!.getCellPositionAtNoThrow(layerInterface!!.getXP(), layerInterface!!.getYP())!!
            


    var topRightGeographicMapCellPosition: GeographicMapCellPosition = geographicMapInterface!!.getCellPositionAtNoThrow(layerInterface!!.getXP() +layerInterface!!.getWidth(), layerInterface!!.getYP())!!
            


    var bottomLeftGeographicMapCellPosition: GeographicMapCellPosition = geographicMapInterface!!.getCellPositionAtNoThrow(layerInterface!!.getXP(), layerInterface!!.getYP() +layerInterface!!.getHeight())!!
            


    var bottomRightGeographicMapCellPosition: GeographicMapCellPosition = geographicMapInterface!!.getCellPositionAtNoThrow(layerInterface!!.getXP() +layerInterface!!.getWidth(), layerInterface!!.getYP() +layerInterface!!.getHeight())!!
            


    
                        if(topLeftGeographicMapCellPosition != 
                                    null
                                )
                        
                                    {
                                    reusableList!!.add(topLeftGeographicMapCellPosition)

                                    }
                                

    
                        if(topRightGeographicMapCellPosition != 
                                    null
                                 && topLeftGeographicMapCellPosition != topRightGeographicMapCellPosition)
                        
                                    {
                                    reusableList!!.add(topRightGeographicMapCellPosition)

                                    }
                                

    
                        if(bottomLeftGeographicMapCellPosition != 
                                    null
                                 && !reusableList!!.contains(bottomLeftGeographicMapCellPosition))
                        
                                    {
                                    reusableList!!.add(bottomLeftGeographicMapCellPosition)

                                    }
                                

    
                        if(bottomRightGeographicMapCellPosition != 
                                    null
                                 && !reusableList!!.contains(bottomRightGeographicMapCellPosition))
                        
                                    {
                                    reusableList!!.add(bottomRightGeographicMapCellPosition)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return reusableList
}


                @Throws(Exception::class)
            
open fun getAll(geographicMapInterface: BasicGeographicMap, layerInterface: AllBinaryLayer, dx: Int, dy: Int, reusableList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var geographicMapInterface = geographicMapInterface


                    var layerInterface = layerInterface


                    var dx = dx


                    var dy = dy


                    var reusableList = reusableList
reusableList!!.clear()

    var topLeftGeographicMapCellPosition: GeographicMapCellPosition = geographicMapInterface!!.getCellPositionAtNoThrow(layerInterface!!.getXP() +dx, layerInterface!!.getYP() +dy)!!
            


    var topRightGeographicMapCellPosition: GeographicMapCellPosition = geographicMapInterface!!.getCellPositionAtNoThrow(layerInterface!!.getXP() +layerInterface!!.getWidth() +dx, layerInterface!!.getYP() +dy)!!
            


    var bottomLeftGeographicMapCellPosition: GeographicMapCellPosition = geographicMapInterface!!.getCellPositionAtNoThrow(layerInterface!!.getXP() +dx, layerInterface!!.getYP() +layerInterface!!.getHeight() +dy)!!
            


    var bottomRightGeographicMapCellPosition: GeographicMapCellPosition = geographicMapInterface!!.getCellPositionAtNoThrow(layerInterface!!.getXP() +layerInterface!!.getWidth() +dx, layerInterface!!.getYP() +layerInterface!!.getHeight() +dy)!!
            


    
                        if(topLeftGeographicMapCellPosition != 
                                    null
                                )
                        
                                    {
                                    reusableList!!.add(topLeftGeographicMapCellPosition)

                                    }
                                

    
                        if(topRightGeographicMapCellPosition != 
                                    null
                                 && topLeftGeographicMapCellPosition != topRightGeographicMapCellPosition)
                        
                                    {
                                    reusableList!!.add(topRightGeographicMapCellPosition)

                                    }
                                

    
                        if(bottomLeftGeographicMapCellPosition != 
                                    null
                                 && !reusableList!!.contains(bottomLeftGeographicMapCellPosition))
                        
                                    {
                                    reusableList!!.add(bottomLeftGeographicMapCellPosition)

                                    }
                                

    
                        if(bottomRightGeographicMapCellPosition != 
                                    null
                                 && !reusableList!!.contains(bottomRightGeographicMapCellPosition))
                        
                                    {
                                    reusableList!!.add(bottomRightGeographicMapCellPosition)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return reusableList
}


}
                
            

