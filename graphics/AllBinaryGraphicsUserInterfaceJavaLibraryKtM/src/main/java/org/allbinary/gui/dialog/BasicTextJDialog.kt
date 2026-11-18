
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
        package org.allbinary.gui.dialog




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
                    
        
import org.allbinary.thread.ARunnable
import java.awt.EventQueue
import java.awt.Frame
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.GroupLayout
import javax.swing.JButton
import javax.swing.JDialog
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.WindowConstants

open public class BasicTextJDialog : JDialog {
        
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
BasicTextJDialog(JFrame(), true, "Test").
                            setVisible(true)
}

                                }
                            )
}


        }
            
    private var closeListenerInterface: CloseJDialogListenerInterface
public constructor (parent: Frame, modal: Boolean, text: String)                        

                            : super(parent, modal){
var parent = parent
var modal = modal
var text = text


                            //For kotlin this is before the body of the constructor.
                    
this.initComponents()
this.setText(text)
}


    open fun setText(text: String)
        //nullable = true from not(false or (false and false)) = true
{
var text = text
this.textJLabel!!.setText(text)
}


    open fun addCloseListener(closeListenerInterface: CloseJDialogListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{
var closeListenerInterface = closeListenerInterface
this.closeListenerInterface= closeListenerInterface
}

public constructor (text: String){
var text = text
this.initComponents()
this.textJLabel!!.setText(text)
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
this.jButton1= JButton()
this.textJLabel= JLabel()
setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE)
this.jButton1!!.setText("OK")
jButton1!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
jButton1ActionPerformed(evt)
}

                                }
                            )
this.textJLabel!!.setText("No Text Set")

    var layout: GroupLayout = GroupLayout(getContentPane())

getContentPane()!!.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addGap(80, 80, 80)!!.addComponent(jButton1))!!.addGroup(layout.createSequentialGroup()!!.addContainerGap()!!.addComponent(textJLabel, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))!!.addContainerGap()))
layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addGap(20, 20, 20)!!.addComponent(textJLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)!!.addGap(30, 30, 30)!!.addComponent(jButton1)))
pack()
}


    open fun jButton1ActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.setVisible(false)

    
                        if(this.closeListenerInterface != 
                                    null
                                )
                        
                                    {
                                    this.closeListenerInterface!!.onClose()

                                    }
                                
}


    private var jButton1: JButton

    private var textJLabel: JLabel

}
                
            

