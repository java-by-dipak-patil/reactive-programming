package com.dps.reactive_programming;

import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class ReactiveProgramm {


    private Mono<String>  testMono()
    {
        return Mono.just("Hello World")
                .log();
    }


    private Flux<String > testFlux()
    {
        List<String> list=List.of("Dipak","Nar","dadad","tatya");

        return Flux.fromIterable(list);
    }

    public static void main(String[] args) {

        ReactiveProgramm reactiveProgramm=new ReactiveProgramm();
         //reactiveProgramm.testMono().subscribe(data->System.out.println(data));

         reactiveProgramm.testFlux().subscribe(data-> System.out.println(data));



    }



}
