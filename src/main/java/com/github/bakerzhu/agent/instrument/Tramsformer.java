package com.github.bakerzhu.agent.instrument;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

/**
 * @Description
 * @auther bozhu
 * @create 12\ 24\ 2018
 */
public class Tramsformer implements ClassFileTransformer {
    public static final String classNumberReturn2 = "TransClass.class.2";
    public static byte[] getBytesFromFile(String fileName) {
        try {
            File file = new File(fileName);
            FileInputStream fis = new FileInputStream(file);
            long length = file.length();
            byte[] bytes = new byte[(int)length];

            // Read in the bytes
            int offset = 0;
            int numRead = 0;
            while(offset < bytes.length && (numRead = fis.read(bytes,offset,bytes.length - offset)) >=0) {
                offset += numRead;
            }
            if(offset < bytes.length) {
                throw new IOException("Could not completely read file "
                        + file.getName());
            }

            fis.close();
            return bytes;

        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;
    }

    /**
     * 参数：
     * loader - 定义要转换的类加载器；如果是引导加载器，则为 null
     * className - 完全限定类内部形式的类名称和 The Java Virtual Machine Specification 中定义的接口名称。例如，"java/util/List"。
     * classBeingRedefined - 如果是被重定义或重转换触发，则为重定义或重转换的类；如果是类加载，则为 null
     * protectionDomain - 要定义或重定义的类的保护域
     * classfileBuffer - 类文件格式的输入字节缓冲区（不得修改）
     * 返回：
     * 一个格式良好的类文件缓冲区（转换的结果），如果未执行转换,则返回 null。
     * 抛出：
     * IllegalClassFormatException - 如果输入不表示一个格式良好的类文件
     */

    @Override
    public byte[] transform(ClassLoader loader, String className,
                            Class<?> classBeingRedefined, ProtectionDomain protectionDomain,
                            byte[] classfileBuffer) throws IllegalClassFormatException {
        if(!className.equals("TransClass")) {
            return null;
        }
        return getBytesFromFile(classNumberReturn2);
    }
}
