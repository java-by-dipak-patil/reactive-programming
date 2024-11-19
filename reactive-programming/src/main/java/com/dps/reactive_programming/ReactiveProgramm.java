package com.dps.reactive_programming;

import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;
import java.util.Locale;

public class ReactiveProgramm {


    private Mono<String>  testMono()
    {
        return Mono.just("Hello World")
                .log();
    }


    private Flux<String > testFlux()
    {
        List<String> list=List.of("Dipak","Nar","dadad","tatya");

        Flux<Integer> integerFlux=Flux.range(1,20);
        Flux<Integer> filter = integerFlux.filter(i -> i % 2 == 0);
       filter.subscribe(System.out::println);
        return Flux.fromIterable(list);
    }


    private Flux<String> textmap()
    {
        List<String> list=List.of("Dipak","Nar","dadad","tatya");
        Flux<String> flux=Flux.just("Dipak","Nar","dadad","tatya");
        return  flux.map(s->s.toUpperCase(Locale.ROOT));
    }

    private Flux<String> testFlatMap()
    {
        List<String> list=List.of("Dipak","Nar","dadad","tatya");
        Flux<String> flux=Flux.just("Dipak","Nar","dadad","tatya");
        return  flux.flatMap(s->Mono.just(s.toUpperCase(Locale.ROOT)));
    }

    private Flux<String> testSkip()
    {

        Flux<String> flux=Flux.just("Dipak","Nar","dadad","tatya");
        return  flux.skip(2);
    }

    private Flux<String> testDelay()
    {

        Flux<String> flux=Flux.just("Dipak","Nar","dadad","tatya");
        return  flux.delayElements(Duration.ofSeconds(1));
    }

    public static void main(String[] args) throws InterruptedException {

        ReactiveProgramm reactiveProgramm=new ReactiveProgramm();
         //reactiveProgramm.testMono().subscribe(data->System.out.println(data));

        // reactiveProgramm.testFlux().subscribe(data-> System.out.println(data));

       // reactiveProgramm.textmap().subscribe(System.out::println);

        //reactiveProgramm.testFlatMap().subscribe(System.out::println);

       // reactiveProgramm.testSkip() .subscribe(System.out::println);

        /*reactiveProgramm.testDelay() .subscribe(System.out::println);
        Thread.sleep(100000);*/


    }



}
