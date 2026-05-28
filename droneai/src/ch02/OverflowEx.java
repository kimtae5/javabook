package ch02;

class OverflowEx {
    public static void main(String[] args) {
        short sMin = -32768;   // short 최소값
        short sMax = 32767;    // short 최대값
        char cMin = 0;         // char 최소값
        char cMax = 65535;     // char 최대값

        System.out.println("sMin  = " + sMin);
        System.out.println("sMin-1 = " + (short)(sMin-1)); // 오버플로우
        System.out.println("sMax  = " + sMax);
        System.out.println("sMax+1 = " + (short)(sMax+1)); // 오버플로우

        System.out.println("cMin  = " + (int)cMin);
        System.out.println("cMin-1 = " + (int)--cMin);     // 언더플로우
        System.out.println("cMax  = " + (int)cMax);
        System.out.println("cMax+1 = " + (int)++cMax);     // 오버플로우
    }
}

