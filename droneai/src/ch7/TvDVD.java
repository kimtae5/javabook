package ch7;

//class Tv {
//    boolean power;   // 전원 상태
//    int channel;     // 채널
//
//    void power() { power = !power; }
//    void channelUp() { ++channel; }
//    void channelDown() { --channel; }
//}

class DVD {   
    boolean power;      // DVD 전원 상태
    int counter = 0;
    void power() { power = !power; }
    void play() {}
    void stop() {}
    void rew() {}
    void ff() {}
    
}

class TvDVD extends Tv {
    public static void main(String[] args) {
        DVD dvd = new DVD();

        dvd.play();
        dvd.stop(); 
        dvd.rew(); 
        dvd.ff();
        
    }
}
