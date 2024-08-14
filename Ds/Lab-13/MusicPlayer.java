// 75. Write a program to simulate music player application using suitable data structure. 
//There is no estimation about number of music files to be managed by the music player. 
//Your program should support all the basic music player operations to play and manage
// the playlist.

import java.util.*;

class MusicApp{
    class Playlist{
        String sname;
        String sowner;
        Playlist link;

        public Playlist(String song,String owner){
            this.sname = song;
            this.sowner = owner;
            this.link = null;
        }
    }
    Playlist first = null;

    public void addSong(String song,String owner){
        Playlist newSong = new Playlist(song,owner);
        if(first == null){
            first = newSong;
            return;
        }
        
        else{
            Playlist current = first;
            while(current.link != null){
                current = current.link;
            }
            current.link = newSong;
        }
        System.out.println("Song added");
    }

    public void showPlaylist(){
        if(first == null){
            System.out.println("No song Availabal");
            return;
        }
        System.out.println("Your playlist is:");
        Playlist current = first;
            while(current != null){
                System.out.print("-+->"+current.sname);
                System.out.println(" BY --"+current.sowner);
                current = current.link;
            }
        System.out.println("End of playlist");
    }
}

class MusicPlayer{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MusicApp ms = new MusicApp();
        boolean condi = true;

        while(condi){
            System.out.println("Enter 1.Add Song//2.Show playlist//3.Exit");
            int n = sc.nextInt();
            sc.nextLine();
            switch(n){
                case 1:
                    System.out.println("Enter song name:");
                    String song = sc.nextLine();
                    System.out.println("Enter song owner name:");
                    String owner = sc.nextLine();
                    ms.addSong(song,owner);
                    break;

                case 2:
                    ms.showPlaylist();
                    break;

                case 3:
                    condi = false;
                    break;
            }
        }
    }
}