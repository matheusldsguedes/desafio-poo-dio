package br.com.dio.desafio.domain;

import java.util.*;

public class Dev {
    private String name;
    private Set<Content> registeredContents = new LinkedHashSet<>();
    private Set<Content> completedContents = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getRegisteredContents() {
        return registeredContents;
    }

    public void setRegisteredContents(Set<Content> registeredContents) {
        this.registeredContents = registeredContents;
    }

    public Set<Content> getCompletedContents() {
        return completedContents;
    }

    public void setCompletedContents(Set<Content> completedContents) {
        this.completedContents = completedContents;
    }

    public void registerBootcamp(Bootcamp bootcamp){
        this.registeredContents.addAll(bootcamp.getContents());
        bootcamp.getRegisteredDevs().add(this);
    }

    public void progress(){
        Optional<Content> content = this.registeredContents.stream().findFirst();
        if(content.isPresent()){
            this.completedContents.add(content.get());
            this.registeredContents.remove(content.get());
        }else{
            System.err.println("You are not enrolled in any content.");
        }
    }

    public double calculateXP(){
        return this.completedContents
                .stream()
                .mapToDouble(Content::calculateXp)
                .sum();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(registeredContents, dev.registeredContents) && Objects.equals(completedContents, dev.completedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, registeredContents, completedContents);
    }
}
