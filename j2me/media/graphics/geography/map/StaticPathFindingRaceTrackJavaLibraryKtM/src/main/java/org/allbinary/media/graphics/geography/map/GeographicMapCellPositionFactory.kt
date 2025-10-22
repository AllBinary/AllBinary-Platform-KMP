
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
            
    override fun getInstance(geographicMapInterface: BasicGeographicMap)
        //nullable =  from not(true or (false and false)) = 
: BasicGeographicMapCellPositionFactory{
    //var geographicMapInterface = geographicMapInterface

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


    var allBinaryTiledLayer: AllBinaryTiledLayer = geographicMapInterface!!.getAllBinaryTiledLayer()!!


    var geographicMapCellPositionFactoryCanBeNull: Any? = hashtable.get(allBinaryTiledLayer!!.getDataId())


    
                        if(geographicMapCellPositionFactoryCanBeNull == 
                                    null
                                )
                        
                                    {
                                    logUtil!!.put(StringMaker().
                            append("Creating GeographicMapCellPositionFactory for TileLayer: ")!!.append(allBinaryTiledLayer!!.getDataId()!!.toInt())!!.toString(), this, commonStrings!!.GET_INSTANCE)
geographicMapCellPositionFactoryCanBeNull= BasicGeographicMapCellPositionFactory(geographicMapInterface)
hashtable.put(allBinaryTiledLayer!!.getDataId(), geographicMapCellPositionFactoryCanBeNull)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPositionFactoryCanBeNull as BasicGeographicMapCellPositionFactory

                                    }
                                
                        else {
                            logUtil!!.put(StringMaker().
                            append("Reusing GeographicMapCellPositionFactory for TileLayer: ")!!.append(allBinaryTiledLayer!!.getDataId()!!.toInt())!!.toString(), this, commonStrings!!.GET_INSTANCE)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPositionFactoryCanBeNull as BasicGeographicMapCellPositionFactory

                        }
                            
}


}
                
            

