
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
        package org.allbinary.game.terrain




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.NullUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.util.event.AllBinaryEventObject

open public class TerrainEvent : AllBinaryEventObject {
        

    private var basicTerrainInfo: BasicTerrainInfo = BasicTerrainInfo.NULL_BASIC_TERRAIN_INFO
public constructor        ()                        

                            : super(NullUtil.getInstance()!!.NULL_OBJECT){

                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (basicTerrainInfo: BasicTerrainInfo)                        

                            : super(basicTerrainInfo){

                    var basicTerrainInfo = basicTerrainInfo


                            //For kotlin this is before the body of the constructor.
                    
this.setBasicTerrainInfo(basicTerrainInfo)
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "TerrainEvent: \n")
stringBuffer!!.append(
                            "LayerInterface: ")
stringBuffer!!.append(this.basicTerrainInfo!!.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun getBasicTerrainInfo()
        //nullable = true from not(false or (false and true)) = true
: BasicTerrainInfo{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basicTerrainInfo
}


open fun setBasicTerrainInfo(basicTerrainInfo: BasicTerrainInfo)
        //nullable = true from not(false or (false and false)) = true
{

                    var basicTerrainInfo = basicTerrainInfo
this.basicTerrainInfo= basicTerrainInfo
}


open fun setBasicTerrainInfoForCircularStaticPool(basicTerrainInfo: BasicTerrainInfo)
        //nullable = true from not(false or (false and false)) = true
{

                    var basicTerrainInfo = basicTerrainInfo
this.basicTerrainInfo= basicTerrainInfo
}


}
                
            

