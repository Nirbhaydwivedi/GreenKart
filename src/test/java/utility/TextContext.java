package utility;

import pageObject.PageObjectManager;

import java.io.IOException;

public class TextContext {
    public PageObjectManager pom;
    public BaseClass driverClass;
    public GuiUtils gutil;

    public TextContext() throws IOException {
        driverClass=new BaseClass();
        pom=new PageObjectManager(driverClass.implementBaseClass());
        gutil=new GuiUtils(driverClass.implementBaseClass());
    }
}
