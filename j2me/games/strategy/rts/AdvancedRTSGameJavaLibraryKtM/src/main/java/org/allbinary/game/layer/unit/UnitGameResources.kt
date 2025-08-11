
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

open public class UnitGameResources : BasicGameResources {
        

        companion object {


    private val ICON: String = "_icon"

    private val BUILD: String = "_build"

    private val DESTROY: String = "_destroy"

    private val ICON_BUILD: String = "_icon" +BUILD


        }
            
    var NAME: String

    var RESOURCE_ICON_ANIMATION: String

    var RESOURCE_ICON_BUILD: String

    var RESOURCE_ICON: String
protected constructor        (){}


    private val ICON_SIZE: String = "_64_by_64.png"

                @Throws(Exception::class)
            
open fun init(ROOT: String, sizeString: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var ROOT = ROOT


                    var sizeString = sizeString
super.init(ROOT, sizeString)

    var string: String = GameGraphicsResourceUtil.getInstance()!!.getName()!!
            

stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(ROOT)
stringBuffer!!.append(DESTROY)
stringBuffer!!.append(string)
stringBuffer!!.append(sizeString)
this.RESOURCE_DESTROY= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(ICON)
stringBuffer!!.append(ROOT)
this.RESOURCE_ICON_ANIMATION= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(ROOT)
stringBuffer!!.append(ICON)
stringBuffer!!.append(string)
stringBuffer!!.append(ICON_SIZE)
this.RESOURCE_ICON= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(ROOT)
stringBuffer!!.append(ICON_BUILD)
stringBuffer!!.append(string)
stringBuffer!!.append(ICON_SIZE)
this.RESOURCE_ICON_BUILD= stringBuffer!!.toString()
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
                
            

