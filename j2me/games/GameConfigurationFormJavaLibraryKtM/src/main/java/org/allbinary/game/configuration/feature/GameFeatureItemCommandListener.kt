
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Command
import javax.microedition.lcdui.Item
import javax.microedition.lcdui.ItemCommandListener
import org.allbinary.game.configuration.GameConfigurationGauge
import org.allbinary.game.configuration.GameConfigurationUtil
import org.allbinary.game.configuration.GameOptionsForm
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.midlet.MidletStrings
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings

open public class GameFeatureItemCommandListener
            : Object
        
                , ItemCommandListener {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var gameOptionsForm: GameOptionsForm
public constructor        (gameOptionsForm: GameOptionsForm)
            : super()
        {

                    var gameOptionsForm = gameOptionsForm
this.gameOptionsForm= gameOptionsForm
}

override fun commandAction(command: Command, item: Item)
        //nullable = true from not(false or (false and false)) = true
{

                    var command = command


                    var item = item

        try {
            
    var itemLabel: String = item.getLabel()!!
            

logUtil!!.put(StringMaker().
                            append(CommonLabels.getInstance()!!.ITEM_LABEL)!!.append(itemLabel)!!.toString(), this, MidletStrings.getInstance()!!.COMMAND_ACTION)

    
                        if(item is GameConfigurationGauge)
                        
                                    {
                                    GameConfigurationUtil.getInstance()!!.change(this.gameOptionsForm, item as GameConfigurationGauge)

                                    }
                                
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, MidletStrings.getInstance()!!.COMMAND_ACTION, e)
}

}


}
                
            

