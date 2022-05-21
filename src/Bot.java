import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class Bot extends JFrame {

    private JTextArea Chatarea = new JTextArea();
    private JTextField chatbox = new JTextField();

    public Bot(){
        JFrame frame  = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.setSize(600,600);
        frame.setTitle("ChatBox");
        frame.add(Chatarea);
        frame.add(chatbox);

        Chatarea.setSize(500,400);
        Chatarea.setLocation(2,2);

        chatbox.setSize(540,30);
        chatbox.setLocation(2,500);

        chatbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = chatbox.getText().toLowerCase();
                Chatarea.append("YOU: "+ text+ "\n");
                chatbox.setText("");
                if(text.contains("hi"))
                {
                    bot("Hello!");
                }
                else if(text.contains("how"))
                {
                    bot("Everything is great!");
                }
                else if(text.contains("where"))
                {
                    bot("I am from Bangalore, India");
                }
                else
                {
                    int rand = (int)(Math.random() *3 +1);
                    if(rand == 1)
                    {
                        bot("I donot understand...");
                    }
                    else if(rand == 2)
                    {
                        bot("Can't tell you...Confidential!!!");
                    }
                    else
                    {
                        bot("Try again please.Can't understand you..");
                    }
                }

            }
        });
    }
    private void bot(String string)
    {
        Chatarea.append("Bot: "+string+"\n\n");
    }
    public static void main(String[] args) {
        new Bot();
    }
}
