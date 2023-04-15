package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Boga");
        produto.setDescricao("Algo muito bom");
        produto.setPreco(700.0);

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("devinphilips");

        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();
        em.persist(produto);
        em.getTransaction().commit();
        em.close();
    }
}