
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
        package org.allbinary.graphics.j2me.dialog




        import java.lang.Object        
        
        import java.lang.Integer
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
                    
        
import org.allbinary.thread.ARunnable
import java.util.HashMap
import org.allbinary.gui.dialog.HashMapJDialogListenerInterface
import org.allbinary.logic.StdUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import java.awt.EventQueue
import java.awt.Frame
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.WindowAdapter
import java.awt.event.WindowEvent
import javax.swing.GroupLayout
import javax.swing.JButton
import javax.swing.JDialog
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JTextField
import javax.swing.LayoutStyle
import javax.swing.WindowConstants

open public class RotateJDialog : JDialog {
        
companion object {
            
    open fun main(args: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
{
var args = args
EventQueue.invokeLater(object: ARunnable()
                                {
                                
                                
    open fun run()
        //nullable = true from not(false or (false and true)) = true
{

    var dialog: RotateJDialog = RotateJDialog(JFrame(), true)

dialog.addWindowListener(object: WindowAdapter()
                                {
                                
                                
    open override fun windowClosing(e: WindowEvent)
        //nullable = true from not(false or (false and false)) = true
{
var e = e
System.exit(0)
}

                                }
                            )
dialog.setVisible(true)
}

                                }
                            )
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var hashMap: HashMap<Any, Any> = StdUtil.getInstance()!!.createHashMap()!!
public constructor (parent: Frame, modal: Boolean)                        

                            : super(parent, modal){
var parent = parent
var modal = modal


                            //For kotlin this is before the body of the constructor.
                    
this.initComponents()
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
angleIncrementJTextField= JTextField()
this.jLabel1= JLabel()
this.totalRotationJTextField= JTextField()
this.jLabel2= JLabel()
this.jPanel1= JPanel()
this.jButton1= JButton()
setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE)
this.angleIncrementJTextField!!.setText("36")
this.jLabel1!!.setText("Angle Increment:")
this.totalRotationJTextField!!.setText("360")
this.jLabel2!!.setText("Total Angular Rotation:")
this.jButton1!!.setText("OK")
this.jButton1!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
jButton1ActionPerformed(evt)
}

                                }
                            )

    var jPanel1Layout: GroupLayout = GroupLayout(this.jPanel1)

this.jPanel1!!.setLayout(jPanel1Layout)
jPanel1Layout!!.setHorizontalGroup(jPanel1Layout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(jPanel1Layout!!.createSequentialGroup()!!.addGap(62, 62, 62)!!.addComponent(jButton1)!!.addContainerGap(62, Short.MAX_VALUE)))
jPanel1Layout!!.setVerticalGroup(jPanel1Layout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addComponent(jButton1))

    var layout: GroupLayout = GroupLayout(getContentPane())

getContentPane()!!.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addContainerGap()!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)!!.addComponent(jLabel1)!!.addComponent(jLabel2))!!.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addComponent(totalRotationJTextField, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)!!.addComponent(angleIncrementJTextField, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))!!.addContainerGap())!!.addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addContainerGap()!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(angleIncrementJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel1))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(totalRotationJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel2))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)!!.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addContainerGap()))
pack()
}


    open fun jButton1ActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            this.hashMap!!.put(Integer(Integer.valueOf(0))Integer(Integer.valueOf(this.angleIncrementJTextField!!.getText())))
this.hashMap!!.put(Integer(Integer.valueOf(1))Integer(Integer.valueOf(this.totalRotationJTextField!!.getText())))
(this.getParent() as HashMapJDialogListenerInterface).onHashMap(this.hashMap)
this.setVisible(false)
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

this.logUtil!!.putF(commonStrings!!.EXCEPTION, this, "jButton1ActionPerformed")
}

}


    private var angleIncrementJTextField: JTextField

    private var jButton1: JButton

    private var jLabel1: JLabel

    private var jLabel2: JLabel

    private var jPanel1: JPanel

    private var totalRotationJTextField: JTextField

}
                
            

