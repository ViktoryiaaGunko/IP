//считка и запись в файл
package com.example.semproj;

import java.io.File;
import java.io.IOException;

public interface ReadWriteFiles {
    String read(File file) throws IOException;
    void write(File file, String str) throws IOException;
}
