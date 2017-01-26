package misc;

import java.text.NumberFormat;

import org.springframework.beans.propertyeditors.CustomNumberEditor;

public class CustomPrimitiveNumberEditor extends CustomNumberEditor {
	private final boolean allowEmpty;
	public CustomPrimitiveNumberEditor(Class<? extends Number> numberClass,
			NumberFormat numberFormat, boolean allowEmpty) throws IllegalArgumentException {
		super(numberClass, numberFormat, allowEmpty);

<<<<<<< HEAD
=======
		System.out.println("Happy New Year");
		System.out.println("Happy New Year");

>>>>>>> branch 'master' of https://github.com/EEIT91Team4/RemoteRepository0126.git
		this.allowEmpty = allowEmpty;
	}
	public CustomPrimitiveNumberEditor(Class<? extends Number> numberClass,
			boolean allowEmpty)	throws IllegalArgumentException {
		this(numberClass, null, allowEmpty);
	}
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if((text != null && text.trim().length() != 0) || (allowEmpty==false)) {
			super.setAsText(text);
		} else {
			setValue(0);
		}
	}
}
