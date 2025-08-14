
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
        package org.allbinary.game.layer.hud.basic.score




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.hud.basic.NumberStringHud
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.font.MyFont

open public class ScoreHudWidget : NumberStringHud {
        
public constructor        (maxscore: Int, location: Int, direction: Int, maxHeight: Int, maxWidth: Int, bufferZone: Int, basicColor: BasicColor)                        

                            : super(
                            "Pts ", maxscore, location, direction, maxHeight, maxWidth, bufferZone, basicColor){

                    var maxscore = maxscore


                    var location = location


                    var direction = direction


                    var maxHeight = maxHeight


                    var maxWidth = maxWidth


                    var bufferZone = bufferZone


                    var basicColor = basicColor


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (maxscore: Int, location: Int, direction: Int, maxWidth: Int)                        

                            : this(maxscore, location, direction, 14, maxWidth, 2, BasicColorFactory.getInstance()!!.GREY){

                    var maxscore = maxscore


                    var location = location


                    var direction = direction


                    var maxWidth = maxWidth


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (maxscore: Int, location: Int, direction: Int)                        

                            : this(maxscore, location, direction, 14, MyFont.getInstance()!!.getSize() *5, 2, BasicColorFactory.getInstance()!!.GREY){

                    var maxscore = maxscore


                    var location = location


                    var direction = direction


                            //For kotlin this is before the body of the constructor.
                    
}


}
                
            

