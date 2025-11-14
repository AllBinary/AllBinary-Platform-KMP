
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
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class RotateJDialog : javax.swing.JDialog {
        
companion object {
            
    open fun main(args: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
{
var args = args
java.awt.EventQueue.invokeLater(object: ARunnable()
                                {
                                
    open fun run()
        //nullable = true from not(false or (false and true)) = true
{

    var dialog: RotateJDialog = RotateJDialog(javax.swing.JFrame(), true)

dialog.addWindowListener(object: java.awt.event.WindowAdapter()
                                {
                                
    open override fun windowClosing(e: java.awt.event.WindowEvent)
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

    private var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()
public constructor (parent: java.awt.Frame, modal: Boolean)                        

                            : super(parent, modal){
var parent = parent
var modal = modal


                            //For kotlin this is before the body of the constructor.
                    
initComponents()
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
angleIncrementJTextField= javax.swing.JTextField()
jLabel1= javax.swing.JLabel()
totalRotationJTextField= javax.swing.JTextField()
jLabel2= javax.swing.JLabel()
jPanel1= javax.swing.JPanel()
jButton1= javax.swing.JButton()
setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE)
angleIncrementJTextField!!.setText("36")
jLabel1!!.setText("Angle Increment:")
totalRotationJTextField!!.setText("360")
jLabel2!!.setText("Total Angular Rotation:")
jButton1!!.setText("OK")
jButton1!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
jButton1ActionPerformed(evt)
}

                                }
                            )

    var jPanel1Layout: javax.swing.GroupLayout = javax.swing.GroupLayout(jPanel1)

jPanel1!!.setLayout(jPanel1Layout)
jPanel1Layout!!.setHorizontalGroup(jPanel1Layout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(jPanel1Layout!!.createSequentialGroup()!!.addGap(62, 62, 62)!!.addComponent(jButton1)!!.addContainerGap(62, Short.MAX_VALUE)))
jPanel1Layout!!.setVerticalGroup(jPanel1Layout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(jButton1))

    var layout: javax.swing.GroupLayout = javax.swing.GroupLayout(getContentPane())

getContentPane()!!.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addContainerGap()!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)!!.addComponent(jLabel1)!!.addComponent(jLabel2))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(totalRotationJTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)!!.addComponent(angleIncrementJTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addContainerGap())!!.addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addContainerGap()!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(angleIncrementJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel1))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(totalRotationJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel2))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)!!.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addContainerGap()))
pack()
}


    open fun jButton1ActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            hashMap!!.put(Integer(Integer.valueOf(0))Integer(Integer.valueOf(this.angleIncrementJTextField!!.getText())))
hashMap!!.put(Integer(Integer.valueOf(1))Integer(Integer.valueOf(this.totalRotationJTextField!!.getText())))
getParent = this.getParent()getParent as HashMapJDialogListenerInterface
getParent.
                    onHashMap(hashMap)
this.setVisible(false)
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, "jButton1ActionPerformed")
}

}


    private var angleIncrementJTextField: javax.swing.JTextField

    private var jButton1: javax.swing.JButton

    private var jLabel1: javax.swing.JLabel

    private var jLabel2: javax.swing.JLabel

    private var jPanel1: javax.swing.JPanel

    private var totalRotationJTextField: javax.swing.JTextField

}
                
            

