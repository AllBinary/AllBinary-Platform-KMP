
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.GameInfo
import org.allbinary.game.input.NullPlayerGameInputComposite
import org.allbinary.game.input.PlayerGameInputCompositeInterface
import org.allbinary.graphics.ItemColorFactory
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.layer.LayerProcessor
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.util.BasicArrayList

open public class AllBinaryGameLayerManager : AllBinaryLayerManager {
        

        companion object {


    val NULL_ALLBINARY_LAYER_MANAGER: AllBinaryGameLayerManager = AllBinaryGameLayerManager(BasicColorFactory.getInstance()!!.BLACK, BasicColorFactory.getInstance()!!.WHITE, GameInfo.NONE)

    val ID: Integer = SmallIntegerSingletonFactory.getInstance()!!.getInstance(22)!!
            


        }
            
    private var backgroundBasicColor: BasicColor

    private var foregroundBasicColor: BasicColor

    private var gameInfo: GameInfo

    private var playerGameInputCompositeInterface: PlayerGameInputCompositeInterface = NullPlayerGameInputComposite.NULL_PLAYER_GAME_INPUT_COMPOSITE
public constructor        (backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor, gameInfo: GameInfo){

                    var backgroundBasicColor = backgroundBasicColor


                    var foregroundBasicColor = foregroundBasicColor


                    var gameInfo = gameInfo
this.backgroundBasicColor= backgroundBasicColor
this.foregroundBasicColor= foregroundBasicColor

    var itemColorFactory: ItemColorFactory = ItemColorFactory.getInstance()!!
            

itemColorFactory!!.INVERT_PAINT= this.backgroundBasicColor!!.toInt()
itemColorFactory!!.PAINT= this.foregroundBasicColor!!.toInt()
this.gameInfo= gameInfo
}


open fun getLayerManager()
        //nullable = true from not(false or (false and true)) = true
: AllBinaryLayerManager{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this
}


open fun init()
        //nullable = true from not(false or (false and true)) = true
{}


open fun getBackgroundBasicColor()
        //nullable = true from not(false or (false and true)) = true
: BasicColor{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return backgroundBasicColor
}


open fun setBackgroundBasicColor(backgroundBasicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{

                    var backgroundBasicColor = backgroundBasicColor
this.backgroundBasicColor= backgroundBasicColor
ItemColorFactory.getInstance()!!.INVERT_PAINT= this.backgroundBasicColor!!.toInt()
}


open fun getForegroundBasicColor()
        //nullable = true from not(false or (false and true)) = true
: BasicColor{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return foregroundBasicColor
}


open fun setForegroundBasicColor(foregroundBasicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{

                    var foregroundBasicColor = foregroundBasicColor
this.foregroundBasicColor= foregroundBasicColor
ItemColorFactory.getInstance()!!.PAINT= this.foregroundBasicColor!!.toInt()
}


open fun getGameInfo()
        //nullable = true from not(false or (false and true)) = true
: GameInfo{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameInfo
}


open fun setGameInfo(gameInfo: GameInfo)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameInfo = gameInfo
this.gameInfo= gameInfo
}


open fun setLayerProcessorList(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var list = list

    var layerProcessorInterfaceArray: Array<LayerProcessor?> = arrayOfNulls(list!!.size())


    var size: Int = layerProcessorInterfaceArray!!.size
                





                        for (index in 0 until size)


        {layerProcessorInterfaceArray[index]= list!!.objectArray[index]!! as LayerProcessor
}

this.setLayerProcessorArray(layerProcessorInterfaceArray)
}


open fun setPlayerGameInputCompositeInterface(playerGameInputCompositeInterface: PlayerGameInputCompositeInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var playerGameInputCompositeInterface = playerGameInputCompositeInterface
this.playerGameInputCompositeInterface= playerGameInputCompositeInterface
}


open fun getPlayerGameInputCompositeInterface()
        //nullable = true from not(false or (false and true)) = true
: PlayerGameInputCompositeInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return playerGameInputCompositeInterface
}


}
                
            

