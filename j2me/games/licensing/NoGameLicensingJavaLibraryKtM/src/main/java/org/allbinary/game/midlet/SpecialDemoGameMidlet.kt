
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
        package org.allbinary.game.midlet




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.system.security.licensing.ClientInformationFactory
import org.allbinary.logic.system.security.licensing.LicenseServerInitFileUtil
import org.allbinary.thread.RunnableInterface

open public class SpecialDemoGameMidlet : DemoGameMidlet {
        
public constructor (clientInformationFactory: ClientInformationFactory, licenseLoadingType: LicenseLoadingType)                        

                            : super(clientInformationFactory){
    //var clientInformationFactory = clientInformationFactory
    //var licenseLoadingType = licenseLoadingType


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor (clientInformationFactory: ClientInformationFactory, licenseLoadingType: LicenseLoadingType, demoSetup: DemoSetup, licenseCheckRunnable: RunnableInterface)                        

                            : super(clientInformationFactory){
    //var clientInformationFactory = clientInformationFactory
    //var licenseLoadingType = licenseLoadingType
    //var demoSetup = demoSetup
    //var licenseCheckRunnable = licenseCheckRunnable


                            //For kotlin this is before the body of the constructor.
                    
}


    open fun initView()
        //nullable = true from not(false or (false and true)) = true
{
}


    override fun preInit()
        //nullable = true from not(false or (false and true)) = true
{
LicenseServerInitFileUtil().
                            init()
}


}
                
            

