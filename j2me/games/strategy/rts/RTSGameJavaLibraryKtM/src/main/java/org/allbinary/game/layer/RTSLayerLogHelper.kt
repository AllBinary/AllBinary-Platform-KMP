
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        
import org.allbinary.math.AngleInfo
import org.allbinary.math.NamedAngle
import org.allbinary.media.graphics.geography.map.GeographicMapCellHistory
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.util.BasicArrayList

open public class RTSLayerLogHelper
            : Object
         {
        

        companion object {


    private val instance: RTSLayerLogHelper = RTSLayerLogHelper()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: RTSLayerLogHelper{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun setClosestGeographicMapCellHistory(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, pathsList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var pathsList = pathsList
}


open fun trackTo(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, nextUnvisitedPathGeographicMapCellPosition: GeographicMapCellPosition, dx: Int, dy: Int, reason: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var nextUnvisitedPathGeographicMapCellPosition = nextUnvisitedPathGeographicMapCellPosition


                    var dx = dx


                    var dy = dy


                    var reason = reason
}


open fun turnTo(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, dx: Int, dy: Int, angleInfo: AngleInfo, angle: Int, movementAngle: NamedAngle, evading: Boolean, targetAngle: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var dx = dx


                    var dy = dy


                    var angleInfo = angleInfo


                    var angle = angle


                    var movementAngle = movementAngle


                    var evading = evading


                    var targetAngle = targetAngle
}


open fun doneMoving(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
}


open fun closeEnough(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
}


open fun movingLeft(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
}


open fun movingRight(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
}


open fun movingUp(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
}


open fun movingDown(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
}


open fun currentMoveEnded(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
}


open fun evade(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
}


open fun rotateLeft(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
}


open fun rotateRight(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
}


open fun handle(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, movementAngle: NamedAngle)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var movementAngle = movementAngle
}


open fun noRotation(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
}


open fun notOnPath(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, geographicMapCellHistory: GeographicMapCellHistory, currentGeographicMapCellPosition: GeographicMapCellPosition, pathList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var geographicMapCellHistory = geographicMapCellHistory


                    var currentGeographicMapCellPosition = currentGeographicMapCellPosition


                    var pathList = pathList
}


}
                
            

