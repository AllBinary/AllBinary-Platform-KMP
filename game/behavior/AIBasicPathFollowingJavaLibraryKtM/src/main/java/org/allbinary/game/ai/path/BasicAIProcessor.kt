
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
        package org.allbinary.game.ai.path



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.BasicArrayList
import org.allbinary.direction.Direction
import org.allbinary.direction.DirectionFactory
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.math.AngleInfo
import org.allbinary.media.graphics.geography.map.GeographicMapCellHistory
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.GeographicMapDirectionUtil
import org.allbinary.media.graphics.geography.pathfinding.GeographicMapCellPathHistoryInfo

open public class BasicAIProcessor
            : Object
         {
        

    private var name: String

    private var geographicMapCellHistory: GeographicMapCellHistory

    private var geographicMapCellPositionBasicArrayList: BasicArrayList

    private var geographicMapCellPathHistoryInfo: GeographicMapCellPathHistoryInfo = 
                null
            

    private var basicAI: BasicDirectionAIHelper
public constructor        (name: String, geographicMapCellHistory: GeographicMapCellHistory, chosenPathList: BasicArrayList, angleInfo: AngleInfo, seed: Int)
            : super()
        {

                    var name = name


                    var geographicMapCellHistory = geographicMapCellHistory


                    var chosenPathList = chosenPathList


                    var angleInfo = angleInfo


                    var seed = seed
this.setName(name)
this.setNewPath(geographicMapCellHistory, chosenPathList)
this.basicAI= BasicDirectionAIHelper(this.getName(), angleInfo)
}


open fun setNewPath(geographicMapCellHistory: GeographicMapCellHistory, chosenPathList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var geographicMapCellHistory = geographicMapCellHistory


                    var chosenPathList = chosenPathList
this.setGeographicMapCellHistory(geographicMapCellHistory)
this.geographicMapCellPositionBasicArrayList= chosenPathList
this.init()
}


open fun init()
        //nullable = true from not(false or (false and true)) = true
{this.geographicMapCellPathHistoryInfo= GeographicMapCellPathHistoryInfo()
this.geographicMapCellPathHistoryInfo!!.setPreviousOnPathGeographicMapCellPosition(geographicMapCellPositionBasicArrayList!!.get(geographicMapCellPositionBasicArrayList!!.size() -1) as GeographicMapCellPosition)
this.geographicMapCellPathHistoryInfo!!.setNextOnPathGeographicMapCellPosition(geographicMapCellPositionBasicArrayList!!.get(geographicMapCellPositionBasicArrayList!!.size() -1) as GeographicMapCellPosition)
this.update()
}


    private val geographicMapDirectionUtil: GeographicMapDirectionUtil = GeographicMapDirectionUtil.getInstance()!!
            

                @Throws(Exception::class)
            
open fun goTowardNextChosenOnPathPosition(currentGeographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var currentGeographicMapCellPosition = currentGeographicMapCellPosition

    var keyDirection: Int =  -1


    var goToGeographicMapCellPosition: GeographicMapCellPosition = this.geographicMapCellPathHistoryInfo!!.getNextChosenOnPathGeographicMapCellPosition()!!
            


    var geographicMapDirectionData: Direction = geographicMapDirectionUtil!!.getDirectionFromCellPositionToAdjacentCellPosition(currentGeographicMapCellPosition, goToGeographicMapCellPosition)!!
            


    
                        if(geographicMapDirectionData == DirectionFactory.getInstance()!!.NOT_BORDERED_WITH)
                        
                                    {
                                    geographicMapDirectionData= geographicMapDirectionUtil!!.getDirectionFromCellPositionToCellPosition(currentGeographicMapCellPosition, goToGeographicMapCellPosition)

                                    }
                                
keyDirection= this.basicAI!!.getAIKeyPressedFromDirection(geographicMapDirectionData)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyDirection
}


open fun update()
        //nullable = true from not(false or (false and true)) = true
{this.geographicMapCellPathHistoryInfo!!.setNextUnvisitedOnPathGeographicMapCellPosition(this.getGeographicMapCellHistory()!!.getFirstUnvisited())
this.geographicMapCellPathHistoryInfo!!.setNextChosenOnPathGeographicMapCellPosition(this.geographicMapCellPathHistoryInfo!!.getNextUnvisitedOnPathGeographicMapCellPosition())
}


                @Throws(Exception::class)
            
open fun processAI(myManager: AllBinaryLayerManager, currentGeographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var myManager = myManager


                    var currentGeographicMapCellPosition = currentGeographicMapCellPosition

    var keyDirection: Int =  -1


    
                        if(this.geographicMapCellPositionBasicArrayList!!.contains(currentGeographicMapCellPosition))
                        
                                    {
                                    this.update()
keyDirection= this.goTowardNextChosenOnPathPosition(currentGeographicMapCellPosition)
this.geographicMapCellPathHistoryInfo!!.setPreviousOnPathGeographicMapCellPosition(currentGeographicMapCellPosition)

                                    }
                                
                        else {
                            keyDirection= this.goTowardNextChosenOnPathPosition(currentGeographicMapCellPosition)

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return keyDirection
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}


open fun setName(name: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var name = name
this.name= name
}


open fun getGeographicMapCellPathHistoryInfo()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPathHistoryInfo{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPathHistoryInfo
}


open fun setGeographicMapCellPathHistoryInfo(geographicMapCellPathHistoryInfo: GeographicMapCellPathHistoryInfo)
        //nullable = true from not(false or (false and false)) = true
{

                    var geographicMapCellPathHistoryInfo = geographicMapCellPathHistoryInfo
this.geographicMapCellPathHistoryInfo= geographicMapCellPathHistoryInfo
}


open fun getGeographicMapCellHistory()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellHistory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellHistory
}


open fun setGeographicMapCellHistory(geographicMapCellHistory: GeographicMapCellHistory)
        //nullable = true from not(false or (false and false)) = true
{

                    var geographicMapCellHistory = geographicMapCellHistory
this.geographicMapCellHistory= geographicMapCellHistory
}


}
                
            

