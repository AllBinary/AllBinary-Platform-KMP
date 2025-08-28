
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonSeps
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.math.AngleInfo
import org.allbinary.math.NamedAngle
import org.allbinary.math.PositionStrings
import org.allbinary.media.graphics.geography.map.GeographicMapCellHistory
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.util.BasicArrayList

open public class RTSLayerSelectedLogHelper : RTSLayerLogHelper {
        

        companion object {
            
    private val instance: RTSLayerSelectedLogHelper = RTSLayerSelectedLogHelper()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: RTSLayerSelectedLogHelper

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonSeps: CommonSeps = CommonSeps.getInstance()!!

    private val positionStrings: PositionStrings = PositionStrings.getInstance()!!

    private val TRACKTO_TURNTO: String = "trackTo:turnTo"

open fun setClosestGeographicMapCellHistory(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, pathsList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
    //var pathsList = pathsList

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(associatedAdvancedRTSGameLayer!!.getName())
stringBuffer!!.append(this.commonSeps!!.SPACE)
stringBuffer!!.append(CommonLabels.getInstance()!!.START)
stringBuffer!!.append(pathsList!!.size())
stringBuffer!!.append(" -> ")
stringBuffer!!.append(StringUtil.getInstance()!!.toString(pathsList))
logUtil!!.put(stringBuffer!!.toString(), this, "selected: setClosestGeographicMapCellHistory")
}


open fun trackTo(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, nextUnvisitedPathGeographicMapCellPosition: GeographicMapCellPosition, dx: Int, dy: Int, reason: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
    //var nextUnvisitedPathGeographicMapCellPosition = nextUnvisitedPathGeographicMapCellPosition
    //var dx = dx
    //var dy = dy
    //var reason = reason

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(associatedAdvancedRTSGameLayer!!.getName())
stringBuffer!!.append(this.commonSeps!!.SPACE)
stringBuffer!!.append(StringUtil.getInstance()!!.toString(nextUnvisitedPathGeographicMapCellPosition))
stringBuffer!!.append(positionStrings!!.DX_LABEL)
stringBuffer!!.append(dx)
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(positionStrings!!.DY_LABEL)
stringBuffer!!.append(dy)
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(reason)
logUtil!!.put(stringBuffer!!.toString(), this, "selected: trackTo")
}


open fun turnTo(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, dx: Int, dy: Int, angleInfo: AngleInfo, angle: Int, movementAngle: NamedAngle, evading: Boolean, targetAngle: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
    //var dx = dx
    //var dy = dy
    //var angleInfo = angleInfo
    //var angle = angle
    //var movementAngle = movementAngle
    //var evading = evading
var targetAngle = targetAngle

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(associatedAdvancedRTSGameLayer!!.getName())
stringBuffer!!.append(" steering - ")
stringBuffer!!.append(positionStrings!!.DX_LABEL)
stringBuffer!!.append(dx)
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(positionStrings!!.DY_LABEL)
stringBuffer!!.append(dy)
stringBuffer!!.append(" angle: ")
stringBuffer!!.append(angle)
stringBuffer!!.append(" movementAngle: ")
stringBuffer!!.append(movementAngle!!.name)
stringBuffer!!.append(commonSeps!!.FORWARD_SLASH)
stringBuffer!!.append(movementAngle!!.getValue())

    
                        if(angleInfo != 
                                    null
                                )
                        
                                    {
                                    
    var angleIncrement: Int = angleInfo!!.getAngleIncrementInfo()!!.getAngleIncrement()!!

stringBuffer!!.append(" angleIncrement: ")
stringBuffer!!.append(angleIncrement)

                                    }
                                
stringBuffer!!.append(" Evading: ")
stringBuffer!!.append(evading)
logUtil!!.put(stringBuffer!!.toString(), this, TRACKTO_TURNTO)
}


open fun doneMoving(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
logUtil!!.put(StringMaker().
                            append(associatedAdvancedRTSGameLayer!!.getName())!!.append(" steering - done moving 0,0")!!.toString(), this, TRACKTO_TURNTO)
}


open fun closeEnough(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
logUtil!!.put(StringMaker().
                            append(associatedAdvancedRTSGameLayer!!.getName())!!.append(" steering - close enough")!!.toString(), this, TRACKTO_TURNTO)
}


open fun movingLeft(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
logUtil!!.put(StringMaker().
                            append(associatedAdvancedRTSGameLayer!!.getName())!!.append(" steering - allow movingLeft")!!.toString(), this, TRACKTO_TURNTO)
}


open fun movingRight(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
logUtil!!.put(StringMaker().
                            append(associatedAdvancedRTSGameLayer!!.getName())!!.append(" steering - allow movingRight")!!.toString(), this, TRACKTO_TURNTO)
}


open fun movingUp(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
logUtil!!.put(StringMaker().
                            append(associatedAdvancedRTSGameLayer!!.getName())!!.append(" steering - allow movingUp")!!.toString(), this, TRACKTO_TURNTO)
}


open fun movingDown(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
logUtil!!.put(StringMaker().
                            append(associatedAdvancedRTSGameLayer!!.getName())!!.append(" steering - allow movingDown")!!.toString(), this, TRACKTO_TURNTO)
}


open fun currentMoveEnded(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
logUtil!!.put(StringMaker().
                            append(associatedAdvancedRTSGameLayer!!.getName())!!.append(" steering - correct angle, but movement not needed for current deltas so reseting movement angle")!!.toString(), this, TRACKTO_TURNTO)
}


open fun evade(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
logUtil!!.put(StringMaker().
                            append(associatedAdvancedRTSGameLayer!!.getName())!!.append(" steering - evade")!!.toString(), this, TRACKTO_TURNTO)
}


open fun rotateLeft(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
logUtil!!.put(StringMaker().
                            append(associatedAdvancedRTSGameLayer!!.getName())!!.append(" steering - rotating left")!!.toString(), this, TRACKTO_TURNTO)
}


open fun rotateRight(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
logUtil!!.put(StringMaker().
                            append(associatedAdvancedRTSGameLayer!!.getName())!!.append(" steering - rotating right")!!.toString(), this, TRACKTO_TURNTO)
}


open fun handle(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, movementAngle: NamedAngle)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
    //var movementAngle = movementAngle
logUtil!!.put(StringMaker().
                            append(associatedAdvancedRTSGameLayer!!.getName())!!.append(" steering - movementAngle: ")!!.append(movementAngle!!.name)!!.append(commonSeps!!.FORWARD_SLASH)!!.append(movementAngle!!.getValue())!!.toString(), this, TRACKTO_TURNTO)
}


open fun noRotation(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
logUtil!!.put(StringMaker().
                            append(associatedAdvancedRTSGameLayer!!.getName())!!.append(" steering - Do not rotate")!!.toString(), this, TRACKTO_TURNTO)
}


open fun notOnPath(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, geographicMapCellHistory: GeographicMapCellHistory, currentGeographicMapCellPosition: GeographicMapCellPosition, pathList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
    //var geographicMapCellHistory = geographicMapCellHistory
    //var currentGeographicMapCellPosition = currentGeographicMapCellPosition
    //var pathList = pathList

    var stringUtil: StringUtil = StringUtil.getInstance()!!

logUtil!!.put(StringMaker().
                            append(associatedAdvancedRTSGameLayer!!.getName())!!.append(' ')!!.append(geographicMapCellHistory!!.getTotalVisited())!!.append(' ')!!.append(stringUtil!!.toString(currentGeographicMapCellPosition))!!.append(" - trying to move but not on path: ")!!.append(stringUtil!!.toString(pathList))!!.toString(), this, "turnTo")
}


}
                
            

