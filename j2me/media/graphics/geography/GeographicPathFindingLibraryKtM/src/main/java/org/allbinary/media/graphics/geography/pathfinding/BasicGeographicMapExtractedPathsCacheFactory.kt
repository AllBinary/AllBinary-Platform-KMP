
        /* Generated Code Do Not Modify */
        package org.allbinary.media.graphics.geography.pathfinding




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.BasicArrayList
import org.allbinary.logic.util.cache.BaseBasicArrayListCache
import org.allbinary.media.graphics.geography.pathfinding.BasicGeographicMapExtractedPathCacheFactory

open public class BasicGeographicMapExtractedPathsCacheFactory : BaseBasicArrayListCache {
        

        companion object {
            
    private val instance: BasicGeographicMapExtractedPathsCacheFactory = BasicGeographicMapExtractedPathsCacheFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BasicGeographicMapExtractedPathsCacheFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private var maxConcurrentPaths: Int= 0

    private var maxPaths: Int= 0
private constructor        (){}


open fun init(maxConcurrentPaths: Int, maxPaths: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var maxConcurrentPaths = maxConcurrentPaths


                    var maxPaths = maxPaths

    
                        if(maxConcurrentPaths != this.maxConcurrentPaths)
                        
                                    {
                                    



                        for (index in maxConcurrentPaths downTo this.maxConcurrentPaths)


        {this.list.add(BasicArrayList(maxPaths))
}

this.maxConcurrentPaths= maxConcurrentPaths

                                    }
                                
this.maxPaths= maxPaths
}


open fun getPaths()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{
    
                        if(this.list.size() > 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.list.remove(0) as BasicArrayList

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicArrayList(this.maxPaths)

                        }
                            
}


open fun release(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var list = list




                        for (index in list.size() -1 downTo 0)


        {BasicGeographicMapExtractedPathCacheFactory.getInstance()!!.release(list.get(index) as BasicArrayList)
}

list.clear()
this.list.add(list)
}


}
                
            

