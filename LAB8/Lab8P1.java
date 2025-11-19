import java.awt.event.*;
import java.awt.*;

class Lab8P1 extends Frame implements ActionListener{
	Label l;
	Lab8P1(){
		super("Demonstation of the Menubar");
		BorderLayout bl=new BorderLayout();
		l =new Label();
		l.setFont(new Font("Arial",Font.BOLD,40));
		//l.setBounds(150,200,200,300);
		add(l,bl.CENTER);
		l.setAlignment(l.CENTER);
		MenuBar mb =new MenuBar();
		setLayout(bl);
		setMenuBar(mb);
		String[] menus={"File","Edit","Help"};
		String[][] mi={{"Open","Save","Close"},
				{"Cut","Copy","Paste"},
				{"About","Update","License"}};
		int x=0,y = 0;
		for(String s:menus){
			y=0;
			Menu m = new Menu(s);
			s=s.toLowerCase();
			for(int i=0;i<3;i++){
				MenuItem mmi=new MenuItem(mi[x][y]);
				mmi.addActionListener(this);
				m.add(mmi);
				y++;	
			} 
			x++;
			mb.add(m);
		}	
		//mb.add(new Menu("File"));
		//mb.add(new Menu("Edit"));
		//mb.add(new Menu("Help"));

		setSize(400,400);
		setVisible(true);
		addWindowListener(
		new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				dispose();
			}	
		});
	}
	public void actionPerformed(ActionEvent ae){
		String mstr=ae.getActionCommand();
		if(mstr.equals("Close")){
			System.exit(0);
		}else{
			l.setText(mstr);
		}
	}
	public static void main(String...args){
		new Lab8P1();
	}
	
}

