package com.sov.anik;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

public class stepik {
        public static void main(String[] args) {
            byte[] s = "Ы".getBytes(StandardCharsets.UTF_8);
//            byte[] data = {65,13,10,13,10,13};
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
//            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(16);
//            changeDelimiter(inputStream, outputStream); // здесь ваша функция
//            byte [] out = outputStream.toByteArray();
//            for (byte b : out){
//                System.out.println(b);
//            }
            System.out.println(s[0]& 0xff);
            System.out.println(s[1]& 0xff);
            return;
        }

        public static void changeDelimiter(ByteArrayInputStream input, ByteArrayOutputStream outputStream){
            int previous = -1;
         //   try {
            int x = -1;
            do {
                x = input.read();

                //int x = System.in.read();

                if (x ==10) {
                    if (previous == 13){
                        outputStream.write(x);
                        //System.out.println(x);
                        previous = -1;
                    }
                    if (previous == -1){
                        previous = x;
                    }else {
                        outputStream.write(x);
                        System.out.println(x);
                        previous = x;
                    }

                }
                else {
                    if (previous == -1){
                        previous = x;
                    } else {
                        outputStream.write(previous);
                        System.out.println(previous);
                        previous = x;
                    }
                }

            } while (x > 0);
           // }
//            catch (IOException e){
//                System.out.flush();
//            }
        }

    }