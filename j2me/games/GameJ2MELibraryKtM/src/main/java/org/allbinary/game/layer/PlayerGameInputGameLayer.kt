
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
        
import javax.microedition.lcdui.Graphics
import org.allbinary.game.input.PlayerGameInput
import org.allbinary.game.input.PlayerGameInputCompositeInterface
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.displayable.CanvasStrings
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.view.StaticViewPosition

open public class PlayerGameInputGameLayer : AllBinaryGameLayer
                , PlayerGameInputCompositeInterface {
        

    private var playerGameInput: PlayerGameInput
public constructor        (playerInputId: Int)                        

                            : super(Rectangle(PointFactory.getInstance()!!.ZERO_ZERO, 0, 0), StaticViewPosition(0, 0, 0)){

                    var playerInputId = playerInputId


                            //For kotlin this is before the body of the constructor.
                    
this.playerGameInput= PlayerGameInput(this.getGameKeyEventList(), playerInputId)

    var canvasStrings: CanvasStrings = CanvasStrings.getInstance()!!
            

logUtil!!.put(
                            "Danger Danger Danger: Should Not Be Called Except For Testing Input", this, canvasStrings!!.PAINT)
}

override fun getPlayerGameInput()
        //nullable = true from not(false or (false and true)) = true
: PlayerGameInput{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.playerGameInput
}

override fun initInputProcessors()
        //nullable = true from not(false or (false and true)) = true
{}


                @Throws(Exception::class)
            override fun processInput(myManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var myManager = myManager
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
}


}
                
            

