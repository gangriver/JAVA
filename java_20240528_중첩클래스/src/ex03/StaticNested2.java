package ex03;

class Network{

    public void sendMessage(String content) {
       
        // SendMessage msg = new SendMessage(content);
        // System.out.println(msg.getMsg());

        Network.SendMessage msg = new Network.SendMessage(content);
        System.out.println(msg.getMsg());
    }

    private static class SendMessage{
        private String msg;
    
        public sendMessage(String msg) {this.msg = msg;}
        
        public String getMsg() {
            return msg;
        }
    }
}
public class StaticNested2 {
    public static void main(String[] args) {
        
        network net = new Network();
        net.message("전송할 데이터 입니다.");

    }
}
