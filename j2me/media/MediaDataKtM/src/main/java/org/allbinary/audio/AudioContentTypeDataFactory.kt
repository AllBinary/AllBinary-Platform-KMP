
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
        package org.allbinary.audio



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class AudioContentTypeDataFactory
            : Object
         {
        

        companion object {


    private val instance: AudioContentTypeDataFactory = AudioContentTypeDataFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AudioContentTypeDataFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
    val MIME_AUDIO_TONE: AudioContentTypeData = AudioContentTypeData(
                            "audio/x-tone-seq")

    val MIME_AUDIO_AMR: AudioContentTypeData = AudioContentTypeData(
                            "audio/amr")

    val MIME_AUDIO_AMR_WB: AudioContentTypeData = AudioContentTypeData(
                            "audio/amr-wb")

    val MIME_AUDIO_WAV: AudioContentTypeData = AudioContentTypeData(
                            "audio/x-wav")

    val MIME_AUDIO_MIDI: AudioContentTypeData = AudioContentTypeData(
                            "audio/midi")

    val MIME_AUDIO_SP_MIDI: AudioContentTypeData = AudioContentTypeData(
                            "audio/sp-midi")
private constructor        ()
            : super()
        {}


}
                
            

