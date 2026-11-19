# Roadmap do Projeto

Este documento apresenta o planejamento das etapas de desenvolvimento do sistema, organizadas em fases lógicas e incrementais.

---

## Status Geral: Em Desenvolvimento Ativo

---

## Fases de Desenvolvimento

### Fase 1: Fundações e Infraestrutura (Concluída)
* [x] Arquitetura Hexagonal estruturada no backend (Spring Boot 3 + Java 17).
* [x] Regras de domínio e portas para Hóspedes, Quartos, Reservas e Funcionários.
* [x] Autenticação stateless via tokens JWT e controle de permissões.
* [x] Pipeline de CI/CD automatizado no GitHub Actions (build e testes com Gradle).
* [x] Ambiente de contêineres orquestrado via Docker Compose (PostgreSQL, Backend e Frontend).
* [x] Políticas de CORS e perfis de ambiente (.env / .env.example) configurados.

---

### Fase 2: Catálogo & Busca Inteligente (Próxima Etapa)
* [ ] Enriquecimento do modelo de acomodações com informações descritivas e comodidades.
* [ ] Configuração do adaptador para MongoDB Atlas no backend.
* [ ] Integração do serviço de geração de embeddings a partir do conteúdo das acomodações.
* [ ] Configuração do índice de busca vetorial (`$vectorSearch`) no MongoDB Atlas.
* [ ] Criação de endpoints públicos de busca inteligente para o portal de hóspedes.

---

### Fase 3: Portal do Hóspede (Frontend)
* [ ] Construção do layout e identidade visual do hotel/resort no Next.js.
* [ ] Interface de exploração e visualização das acomodações e comodidades.
* [ ] Barra de busca semântica em linguagem natural conectada ao endpoint inteligente.
* [ ] Fluxo visual de consulta de disponibilidade e simulação de reserva.

---

### Fase 4: Painel Administrativo Completo
* [ ] Interface administrativa para a equipe de recepção e governança.
* [ ] Gestão visual do status dos quartos (ocupado, disponível, manutenção).
* [ ] Painel de gerenciamento de reservas (criação, check-in, check-out e cancelamento).
* [ ] Cadastro e consulta de hóspedes e funcionários.
