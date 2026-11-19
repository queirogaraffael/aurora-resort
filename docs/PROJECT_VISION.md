# Visão do Projeto e Arquitetura

Este documento consolida o propósito de negócio, os módulos do sistema e a estratégia arquitetural adotada para a plataforma hoteleira.

---

## 1. Visão do Produto

O **Aurora Resort** é uma plataforma integrada de gestão e reservas voltada para a hotelaria de experiência. 

O sistema foi desenhado para atender dois pilares essenciais:

### Módulo Administrativo (Operação e Gestão)
Focado no dia a dia da equipe do hotel (recepção, governança e gerência):
* Controle do inventário de acomodações e disponibilidade em tempo real.
* Gestão de reservas (check-in, check-out, cancelamentos e histórico).
* Cadastro e gestão de hóspedes e funcionários.
* Garantia de integridade para evitar conflitos de datas e overbooking.

### Módulo Público (Experiência do Hóspede)
Focado no hóspede que deseja conhecer o hotel e reservar sua estadia:
* Apresentação visual e detalhada das acomodações, ambientes e serviços oferecidos.
* Busca interativa e inteligente por linguagem natural, permitindo que o hóspede encontre a acomodação ideal descrevendo suas preferências, estilo de viagem ou necessidades específicas.

---

## 2. Estratégia de Arquitetura

O backend adota os princípios da **Arquitetura Hexagonal (Ports & Adapters)**, mantendo as regras de negócio e os casos de uso no núcleo da aplicação, completamente desacoplados de bibliotecas externas, frameworks web e mecanismos de persistência.

```
       +---------------------------------------------+
       |             Adaptadores de Entrada          |
       |               (Web / Controllers)           |
       +----------------------+----------------------+
                              |
                              v
       +---------------------------------------------+
       |             Portas de Entrada (In)          |
       +----------------------+----------------------+
                              |
                              v
       +---------------------------------------------+
       |             Casos de Uso / Domínio          |
       |                (Core de Negócio)            |
       +----------------------+----------------------+
                              |
                              v
       +---------------------------------------------+
       |             Portas de Saída (Out)           |
       +----------------------+----------------------+
                              |
               +--------------+--------------+
               |                             |
               v                             v
+-------------------------------+ +-------------------------------+
|      Adaptador PostgreSQL     | |       Adaptador MongoDB       |
|    (Transações e Operação)    | | (Catálogo Rico & Busca IA)    |
+-------------------------------+ +-------------------------------+
```

---

## 3. Persistência Poliglota: O Papel de Cada Banco

Para atender com excelência tanto a operação crítica quanto a busca semântica, o sistema utiliza dois bancos de dados com responsabilidades bem definidas:

### PostgreSQL (Consistência Transacional)
* **Objetivo:** Garantir integridade relacional, consistência ACID e histórico auditável.
* **Dados armazenados:**
  * Reservas e bloqueios de datas (prevenção rigorosa de conflitos).
  * Usuários, perfis, credenciais e controle de acessos.
  * Hóspedes, funcionários e histórico financeiro/extratos.

### MongoDB Atlas (Catálogo Flexível e Busca Semântica)
* **Objetivo:** Oferecer consultas de alta performance em documentos ricos e busca semântica avançada com inteligência artificial.
* **Dados e capacidades:**
  * Catálogo de acomodações, comodidades, descrições detalhadas e experiências do hotel.
  * Vetores numéricos (embeddings) gerados a partir do conteúdo textual das acomodações.
  * **Atlas Vector Search:** Permite a busca semântica (linguagem natural), onde a intenção do hóspede é comparada matematicamente com as propostas de cada quarto/experiência.

---

## 4. Tecnologias Principais

* **Backend:** Java 17, Spring Boot 3, Spring Security, JWT, JPA/Hibernate, Spring Data MongoDB.
* **Frontend:** Next.js, React, TypeScript, Tailwind CSS.
* **Bancos de Dados:** PostgreSQL 16 e MongoDB Atlas.
* **Infraestrutura:** Docker, Docker Compose, GitHub Actions (CI/CD com Gradle).
