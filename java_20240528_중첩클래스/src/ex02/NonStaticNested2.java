package ex02;


class SendMessage{
    private String msg;

    public sendMessage(String msg) {this.msg = msg;}
    public String getMsg() {
        return msg;
    }
}

class Network{

    public void sendMessage(String content) {
       SendMessage msg = new SendMessage(content);
       System.out.println(msg.getMsg());
    }
}

public class NonStaticNested2 {

    public static void main(String[] args) {
        Network net = new Network();
        
        net.message("전송할 데이터 입니다.");
    }
    
}