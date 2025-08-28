
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
        package org.allbinary.game.layer




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class Aggression
            : Object
         {
        

    private var ram: Integer

    private var projectile: Integer

    private var drops: Integer
public constructor        (ram: Integer, projectile: Integer, drops: Integer)
            : super()
        

        Updates for KMP build        
        {
var ram = ram
var projectile = projectile
var drops = drops
this.setRam(ram)
this.setProjectile(projectile)
this.setDrops(drops)
}


open fun getRam()
        //nullable = true from not(false or (false and true)) = true
: Integer

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ram
}


open fun setRam(ram: Integer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var ram = ram
this.ram= ram
}


open fun getProjectile()
        //nullable = true from not(false or (false and true)) = true
: Integer

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return projectile
}


open fun setProjectile(projectile: Integer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var projectile = projectile
this.projectile= projectile
}


open fun getDrops()
        //nullable = true from not(false or (false and true)) = true
: Integer

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return drops
}


open fun setDrops(drops: Integer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var drops = drops
this.drops= drops
}


}
                
            

