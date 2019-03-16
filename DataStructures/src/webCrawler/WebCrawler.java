package webCrawler;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WebCrawler {

    private Queue<String> queue;
    private List<String> discoveredWebsitesList;
    
    public WebCrawler() {
        this.queue=new LinkedList<String>();
        this.discoveredWebsitesList=new ArrayList<String>();
    }
    
    private String readURL(String temp) {
        
        return null;
    }
    
    public void discoverWeb(String root) {
        this.queue.add(root);
        this.discoveredWebsitesList.add(root);
        
        while (!queue.isEmpty()) {
            
            String temp= this.queue.remove();
            String rawHtml = readURL(temp);
        }
    }
    
   
    public static void main(String[] args) {
   
    }

}
