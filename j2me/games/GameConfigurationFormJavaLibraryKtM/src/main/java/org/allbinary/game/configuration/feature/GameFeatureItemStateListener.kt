
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
        package org.allbinary.game.configuration.feature



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.ChoiceGroup
import javax.microedition.lcdui.Item
import javax.microedition.lcdui.ItemStateListener
import org.allbinary.game.configuration.GameConfigurationGauge
import org.allbinary.game.configuration.GameConfigurationUtil
import org.allbinary.game.configuration.GameOptionsForm
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class GameFeatureItemStateListener
            : Object
        
                , ItemStateListener {
        

        companion object {
            
    private var toggleList: BasicArrayList = BasicArrayList()

open fun add(gameFeature: GameFeature)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameFeature = gameFeature

    
                        if(!GameFeatureItemStateListener.toggleList!!.contains(gameFeature))
                        
                                    {
                                    GameFeatureItemStateListener.toggleList!!.add(gameFeature)

                                    }
                                
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var gameOptionsForm: GameOptionsForm
public constructor        (gameOptionsForm: GameOptionsForm)
            : super()
        {

                    var gameOptionsForm = gameOptionsForm
this.gameOptionsForm= gameOptionsForm

    var gameFeatureFactory: GameFeatureFactory = GameFeatureFactory.getInstance()!!
            

GameFeatureItemStateListener.add(gameFeatureFactory!!.ARTIFICIAL_INTELLEGENCE_PROCESSOR)
GameFeatureItemStateListener.add(gameFeatureFactory!!.COLLIDABLE_INTERFACE_LAYER_PROCESSOR)
GameFeatureItemStateListener.add(gameFeatureFactory!!.DAMAGE_FLOATERS)
GameFeatureItemStateListener.add(gameFeatureFactory!!.DROPPED_ITEMS)
GameFeatureItemStateListener.add(gameFeatureFactory!!.GAME_INPUT_LAYER_PROCESSOR)
GameFeatureItemStateListener.add(gameFeatureFactory!!.HEALTH_BARS)
GameFeatureItemStateListener.add(gameFeatureFactory!!.SOUND)
GameFeatureItemStateListener.add(gameFeatureFactory!!.TICKABLE_LAYER_PROCESSOR)
}

override fun itemStateChanged(item: Item)
        //nullable = true from not(false or (false and false)) = true
{

                    var item = item

        try {
            
    var itemLabel: String = item.getLabel()!!
            

logUtil!!.put(StringMaker().
                            append(CommonLabels.getInstance()!!.ITEM_LABEL)!!.append(itemLabel)!!.toString(), this, 
                            "itemStateChanged")

    
                        if(item is GameConfigurationGauge)
                        
                                    {
                                    GameConfigurationUtil.getInstance()!!.change(this.gameOptionsForm, item as GameConfigurationGauge)

                                    }
                                
                             else 
    
                        if(item is ChoiceGroup)
                        
                                    {
                                    
    var gameFeatureUtil: GameFeatureUtil = GameFeatureUtil.getInstance()!!
            


    
                        if(gameFeatureUtil!!.isExclusive(itemLabel))
                        
                                    {
                                    gameFeatureUtil!!.updateExclusive(item as ChoiceGroup)

                                    }
                                
                        else {
                            gameFeatureUtil!!.updateMultiple(item as ChoiceGroup)

                        }
                            

                                    }
                                
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "itemStateChanged", e)
}

}


}
                
            

