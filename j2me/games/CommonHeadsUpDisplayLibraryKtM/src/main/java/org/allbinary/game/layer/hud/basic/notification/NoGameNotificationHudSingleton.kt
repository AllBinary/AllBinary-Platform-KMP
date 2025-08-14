
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
        package org.allbinary.game.layer.hud.basic.notification




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.graphics.hud.BasicHudFactory
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class NoGameNotificationHudSingleton
            : Object
         {
        

        companion object {
            
    private val instance: NoGameNotificationHudSingleton = NoGameNotificationHudSingleton()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: NoGameNotificationHudSingleton{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var gameNotificationHud: GameNotificationHud = GameNotificationHud.NULL_GAME_NOTIFICATION
private constructor        ()
            : super()
        {
        try {
            
    var basicHudFactory: BasicHudFactory = BasicHudFactory.getInstance()!!
            

this.gameNotificationHud= GameNotificationHud(basicHudFactory!!.TOPCENTER, basicHudFactory!!.HORIZONTAL, 14, 40, 2, BasicColorFactory.getInstance()!!.RED)
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR, e)
}

}


open fun getGameNotificationHud()
        //nullable = true from not(false or (false and true)) = true
: GameNotificationHud{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameNotificationHud
}


}
                
            

