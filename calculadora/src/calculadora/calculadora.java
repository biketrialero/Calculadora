package calculadora;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class calculadora {
	private static Text text;
	public static double nr1;
	public static double nr2;
	public static String op;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shlCalculator = new Shell();
		shlCalculator.setSize(242, 320);
		shlCalculator.setText("Calculator");

		Button b1 = new Button(shlCalculator, SWT.NONE);
		b1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (text.getText().equals("0")) {
					text.setText("1");
				} else
					text.setText(text.getText() + "1");
			}
		});
		b1.setBounds(10, 150, 40, 40);
		b1.setText("1");

		Button b2 = new Button(shlCalculator, SWT.NONE);
		b2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (text.getText().equals("0")) {
					text.setText("2");
				} else
					text.setText(text.getText() + "2");
			}
		});
		b2.setBounds(56, 150, 40, 40);
		b2.setText("2");

		Button b3 = new Button(shlCalculator, SWT.NONE);
		b3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (text.getText().equals("0")) {
					text.setText("3");
				} else
					text.setText(text.getText() + "3");
			}
		});
		b3.setBounds(102, 150, 40, 40);
		b3.setText("3");

		Button b4 = new Button(shlCalculator, SWT.NONE);
		b4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (text.getText().equals("0")) {
					text.setText("4");
				} else
					text.setText(text.getText() + "4");
			}
		});
		b4.setBounds(10, 104, 40, 40);
		b4.setText("4");

		Button b5 = new Button(shlCalculator, SWT.NONE);
		b5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (text.getText().equals("0")) {
					text.setText("5");
				} else
					text.setText(text.getText() + "5");
			}
		});
		b5.setBounds(56, 104, 40, 40);
		b5.setText("5");

		Button b6 = new Button(shlCalculator, SWT.NONE);
		b6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (text.getText().equals("0")) {
					text.setText("6");
				} else
					text.setText(text.getText() + "6");
			}
		});
		b6.setBounds(102, 104, 40, 40);
		b6.setText("6");

		Button b7 = new Button(shlCalculator, SWT.NONE);
		b7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (text.getText().equals("0")) {
					text.setText("7");
				} else
					text.setText(text.getText() + "7");
			}
		});
		b7.setBounds(10, 58, 40, 40);
		b7.setText("7");

		Button b8 = new Button(shlCalculator, SWT.NONE);
		b8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (text.getText().equals("0")) {
					text.setText("8");
				} else
					text.setText(text.getText() + "8");
			}
		});
		b8.setBounds(56, 58, 40, 40);
		b8.setText("8");

		Button b9 = new Button(shlCalculator, SWT.NONE);
		b9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (text.getText().equals("0")) {
					text.setText("9");
				} else
					text.setText(text.getText() + "9");
			}
		});
		b9.setBounds(102, 58, 40, 40);
		b9.setText("9");

		Button b0 = new Button(shlCalculator, SWT.NONE);
		b0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (text.getText().equals("0")) {
					text.setText("0");
				} else {
					text.setText(text.getText() + "0");
				}
			}
		});
		b0.setBounds(10, 196, 40, 40);
		b0.setText("0");

		Button equal = new Button(shlCalculator, SWT.NONE);
		equal.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				nr2 = Integer.parseInt(text.getText());
				if (op.equals("*")) {
					String r = Double.toString(nr1 * nr2);
					text.setText(r);
				} else if (op.equals("+")) {
					String r = Double.toString(nr1 + nr2);
					text.setText(r);
				} else if (op.equals("-")) {
					String r = Double.toString(nr1 - nr2);
					text.setText(r);
				} else if (op.equals("/") && (nr2 != 0)) {
					String r = Double.toString(nr1 / nr2);
					text.setText(r);
				} else {
					text.setText("Operacio incorrecta");
				}

			}
		});
		equal.setBounds(56, 196, 86, 40);
		equal.setText("=");

		Button div = new Button(shlCalculator, SWT.NONE);
		div.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				nr1 = Double.parseDouble(text.getText());
				text.setText("0");
				op = "/";
			}
		});
		div.setBounds(177, 58, 40, 40);
		div.setText("/");

		Button fact = new Button(shlCalculator, SWT.NONE);
		fact.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				nr1 = Double.parseDouble(text.getText());
				text.setText("0");
				op = "*";
			}
		});
		fact.setBounds(177, 104, 40, 40);
		fact.setText("*");

		Button suma = new Button(shlCalculator, SWT.NONE);
		suma.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				nr1 = Double.parseDouble(text.getText());
				text.setText("0");
				op = "+";
			}
		});
		suma.setBounds(177, 150, 40, 40);
		suma.setText("+");

		Button resta = new Button(shlCalculator, SWT.NONE);
		resta.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				nr1 = Double.parseDouble(text.getText());
				text.setText("0");
				op = "-";
			}
		});
		resta.setBounds(177, 196, 40, 40);
		resta.setText("-");

		text = new Text(shlCalculator, SWT.BORDER);
		text.setText("0");
		text.setBounds(10, 10, 207, 30);

		Button btnCE = new Button(shlCalculator, SWT.NONE);
		btnCE.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text.setText("0");
			}
		});
		btnCE.setBounds(10, 246, 207, 25);
		btnCE.setText("CE");

		shlCalculator.open();
		shlCalculator.layout();
		while (!shlCalculator.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
