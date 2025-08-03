
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2006 AllBinary 
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
        package org.allbinary.game.layer.unit



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.resources.BasicGameResources
import org.allbinary.game.layer.resources.GameGraphicsResourceUtil
import org.allbinary.AndroidUtil
import org.allbinary.game.configuration.feature.GraphicsFeatureFactory

open public class Unit1DecalGameResources : BasicGameResources {
        

        companion object {


    private val instance: Unit1DecalGameResources = Unit1DecalGameResources()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BasicGameResources{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            private constructor        (){
    var ROOT: String = "/unit_decal"


    var SMALL: String = "_20_by_20.png"


    var MEDIUM: String = SMALL


    var SIZE_FOUR: String = SMALL


    var SIZE_FIVE: String = SMALL


    var SIZE_SIX: String = SMALL


    var SIZE: Array<String?> = arrayOf(SMALL,MEDIUM,SIZE_FOUR,SIZE_FIVE,SIZE_SIX)

super.init(ROOT, SIZE)
}


                @Throws(Exception::class)
            
open fun init(ROOT: String, sizeString: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var ROOT = ROOT


                    var sizeString = sizeString
super.init(ROOT, sizeString)
}


                @Throws(Exception::class)
            
open fun getString()
        //nullable = true from not(false or (false and true)) = true
: String{
    
                        if(AndroidUtil.isAndroid())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GameGraphicsResourceUtil.getInstance()!!.getString(GraphicsFeatureFactory.getInstance()!!.SPRITE_QUARTER_ROTATION_GRAPHICS)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.getString()

                        }
                            
}


}
                
            

