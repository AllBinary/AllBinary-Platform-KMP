
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
        package org.allbinary.logic.visual.media




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap

open public class MediaData
            : Object
         {
        

        companion object {
            
    private var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

                @Throws(Exception::class)
            
open fun get(a_Name: String)
        //nullable = true from not(false or (false and false)) = true
: MediaData{

                    var a_Name = a_Name

    var mediaData: MediaData = MediaData.hashMap!!.get(a_Name as Object?) as MediaData


    
                        if(mediaData != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return mediaData

                                    }
                                
                        else {
                            


                            throw Exception("No Such MediaData")

                        }
                            
}


open fun getDefault()
        //nullable = true from not(false or (false and true)) = true
: MediaData{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return MediaDataFactory.getInstance()!!.JPG
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return MediaData.hashMap
}


        }
            
    private var name: String

    private var type: String

    private var extension: String
protected constructor        (a_Name: String)
            : super()
        {

                    var a_Name = a_Name
this.name= a_Name
this.extension= "." +this.name
this.type= MediaTypeData.getInstance()!!.NOT_RESIZABLE_MEDIA
MediaData.hashMap!!.put(a_Name, this)
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.name
}


open fun getType()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.type
}


open fun getExtension()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.extension
}


open fun isConvertableTo(mediaData: MediaData)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var mediaData = mediaData

    
                        if(this == MediaDataFactory.getInstance()!!.GIF && mediaData == MediaDataFactory.getInstance()!!.JPG)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getName()
}


}
                
            

