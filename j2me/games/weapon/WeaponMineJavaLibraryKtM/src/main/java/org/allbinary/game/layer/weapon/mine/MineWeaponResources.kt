
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
        package org.allbinary.game.layer.weapon.mine



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.resources.BasicGameResources

open public class MineWeaponResources : BasicGameResources {
        

        companion object {
            
    private val SINGLETON: MineWeaponResources = MineWeaponResources()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: MineWeaponResources{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
    val DROP_TEXT_RESOURCE: String = "/mine_drop_text_20_by_20.png"

    val DROP_RESOURCE: String = "/mine_drop_20_by_20.png"

    val DROP_ICON_RESOURCE: String = "/mine_drop_icon_20_by_20.png"
protected constructor        (){
    var ROOT: String = "/mine"


    var SMALL: String = "_20_by_20.png"


    var MEDIUM: String = SMALL


    var SIZE_FOUR: String = SMALL


    var SIZE_FIVE: String = SMALL


    var SIZE_SIX: String = SMALL


    var SIZE: Array<String?> = arrayOf(SMALL,MEDIUM,SIZE_FOUR,SIZE_FIVE,SIZE_SIX)

super.init(ROOT, SIZE)
}


}
                
            

