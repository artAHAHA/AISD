package Task3_22.networkPrinter;

public class NetworkPrinter implements Comparable<NetworkPrinter> {
    public int time;
    public int pages;
    public int priority;
    public int identifier;

    public NetworkPrinter(int time, int pages, int priority, int identifier){
        this.time = time;
        this.pages = pages;
        this.priority = priority;
        this.identifier = identifier;
    }
    public int getTime(){
        return time;
    }
    public int getPages(){
        return pages;
    }
    public int getPriority(){
        return priority;
    }
    public int getIdentifier(){
        return identifier;
    }


    @Override
    public int compareTo(NetworkPrinter o) {
        if(this.priority != o.priority){
            return o.priority - this.priority;
        }
        if(this.time != o.time){
            return this.time - o.time;
        }
        return this.identifier - o.identifier;
    }
}
