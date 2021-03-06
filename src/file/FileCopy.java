package file;

import java.io.*;

/**
 * 项目名 Java_code
 * <br>包名 file
 * <br>创建时间 2020/4/1 21:29
 * <br>描述 文件拷贝
 *
 * @author Vigilr
 */
class FileUtil {
    private File srcFile;
    private File desFile;

    public FileUtil(String src, String des) {
        this(new File(src), new File(des));
    }

    public FileUtil(File src, File des) {
        this.srcFile = src;
        this.desFile = des;
    }

    public boolean copy() throws Exception {
        //源文件不存在
        if (!this.srcFile.exists()) {
            System.out.println("要拷贝的源文件不存在");
            return false;
        }
        //目标文件的父目录不存在
        if (!this.desFile.getParentFile().exists()) {
            this.desFile.getParentFile().mkdirs();
        }
        return copyFileImpl(this.srcFile, this.desFile);
    }

    public boolean copyDir() throws Exception {
        this.copyImpl(this.srcFile);
        try {
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void copyImpl(File file) throws Exception {
        if (file.isDirectory()) {
            File[] results = file.listFiles();
            if (results != null) {
                for (int i = 0; i < results.length; i++) {
                    copyImpl(results[i]);
                }
            }
        } else {
            String newFilePath = file.getPath().replace(this.srcFile.getPath() + File.separator, "");
            File newFile = new File(this.desFile, newFilePath);
            this.copyFileImpl(file, newFile);
            System.out.println(file + "\t" + newFile);
        }
    }

    public boolean copyFileImpl(File srcFile, File desFile) throws Exception {
        InputStream input = null;
        OutputStream output = null;
        try {
            input = new FileInputStream(this.srcFile);
            output = new FileOutputStream(this.desFile);
            input.transferTo(output);
            return true;
        } catch (IOException e) {
            throw e;
        } finally {
            if (input != null) {
                input.close();
            }
            if (output != null) {
                output.close();
            }
        }
    }
}

public class FileCopy {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("程序执行出错");
            System.exit(1);
        }
        long start = System.currentTimeMillis();
        FileUtil fileUtil = new FileUtil(args[0], args[1]);
        if (new File(args[0]).isFile()) {
            System.out.println(fileUtil.copy() ? "文件拷贝成功" : "文件拷贝失败");
        } else {
            fileUtil.copyDir();
        }
        long end = System.currentTimeMillis();
        System.out.println("程序执行时间：" + (end - start) + "ms");
    }
}
