
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
        package org.allbinary.media.graphics.geography.map




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.logic.string.StringMaker

open public class GeographicMapCellPositionFactory : GeographicMapCellPositionBaseFactory {
        

        companion object {
            
    private val hashtable: Hashtable<Any, Any> = Hashtable<Any, Any>()

open fun getHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashtable
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

                @Throws(Exception::class)
            
open fun getInstance(geographicMapInterface: BasicGeographicMap)
        //nullable =  from not(true or (false and false)) = 
: BasicGeographicMapCellPositionFactory{

                    var geographicMapInterface = geographicMapInterface

    var allBinaryTiledLayer: AllBinaryTiledLayer = geographicMapInterface!!.getAllBinaryTiledLayer()!!


    var geographicMapCellPositionFactory: BasicGeographicMapCellPositionFactory = hashtable.get(allBinaryTiledLayer!!.getDataId()) as BasicGeographicMapCellPositionFactory


    
                        if(geographicMapCellPositionFactory != 
                                    null
                                )
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(StringMaker().
                            append("Reusing GeographicMapCellPositionFactory for TileLayer: ")!!.append(allBinaryTiledLayer!!.getDataId())!!.toString(), this, commonStrings!!.GET_INSTANCE)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPositionFactory

                                    }
                                
                        else {
                            
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(StringMaker().
                            append("Creating GeographicMapCellPositionFactory for TileLayer: ")!!.append(allBinaryTiledLayer!!.getDataId())!!.toString(), this, commonStrings!!.GET_INSTANCE)
geographicMapCellPositionFactory= BasicGeographicMapCellPositionFactory(geographicMapInterface)
hashtable.put(allBinaryTiledLayer!!.getDataId(), geographicMapCellPositionFactory)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPositionFactory

                        }
                            
}


}
                
            

