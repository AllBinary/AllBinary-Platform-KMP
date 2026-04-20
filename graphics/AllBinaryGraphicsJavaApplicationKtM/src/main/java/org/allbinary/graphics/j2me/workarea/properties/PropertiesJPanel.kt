
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
        package org.allbinary.graphics.j2me.workarea.properties




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.swing

open public class PropertiesJPanel : javax.swing.JPanel {
        
public constructor (){
initComponents()
}


    open fun set(panel: JPanel)
        //nullable = true from not(false or (false and false)) = true
{
var panel = panel
this.workAreaPropertiesJPanel!!.add(panel)
this.repaint()
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
this.workAreaPropertiesJPanel= javax.swing.JPanel()
this.modifierJPanel= javax.swing.JPanel()
this.copyVerticalJButton= javax.swing.JButton()
this.copyHorizontalJButton= javax.swing.JButton()
this.rotateJPanel= javax.swing.JPanel()
this.rotateJButton= javax.swing.JButton()
this.angleJTextField= javax.swing.JTextField()
this.jPanel7= javax.swing.JPanel()
this.upJButton= javax.swing.JButton()
this.downJButton= javax.swing.JButton()
this.jPanel8= javax.swing.JPanel()
this.leftJButton= javax.swing.JButton()
this.rightJButton= javax.swing.JButton()
setLayout(java.awt.GridLayout(2, 1))
this.workAreaPropertiesJPanel!!.setLayout(java.awt.GridLayout())
add(this.workAreaPropertiesJPanel)
this.modifierJPanel!!.setLayout(java.awt.GridLayout(6, 0))
this.copyVerticalJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
this.copyVerticalJButton!!.setText("Copy Vertical")
this.modifierJPanel!!.add(this.copyVerticalJButton)
this.copyHorizontalJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
this.copyHorizontalJButton!!.setText("Copy Horizontal")
this.modifierJPanel!!.add(this.copyHorizontalJButton)
this.rotateJPanel!!.setLayout(java.awt.GridLayout(1, 2))
this.rotateJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
this.rotateJButton!!.setText("Rotate")
this.rotateJPanel!!.add(this.rotateJButton)
this.angleJTextField!!.setText("Angle")
this.rotateJPanel!!.add(this.angleJTextField)
this.modifierJPanel!!.add(this.rotateJPanel)
this.jPanel7!!.setLayout(java.awt.GridLayout(1, 2))
this.upJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
this.upJButton!!.setText("Up")
this.jPanel7!!.add(this.upJButton)
this.downJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
this.downJButton!!.setText("Down")
this.jPanel7!!.add(this.downJButton)
this.modifierJPanel!!.add(this.jPanel7)
this.jPanel8!!.setLayout(java.awt.GridLayout(1, 2))
this.leftJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
this.leftJButton!!.setText("Left")
this.jPanel8!!.add(this.leftJButton)
this.rightJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
this.rightJButton!!.setText("Right")
this.jPanel8!!.add(this.rightJButton)
this.modifierJPanel!!.add(this.jPanel8)
add(this.modifierJPanel)
}


    private var rotateJButton: javax.swing.JButton

    private var copyVerticalJButton: javax.swing.JButton

    private var leftJButton: javax.swing.JButton

    private var rotateJPanel: javax.swing.JPanel

    private var angleJTextField: javax.swing.JTextField

    private var workAreaPropertiesJPanel: javax.swing.JPanel

    private var modifierJPanel: javax.swing.JPanel

    private var upJButton: javax.swing.JButton

    private var jPanel8: javax.swing.JPanel

    private var downJButton: javax.swing.JButton

    private var jPanel7: javax.swing.JPanel

    private var rightJButton: javax.swing.JButton

    private var copyHorizontalJButton: javax.swing.JButton

}
                
            

