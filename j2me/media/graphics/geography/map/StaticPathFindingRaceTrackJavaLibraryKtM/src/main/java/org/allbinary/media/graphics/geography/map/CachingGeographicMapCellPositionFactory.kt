
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
import org.allbinary.graphics.CellPosition

open public class CachingGeographicMapCellPositionFactory : BasicGeographicMapCellPositionFactory {
        
protected constructor (geographicMapInterface: BasicGeographicMap)                        

                            : super(geographicMapInterface){
var geographicMapInterface = geographicMapInterface


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
    override fun createInstance(i_column: Int, i_row: Int, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellPosition{
    //var i_column = i_column
    //var i_row = i_row
    //var width = width
    //var height = height

    var hashtable: Hashtable<Any, Any> = GeographicMapCellPositionFactory.getHashtable()!!


    var cellPositionKey: String = CellPosition.toString(i_column, i_row)!!


    var cellPositionCanBeNull: Any? = hashtable.get(cellPositionKey as Object)


    
                        if(cellPositionCanBeNull == 
                                    null
                                )
                        
                                    {
                                    cellPositionCanBeNull= this.geographicMapCellPositionFactoryInterface!!.getInstance(this.geographicMapInterface, i_column, i_row, this.getColumns(), this.getRows(), width, height)
geographicMapCellPositionArray[i_row]!![i_column]= cellPositionCanBeNull as GeographicMapCellPosition
hashtable.put(cellPositionKey, cellPositionCanBeNull)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cellPositionCanBeNull as GeographicMapCellPosition
}


}
                
            

