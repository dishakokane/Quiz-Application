package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Python extends JFrame implements ActionListener {

    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, lifeline;

    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;

    String name;
    public Python(String name) {

        this.name = name;
        setBounds(50, 0, 1440, 850);
        getContentPane().setBackground(Color.WHITE);
        setUndecorated(true);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1440, 392);
        add(image);

        qno = new JLabel();
        qno.setBounds(100, 450, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);

        question = new JLabel();
        question.setBounds(150, 450, 900, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(question);

        questions[0][0] = "What is the maximum possible length of an identifier?";
        questions[0][1] = "16";
        questions[0][2] = "32";
        questions[0][3] = "64";
        questions[0][4] = "None of these";

        questions[1][0] = "Who developed the python language?";
        questions[1][1] = "Zim den";
        questions[1][2] = "Guide van Rossum";
        questions[1][3] = "Niene Stom";
        questions[1][4] = "Wick van Rossum";

        questions[2][0] = "In which yesr was the Python language developed?";
        questions[2][1] = "1995";
        questions[2][2] = "1972";
        questions[2][3] = "1981";
        questions[2][4] = "1989";

        questions[3][0] = "Which onw of the following is the correct extension of the Python file?";
        questions[3][1] = ".py";
        questions[3][2] = ".python";
        questions[3][3] = ".p";
        questions[3][4] = "None of these";

        questions[4][0] = "What do we use to define a block of code in python language?";
        questions[4][1] = "key";
        questions[4][2] = "Brackets";
        questions[4][3] = "Indentation";
        questions[4][4] = "None of these";

        questions[5][0] = "Which chaacter is used in python to make single line comment?";
        questions[5][1] = "/";
        questions[5][2] = "//";
        questions[5][3] = "#";
        questions[5][4] = "!";

        questions[6][0] = "What is the method inside the class in python language?";
        questions[6][1] = "Object";
        questions[6][2] = "Function";
        questions[6][3] = "Attribute";
        questions[6][4] = "Argument";

        questions[7][0] = "Which of the following is not a keyword in Python language?";
        questions[7][1] = "Val";
        questions[7][2] = "raise";
        questions[7][3] = "try";
        questions[7][4] = "with";

        questions[8][0] = "Which of the following words cannot be a variable in python language?";
        questions[8][1] = "_val";
        questions[8][2] = "val";
        questions[8][3] = "try";
        questions[8][4] = "_try_";

        questions[9][0] = "Which keyword is used for function in python language?";
        questions[9][1] = "Function";
        questions[9][2] = "def";
        questions[9][3] = "Fun";
        questions[9][4] = "Define";

        answers[0][1] = "None of these";
        answers[1][1] = "Guido van Rossum";
        answers[2][1] = "1989";
        answers[3][1] = ".py";
        answers[4][1] = "Indentation";
        answers[5][1] = "#";
        answers[6][1] = "Function";
        answers[7][1] = "Val";
        answers[8][1] = "try";
        answers[9][1] = "def";

        opt1 = new JRadioButton();
        opt1.setBounds(170, 520, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(170, 560, 700, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(170, 600, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(170, 640, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);

        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);

        next = new JButton("Next");
        next.setBounds(700, 750, 200, 30);
        next.setFont(new Font("Tahoma", Font.PLAIN, 18));
        next.setBackground(new Color(22, 99, 54));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        lifeline = new JButton("Help");
        lifeline.setBounds(930, 750, 200, 30);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lifeline.setBackground(new Color(22, 99, 54));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);

        submit = new JButton("Submit");
        submit.setBounds(1150, 750, 200, 30);
        submit.setForeground(Color.BLACK);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 18));
        submit.setBackground(new Color(255, 215, 0));

        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);

        start(count);

        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            count++;
            start(count);
        } else if (ae.getSource() == lifeline) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new quiz.app.Score(name, score);
        }


    }

    public void paint(Graphics g) {
        super.paint(g);

        String time = "Time left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));

        if (timer > 0) {
            g.drawString(time, 1100, 500);
        } else {
            g.drawString("Times up!!", 1100, 500);
        }

        timer--; // 14

        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                if (groupoptions.getSelection() == null) {
                    useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }

                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i][0].equals(answers[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new quiz.app.Score(name, score);
            } else { // next button
                if (groupoptions.getSelection() == null) {
                    useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
        }

    }

    public void start(int count) {
    qno.setText("" + (count + 1) + ". ");
    question.setText(questions[count][0]);
    opt1.setText(questions[count][1]);
    opt1.setActionCommand(questions[count][1]);

    opt2.setText(questions[count][2]);
    opt2.setActionCommand(questions[count][2]);

    opt3.setText(questions[count][3]);
    opt3.setActionCommand(questions[count][3]);

    opt4.setText(questions[count][4]);
    opt4.setActionCommand(questions[count][4]);

    groupoptions.clearSelection();
}

    public static void main(String[]args){

        new Python("User");
    }
}
