package week5;

public class week5 {
	
/*	private String name; 
    private ArrayList<Player> players = new ArrayList<Player>();
    private int maxSize = 16;
    
    public Team(String newName){
        this.name = newName; 
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String newName){
        this.name = newName; 
    }
    
    public void addPlayer(Player player){
        if(this.players.size()<this.maxSize){
            this.players.add(player);
        }
        
    }
    
    public void printPlayers(){
        for(Player player : this.players){
            System.out.println(player);
        }
    }
    
    public void setMaxSize(int newMaxSize){
        this.maxSize = newMaxSize;
    }
    
    public int size(){
       return this.players.size();
    }
    
    public int goals(){
        int totalGoals = 0;
        
        for(Player player : this.players){
            totalGoals = totalGoals + player.goals();
        }
        
        return totalGoals; 
    }
    
}

}  */


 /* public class Player {
    private String name; 
    private int numberOfGoals; 
    
    public Player(String newName){
        this.name = newName; 
    }
    
     public Player(String newName, int newNumberOfGoals){
        this.name = newName; 
        this.numberOfGoals = newNumberOfGoals;
    }
     
     public String getName(){
         return this.name;
     }
     
     public int goals(){
        
         return this.numberOfGoals;
     }
     
     public String toString(){
         return "Player: " +  this.name + " goals: " + this.numberOfGoals;
     }
} */
	
/* public static void main(String[] args) {
        // TODO code application logic here
        Team barcelona = new Team("FC Barcelona");
        System.out.println("Team: " + barcelona.getName());
        
        System.out.println("===================");
        
        barcelona.setName("Real Madrid");
        System.out.println("Team: " + barcelona.getName());
        
        System.out.println("===================");
        
        Player brian = new Player("Brian");
        System.out.println(brian);
        Player pekka = new Player("Pekka", 39);
        System.out.println(pekka);
        
        System.out.println("===================");
        
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1));
        
        barcelona.printPlayers();
        
       /* System.out.println("===================");
        
        barcelona.setMaxSize(1);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1));
        barcelona.printPlayers();
        System.out.println("Number of players: " + barcelona.size());*/
        
       System.out.println("===================");
       
       System.out.println("Number of goals: " + barcelona.goals());
    }
    
} */
