package com.fasade.Classes;

class Screenwriter{
    public void CreateScenario(){
        System.out.println("Сценарист написал сценарий.");
    }
}

class  Actor{
    public void PlayRole(){
        System.out.println("Актёр сыграл роль.");
    }
}

class FilmDirector{
    public  void FilmAScene(){
        System.out.println("Режиссёр снял сцены.");
    }
}

class VideoEditor{
    public void MakeEffects(){
        System.out.println("Видеомантажёр наложил спецэффекты.");
    }
}

class Producer{
    public void ReleaseMovie(){
        System.out.println("Продюссер выпустил фильм в прокат.");
    }
}

public class Film {

    public void CreateFilm(){
        Screenwriter screenwriter = new Screenwriter();
        Actor actor = new Actor();
        FilmDirector filmDirector = new FilmDirector();
        VideoEditor videoEditor = new VideoEditor();
        Producer producer = new Producer();

        screenwriter.CreateScenario();
        actor.PlayRole();
        filmDirector.FilmAScene();
        videoEditor.MakeEffects();
        producer.ReleaseMovie();

    }
}
