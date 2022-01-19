package com.sov.anik;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class PdfMerge {


    public static void main(String[] args) throws Exception{
        InputStream inByte = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});

        System.out.println(readAsString(inByte, StandardCharsets.US_ASCII));

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        InputStreamReader c = new InputStreamReader(inputStream, charset);
        StringBuilder sb = new StringBuilder();
        int data;
        while((data = c.read()) != -1){
            char theChar = (char) data;
            //data = inputStream.read();
            sb.append(theChar);
        }

        return new String(sb.toString());
    }



}
